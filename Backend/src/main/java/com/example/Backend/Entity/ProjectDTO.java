package com.example.Backend.Entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity	
@Getter @Setter @AllArgsConstructor @NoArgsConstructor 
public class ProjectDTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Project name is required")
	private String projectName;
	
	@NotBlank(message = "Project Identifier can't be empty")
	@Column(updatable = false, unique = true)
	@Size(min=4 , max=5 , message="please use 4 to 5 characters")
	private String projectIdentifier;
	
	@NotBlank(message = "Description can't be blank")
	private String Description;
	
	@JsonFormat(pattern = "yyyy-mm-dd")
	private Date start_date;
	@JsonFormat(pattern = "yyyy-mm-dd")
	private Date end_date;
	
	@JsonFormat(pattern = "yyyy-mm-dd")
	private Date cretaed_at;
	@JsonFormat(pattern = "yyyy-mm-dd")
	private Date updated_at;
	
	@PrePersist
	protected void onCreate() {
		this.cretaed_at = new Date();
	}
	
	@PreUpdate
	protected void onUpdate() {
		this.updated_at = new Date();
	}
	
	
	
}
