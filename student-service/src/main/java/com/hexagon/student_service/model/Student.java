package com.hexagon.student_service.model;
import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "students")
public class Student {

    @Id
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    @Column(name = "gender")
    private String gender;
    
    @Column(name = "school_id")
    private Integer schoolId;

    // Automatically generate id before persisting if it's not already set
    @PrePersist
    public void generateId() {
        if (this.id == null) {
            this.id = UUID.randomUUID().toString();  // Generates a unique string ID
        }
    }

    // Getters and Setters
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", schoolId=" + schoolId + "]";
    }

    // Constructors
    public Student(String id, String name, Integer age, String gender, Integer schoolId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.schoolId = schoolId;
    }

    public Student() {
        // Default constructor
    }
}
