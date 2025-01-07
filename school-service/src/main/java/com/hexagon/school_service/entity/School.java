package com.hexagon.school_service.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@Table(name = "school")
	public class School implements Serializable {
	    private static final long serialVersionUID = 1L;

	    @Id
	    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "school_seq")
	    @SequenceGenerator(name = "school_seq", sequenceName = "school_seq", allocationSize = 1)
	    private Integer id;

    @JsonProperty("schoolName")
    @Column(name = "school_name")
    private String schoolName;

    @JsonProperty("location")
    @Column(name = "location")
    private String location;

    @JsonProperty("principalName")
    @Column(name = "principal_name")
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

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	public School(int id, String schoolName, String location, String principalName) {
		super();
		this.id = id;
		this.schoolName = schoolName;
		this.location = location;
		this.principalName = principalName;
	}

	public School() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    
}