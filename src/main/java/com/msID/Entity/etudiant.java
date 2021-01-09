package com.msID.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class etudiant {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Id_ET;
	private String name;
	private int age;
	private double grade;
	
	public Long getId_ET() {
		return Id_ET;
	}
	public void setId_ET(Long id_ET) {
		Id_ET = id_ET;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public etudiant(Long id_ET, String name, int age, double grade) {
		super();
		this.Id_ET = id_ET;
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	public etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "etudiant [Id_ET=" + Id_ET + ", name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}
	
	
	
}
