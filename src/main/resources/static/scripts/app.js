// adds a prefix to request path
$.ajaxPrefilter(function(options, originalOptions, jqXHR) {
    options.url = "http://localhost:8080/api/get" + options.url;
});

// used to serialize JavaScript objects
$.fn.serializeObject = function() {
    var o = {};
    var a = this.serializeArray();
    $.each(a, function() {
        if (o[this.name]) {
            if (!o[this.name].push) {
                o[this.name] = [o[this.name]];
            }
            o[this.name].push(this.value || "");
        } else {
            o[this.name] = this.value || "";
        }
    });
    return o;
};

// Currently represents the state's loan statistics
var StateLoanSummary = Backbone.Model.extend({
    urlRoot: "/state"
});

// home view, with no state selected
var HomeView = Backbone.View.extend({
    el: ".page", // template will be placed at page div
    render: function() {
        var template = _.template($("#home-template").html());
        this.$el.html(template());
        return false;
    }
});

// state view, creates html from template with the selected state's data
var StateView = Backbone.View.extend({
    el: ".page", // template will be placed at page div
    render: function(options) {
        console.log(options.id);
        var that = this;
        var stateLoanSummary = new StateLoanSummary({
            id: options.id
        });
        stateLoanSummary.fetch({ // will send GET request with the id: US-CA
            success: function(stateLoanSummary) {
                var template = _.template($("#state-template").html());
                that.$el.html(template(stateLoanSummary.toJSON()));
            }
        });
    }
})

var Router = Backbone.Router.extend({
    routes: {
        "": "homeView",
        "view/:id": "stateView"
    }
});

var homeView = new HomeView();

var stateView = new StateView();

var router = new Router();

router.on("route:homeView", function() {
    homeView.render();
});

router.on("route:stateView", function(id) {
    stateView.render({
        id: id
    });
});

// stops back button from breaking
Backbone.history.start();

// testing coverage obtained through browser. see https://ghostinspector.com/