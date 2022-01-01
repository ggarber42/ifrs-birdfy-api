package br.edu.ifrs.birdfy.repository;

import br.edu.ifrs.birdfy.model.Ave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AveRepository extends JpaRepository<Ave, Integer>, JpaSpecificationExecutor<Ave> {

}
