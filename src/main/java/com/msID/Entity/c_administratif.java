package com.msID.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class c_administratif {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Id_CD;
	private String name;
	private String dep;
	private String post;
	public Long getId_CD() {
		return Id_CD;
	}
	public void setId_CD(Long id_CD) {
		Id_CD = id_CD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public c_administratif(Long id_CD, String name, String dep, String post) {
		super();
		Id_CD = id_CD;
		this.name = name;
		this.dep = dep;
		this.post = post;
	}
	public c_administratif() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "c_administratif [Id_CD=" + Id_CD + ", name=" + name + ", dep=" + dep + ", post=" + post + "]";
	}
	
	
	
	
}
