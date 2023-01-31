package com.beniregev.kafka.java17temurin_springboot_kafka_app.model;

public class User {
    private String name;
    private String dept;
    private Integer salary;

    public User(String name, String dept, Integer salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
