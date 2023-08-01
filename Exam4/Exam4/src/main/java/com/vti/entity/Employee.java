package com.vti.entity;

public class Employee {
	private int id;
	private String fullName;
	private String email;
	private String passWord;
	private String proSkill;
	private int projectId;
	
	public Employee() {
	}
	
	public Employee(int id, String fullName, String email, String passWord, String proSkill, int projectId) {
		this.id = id;
		this.fullName = fullName;
		this.email = email;
		this.passWord = passWord;
		this.proSkill = proSkill;
		this.projectId = projectId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getProSkill() {
		return proSkill;
	}
	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", fullName=" + fullName + ", email=" + email + ", passWord=" + passWord
				+ ", proSkill=" + proSkill + ", projectId=" + projectId + "]";
	}
	
	
}
