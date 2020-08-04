package com.dsi.web.model;

public class Student {
	String firstName;
	String lastname;
	int regNo;
	String deptName;
	Double cgpa;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Double getCgpa() {
		return cgpa;
	}
	public void setCgpa(Double cgpa) {
		this.cgpa = cgpa;
	}
	
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastname=" + lastname + ", regNo=" + regNo + ", deptName="
				+ deptName + ", cgpa=" + cgpa + "]";
	}
	
	

}
