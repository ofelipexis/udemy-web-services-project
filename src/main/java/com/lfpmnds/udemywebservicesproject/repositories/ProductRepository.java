package com.lfpmnds.udemywebservicesproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lfpmnds.udemywebservicesproject.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	/* Não foi necessário criar uma implementação pois o Spring Data JPA
	 * já possui uma implementação padrão para essa interface.*/
}
