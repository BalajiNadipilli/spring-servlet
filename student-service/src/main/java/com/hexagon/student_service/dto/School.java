package com.hexagon.student_service.dto;

public class School {

	private Integer id;
	private String schoolName;
	private String location;
	private String principalName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPrincipalName() {
		return principalName;
	}

	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
	}

	@Override
	public String toString() {
		return "School [id=" + id + ", schoolName=" + schoolName + ", location=" + location + ", principalName="
				+ principalName + ", getId()=" + getId() + ", getSchoolName()=" + getSchoolName() + ", getLocation()="
				+ getLocation() + ", getPrincipalName()=" + getPrincipalName() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
