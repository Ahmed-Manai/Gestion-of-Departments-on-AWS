package com.msID.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class enseignant {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Id_EN;
	private String name;
	private String field;
	private String dep;
	
	public Long getId_EN() {
		return Id_EN;
	}
	public void setId_EN(Long id_EN) {
		Id_EN = id_EN;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public enseignant(Long id_EN, String name, String field, String dep) {
		super();
		Id_EN = id_EN;
		this.name = name;
		this.field = field;
		this.dep = dep;
	}
	public enseignant() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "enseignant [Id_EN=" + Id_EN + ", name=" + name + ", field=" + field + ", dep=" + dep + "]";
	}

	
}
