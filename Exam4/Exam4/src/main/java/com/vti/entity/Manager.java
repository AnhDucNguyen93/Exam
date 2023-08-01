package com.vti.entity;
import com.sun.tools.javac.util.List;

public class Manager {
	private int id;
	private String fullName;
	private String email;
	private String passWord;
	private int numberYear;
	private int projectId;
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
	public int getNumberYear() {
		return numberYear;
	}
	public void setNumberYear(int numberYear) {
		this.numberYear = numberYear;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	@Override
	public String toString() {
		return "Manager [id=" + id + ", fullName=" + fullName + ", email=" + email + ", passWord=" + passWord
				+ ", numberYear=" + numberYear + ", projectId=" + projectId + "]";
	}
	
}
