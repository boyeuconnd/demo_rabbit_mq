package com.example.messagingrabbitmq.util;

public class User {
    private String userName;
    private String password;
    private String name;
    private Integer age;

    public User(String userName, String password, String name, Integer age) {
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
