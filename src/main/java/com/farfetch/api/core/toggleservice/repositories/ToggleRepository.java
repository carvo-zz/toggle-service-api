package com.farfetch.api.core.toggleservice.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farfetch.api.core.toggleservice.entities.Toggle;

@Repository
public interface ToggleRepository extends JpaRepository<Toggle, Long> {
	
	Page<Toggle> findAll(Pageable pageable);

}
