package com.example.Backend.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Backend.Entity.ProjectDTO;

@Repository
public interface ProjectRepository extends CrudRepository<ProjectDTO, Long>{

	@Override	
	Iterable<ProjectDTO> findAllById(Iterable<Long> iterable);
	
}
