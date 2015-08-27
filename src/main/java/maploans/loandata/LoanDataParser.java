/**
 * Load data from csv files.
 * 
 */

package maploans.loandata;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

public class LoanDataParser {

	private static final String dataLocation = "1213PerkinsCDR.csv";
	private static final int startLine = 9;

	private HashMap<String, StateLoanDataObject> dataMap;

	public LoanDataParser() {
		loadData(dataLocation, startLine);
	}

	/**
	 * Load data from a .csv file into a state HashMap .csv MUST be in the
	 * format specified at
	 * http://ifap.ed.gov/perkinscdrguide/1213PerkinsCDR.html
	 * 
	 * @param dataLocation
	 *            file path for the dataset
	 * @param startLine
	 *            start line of the .csv
	 */
	private void loadData(String dataLocation, int startLine) {
		
		try {
			
			BufferedReader br = new BufferedReader(new FileReader(dataLocation));

			// Skip the number of lines to reach actual data
			for (int i = 0; i < startLine; i++){
				br.readLine();
			}
			
			// Map "US-CA" to a state object and a list of college objects
			HashMap<String, StateLoanDataObject> map = new HashMap<>();

			String line;
			
			while ((line = br.readLine()) != null) {

				String[] split = line.split(","); // split csv by commas
				String state = "US-" + split[5];

				StateLoanDataObject sldo = map.get(state);

				if (sldo == null) {
					sldo = new StateLoanDataObject();
					sldo.setId(state);
					sldo.setName(split[5]);
					map.put(state, sldo);
				}

				int numBorrowers = Integer.parseInt(split[7]);
				int numDefault = Integer.parseInt(split[8]);
				int numOutstanding = Integer.parseInt(split[10]);

				sldo.setNumRepayment(sldo.getNumRepayment() + numBorrowers);
				sldo.setNumDefault(sldo.getNumDefault() + numDefault);
				sldo.setOutstanding(sldo.getOutstanding() + numOutstanding);
			}

			// calculate the default rate
			Iterator<String> it = map.keySet().iterator();
			
			while (it.hasNext()) {
				
				StateLoanDataObject sldo = map.get(it.next());
				double defaultRate = ((double) sldo.getNumDefault()) / sldo.getNumRepayment();
				sldo.setDefaultRate(defaultRate);
			}

			dataMap = map;
			br.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("COULD NOT READ FILE: " + dataLocation);
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public HashMap<String, StateLoanDataObject> getDataMap() {
		return dataMap;
	}
}
