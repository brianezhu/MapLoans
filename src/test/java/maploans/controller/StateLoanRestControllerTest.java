package maploans.controller;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.nio.charset.Charset;

import maploans.MapLoansApplication;
import maploans.loandata.StateLoanDataObject;
import maploans.loandata.StateLoanDataObjectService;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MapLoansApplication.class)
@WebAppConfiguration
public class StateLoanRestControllerTest {
	
	private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
			MediaType.APPLICATION_JSON.getSubtype(), Charset.forName("utf8"));
	
	private StateLoanDataObjectService stateLoanDataObjectService;
	
	@Autowired
	public void setUpRepository(StateLoanDataObjectService stateLoanDataObjectService){
		this.stateLoanDataObjectService = stateLoanDataObjectService;
	}
	
	@Autowired
	public WebApplicationContext ctx;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup(){
		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
	private static boolean setupIsDone = false;
	
	@Before
	public void setupData(){
		
		if(setupIsDone){
			return;
		}
		
		setupIsDone = true;
		
		StateLoanDataObject stateLoanDataObject = new StateLoanDataObject();
		stateLoanDataObject.setDefaultRate(0.500);
		stateLoanDataObject.setId("US-US");
		stateLoanDataObject.setName("NAME");
		stateLoanDataObject.setNumDefault(100);
		stateLoanDataObject.setNumRepayment(150);
		stateLoanDataObject.setOutstanding(50);
		stateLoanDataObjectService.save(stateLoanDataObject);
		
	}
	
	/**
	 * GET request for all state loan information
	 */
	@Test
	public void getStateData() throws Exception {
		
		mockMvc.perform(get("/api/get/state/{state}", "US-US").accept(MediaType.APPLICATION_JSON))
			.andDo(print())
			.andExpect(status().isOk())
			.andExpect(content().contentType("application/json;charset=UTF-8"))
			.andExpect(jsonPath("$.id", is("US-US")));
		
	}
}