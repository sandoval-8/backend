package gurruwin.backend.centro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import gurruwin.backend.centro.Centro;

public interface centroRepository extends JpaRepository<Centro, Long> {
	
	List<Centro> findAll();
	
}
