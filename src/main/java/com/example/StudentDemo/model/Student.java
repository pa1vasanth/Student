package com.example.StudentDemo.model;


public class Student {
    // Getters and setters

    private Long id;
    private String name;
    private String email;


    public Student() {
        // Default constructor needed for Thymeleaf form binding
    }

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
