package com.example.Backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Backend.Entity.ProjectDTO;
import com.example.Backend.repositories.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projectrepo;
	
	public ProjectDTO saveOrUpdateProject(ProjectDTO project) {
		
		return projectrepo.save(project);
	}
}
