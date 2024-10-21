package com.devsuperior.dsleanr.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class Lesson implements Serializable {
	//pq abstract? Ela tem que ser uma task(tarefa) ou Content(conteudo). abstract garante que ela não vai ser instanciada. O diagrama mostra a herança. 
	//não deixa um new Lesson em lugar nenhum. Quando for instanciar uma lesson ou será new Content ou new Task. Conceito de herança total
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String title;
	private Integer position;
	
	private Section section;
	
	private Set<Enrollment> enrollmentsDone = new HashSet<>();
	
	public Lesson() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	public Set<Enrollment> getEnrollmentsDone() {
		return enrollmentsDone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lesson other = (Lesson) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
}
