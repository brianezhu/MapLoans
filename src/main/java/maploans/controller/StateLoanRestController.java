/**
 * Rest Controller for application.
 * 
 */

package maploans.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import maploans.loandata.StateLoanDataObject;
import maploans.loandata.StateLoanDataObjectService;

@RestController
public class StateLoanRestController {
	
	private StateLoanDataObjectService stateLoanDataObjectService;

	@Autowired
	public StateLoanRestController(StateLoanDataObjectService stateLoanDataObjectService) {
		this.stateLoanDataObjectService = stateLoanDataObjectService;
	}
	
	@RequestMapping(value = "/api/get/state/{state}")
	public StateLoanDataObject getStateData(@PathVariable String state) {
		return stateLoanDataObjectService.getStateLoanDataObjectById(state).get();
	}

}
