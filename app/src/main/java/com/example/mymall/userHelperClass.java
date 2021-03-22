package com.example.mymall;

public class userHelperClass {
    private String email;
    private String fullName;
    private String password;
//    private String confirmPassword;

    public userHelperClass() {

    }

    public userHelperClass(String email, String fullName, String password) {
        this.email = email;
        this.fullName = fullName;
        this.password = password;
//        this.confirmPassword = confirmPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
