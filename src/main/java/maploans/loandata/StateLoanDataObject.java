/**
 * StateLoanDataObject represents the loan information for one state. The data is obtained from
 * 1213PerkinsCDR.csv
 * 
 * @author Brian Zhu
 */

package maploans.loandata;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class StateLoanDataObject {

	@Id
	@GeneratedValue
	private long key;
	
	private String id;
	private String name;
	private int numRepayment;
	private int numDefault;
	private double defaultRate;
	private long outstanding;	

	public long getKey() {
		return key;
	}

	public String getId() {
		return id;
	}

	public void setId(String state) {
		this.id = state;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	

	public int getNumRepayment() {
		return numRepayment;
	}

	public void setNumRepayment(int numRepayment) {
		this.numRepayment = numRepayment;
	}

	public int getNumDefault() {
		return numDefault;
	}

	public void setNumDefault(int numDefault) {
		this.numDefault = numDefault;
	}

	public double getDefaultRate() {
		return defaultRate;
	}

	public void setDefaultRate(double defaultRate) {
		this.defaultRate = defaultRate;
	}

	public long getOutstanding() {
		return outstanding;
	}

	public void setOutstanding(long outstanding) {
		this.outstanding = outstanding;
	}
}
