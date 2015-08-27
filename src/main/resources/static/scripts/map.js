google.load("visualization", "1", {
    "packages": ["geochart"]
});
google.setOnLoadCallback(drawVisualization);

function drawVisualization() {
    var data = new google.visualization.DataTable();

    data.addColumn("string", "Country");
    data.addColumn("number", "Value");
    data.addColumn({
        type: "string",
        role: "tooltip"
    });

    var ivalue = new Array();

    data.addRows([
        [{
            v: "US-AK",
            f: "Alaska"
        }, 0, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-AL",
            f: "Alabama"
        }, 1, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-AR",
            f: "Arkansas"
        }, 2, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-AZ",
            f: "Arizona"
        }, 3, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-CA",
            f: "California"
        }, 4, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-CO",
            f: "Colorado"
        }, 5, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-CT",
            f: "Connecticut"
        }, 6, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-DE",
            f: "Delaware"
        }, 7, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-FL",
            f: "Florida"
        }, 8, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-GA",
            f: "Georgia"
        }, 9, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-HI",
            f: "Hawaii"
        }, 10, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-IA",
            f: "Iowa"
        }, 11, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-ID",
            f: "Idaho"
        }, 12, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-IL",
            f: "Illinois"
        }, 13, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-IN",
            f: "Indiana"
        }, 14, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-KS",
            f: "Kansas"
        }, 15, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-KY",
            f: "Kentucky"
        }, 16, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-LA",
            f: "Louisiana"
        }, 17, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-MA",
            f: "Massachusetts"
        }, 18, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-MD",
            f: "Maryland"
        }, 19, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-ME",
            f: "Maine"
        }, 20, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-MI",
            f: "Michigan"
        }, 21, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-MN",
            f: "Minnesota"
        }, 22, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-MO",
            f: "Missouri"
        }, 23, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-MS",
            f: "Mississippi"
        }, 24, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-MT",
            f: "Montana"
        }, 25, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-NC",
            f: "North Carolina"
        }, 26, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-ND",
            f: "North Dakota"
        }, 27, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-NE",
            f: "Nebraska"
        }, 28, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-NH",
            f: "New Hampshire"
        }, 29, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-NJ",
            f: "New Jersey"
        }, 30, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-NM",
            f: "New Mexico"
        }, 31, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-NV",
            f: "Nevada"
        }, 32, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-NY",
            f: "New York"
        }, 33, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-OH",
            f: "Ohio"
        }, 34, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-OK",
            f: "Oklahoma"
        }, 35, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-OR",
            f: "Oregon"
        }, 36, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-PA",
            f: "Pennsylvania"
        }, 37, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-RI",
            f: "Rhode Island"
        }, 38, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-SC",
            f: "South Carolina"
        }, 39, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-SD",
            f: "South Dakota"
        }, 40, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-TN",
            f: "Tennessee"
        }, 41, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-TX",
            f: "Texas"
        }, 42, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-UT",
            f: "Utah"
        }, 43, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-VA",
            f: "Virginia"
        }, 44, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-VT",
            f: "Vermont"
        }, 45, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-WA",
            f: "Washington"
        }, 46, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-WI",
            f: "Wisconsin"
        }, 47, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-WV",
            f: "West Virginia"
        }, 48, "USA"]
    ]);

    data.addRows([
        [{
            v: "US-WY",
            f: "Wyoming"
        }, 49, "USA"]
    ]);

    var options = {
        backgroundColor: {
            fill: "#FFFFFF",
            stroke: "#FFFFFF",
            strokeWidth: 0
        },
        colorAxis: {
            minValue: 0,
            maxValue: 49,
            colors: ["#bcefad", "#bcefad", "#bcefad", "#bcefad", "#bcefad", "#bcefad", "#bcefad", "#bcefad", "#bcefad", "#bcefad", "#bcefad", "#bcefad", "#bcefad", "#bcefad", "#bcefad", "#bcefad", "#bcefad", "#bcefad", "#bcefad", "#bcefad", "#bcefad", "#bcefad", "#bcefad", "#bcefad", "#bcefad", "#bcefad", "#bcefad", "#bcefad", "#bcefad", "#bcefad", "#bcefad", "#bcefad", "#bcefad", "#bcefad", "#bcefad", "#bcefad", "#bcefad", "#bcefad", "#bcefad", "#bcefad", "#bcefad", "#bcefad", "#bcefad", "#bcefad", "#bcefad", "#bcefad", "#bcefad", "#bcefad", "#bcefad", "#bcefad", ]
        },
        legend: "none",
        backgroundColor: {
            fill: "#FFFFFF",
            stroke: "#FFFFFF",
            strokeWidth: 0
        },
        datalessRegionColor: "#f5f5f5",
        displayMode: "regions",
        enableRegionInteractivity: "true",
        resolution: "provinces",
        sizeAxis: {
            minValue: 1,
            maxValue: 1,
            minSize: 10,
            maxSize: 10
        },
        region: "US",
        keepAspectRatio: true,
        width: $(document).width() * 1.1,
        height: $(document).height() * 1.1,
        tooltip: {
            textStyle: {
                color: "#444444"
            },
            trigger: "hover"
        }
    };


    var chart = new google.visualization.GeoChart(document.getElementById("visualization"));
    google.visualization.events.addListener(chart, "select", function() {
        var selection = chart.getSelection();
        if (selection.length == 1) {
            var selectedRow = selection[0].row;
            var selectedRegion = data.getValue(selectedRow, 0);
            if (ivalue[selectedRegion] != "") {
                window.location = "#/view/" + selectedRegion;
            }
        }
    });

    chart.draw(data, options);
}

console.log($(document).width());
console.log($(document).height());