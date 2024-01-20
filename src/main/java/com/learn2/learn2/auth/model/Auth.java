package com.learn2.learn2.auth.model;

public class Auth {
    private Number id;
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private String gender;
    private String image;
    private String token;
    
    
    public void setId(Number id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Number getId() {
        return this.id;
    }

    public String getEmail() {
        return this.email;
    }

    public String getUsername() {
        return this.username;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getGender() {
        return this.gender;
    }

    public String getImage() {
        return this.image;
    }

    public String getTOken() {
        return this.token;
    } 
}
