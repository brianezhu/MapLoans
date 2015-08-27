package maploans.loandata;

import java.util.Optional;

public interface StateLoanDataObjectService {
	
	Optional<StateLoanDataObject> getStateLoanDataObjectByKey(long key);
	
	Optional<StateLoanDataObject> getStateLoanDataObjectById(String id);
	
	void save(StateLoanDataObject stateLoanDataObject);
}
