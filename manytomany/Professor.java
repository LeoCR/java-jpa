package com.udemy.composition;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="PROFESSOR")
public class Professor {

	@Id
	@Column(name="id")
	@GeneratedValue
	private int professorId;
	
	@Column(name="professor_name")
	private String professorName;

	@ManyToMany(mappedBy="professors")
	private List<ResearchProject> projects;
	
	public Professor() {
		this.projects = new ArrayList<>();
	}
	
	public Professor(String professorName) {
		this();
		this.professorName = professorName;
	}

	public int getId() {
		return professorId;
	}

	public void setId(int professorId) {
		this.professorId = professorId;
	}

	public String getProfessorName() {
		return professorName;
	}

	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}

	public List<ResearchProject> getProjects() {
		return projects;
	}

	public void setProjects(List<ResearchProject> projects) {
		this.projects = projects;
	}
	
	public void assignProjectToProfessor(ResearchProject project){
		this.projects.add(project);
	}
}
