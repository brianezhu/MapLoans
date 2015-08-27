/**
 * Main class of Spring project. To run, load directory into eclipse, download 
 * maven plugin, rightclick project folder and convert to maven project. then 
 * press run!
 * 
 * @author Brian Zhu
 */

package maploans;

import java.util.HashMap;

import maploans.loandata.LoanDataParser;
import maploans.loandata.StateLoanDataObject;
import maploans.loandata.StateLoanDataObjectService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MapLoansApplication {

	/**
	 * Initialize the database from the provided data set.
	 * 
	 * @param stateLoanDataObjectService
	 * @return
	 */
	@Bean
	CommandLineRunner init(StateLoanDataObjectService stateLoanDataObjectService) {
		return (evt) -> {
			LoanDataParser loanDataParser = new LoanDataParser();
			HashMap<String, StateLoanDataObject> dataMap = loanDataParser.getDataMap();
			for (String key : dataMap.keySet()) {
				stateLoanDataObjectService.save(dataMap.get(key));
			}
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(MapLoansApplication.class, args);
	}

}
