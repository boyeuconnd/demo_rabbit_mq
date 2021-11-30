package com.example.messagingrabbitmq.util;

public class Info {
    private String email;
    private String address;
    private String phoneNum;

    public Info(String email, String address, String phoneNum) {
        this.email = email;
        this.address = address;
        this.phoneNum = phoneNum;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
