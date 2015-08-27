package maploans.loandata;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateLoanDataObjectRepository extends JpaRepository<StateLoanDataObject, Long>{
	
	Optional<StateLoanDataObject> findByKey(long key);
	
	Optional<StateLoanDataObject> findById(String id);

}
