package Cliente.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Cliente.model.Cliente;

public interface ClienteRepository 
	extends JpaRepository<Cliente, Long>{

	}