package maploans.loandata;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StateLoanDataObjectServiceImpl implements StateLoanDataObjectService {

	StateLoanDataObjectRepository stateLoanDataObjectRepository;
	
	@Autowired
	public StateLoanDataObjectServiceImpl(StateLoanDataObjectRepository stateLoanDataObjectRepository){
		this.stateLoanDataObjectRepository = stateLoanDataObjectRepository;
	}
	
	@Override
	public Optional<StateLoanDataObject> getStateLoanDataObjectByKey(long key) {
		return stateLoanDataObjectRepository.findByKey(key);
	}

	@Override
	public Optional<StateLoanDataObject> getStateLoanDataObjectById(String id) {
		return stateLoanDataObjectRepository.findById(id);
	}
	
	public void save(StateLoanDataObject stateLoanDataObject){
		stateLoanDataObjectRepository.save(stateLoanDataObject);
	}

}
