package com.hexagon.student_service.dto;

public class StudentResponse {
	 private String id;
	    private String name;
	    private int age;
	    private String gender;
	    private School school;
		
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
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
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public School getSchool() {
			return school;
		}
		public void setSchool(School school) {
			this.school = school;
		}
		@Override
		public String toString() {
			return "StudentResponse [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", school="
					+ school + ", getId()=" + getId() + ", getName()=" + getName() + ", getAge()=" + getAge()
					+ ", getGender()=" + getGender() + ", getSchool()=" + getSchool() + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}
		public StudentResponse(String id, String name, int age, String gender, School school) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
			this.gender = gender;
			this.school = school;
		}
	   
		
	    
}
