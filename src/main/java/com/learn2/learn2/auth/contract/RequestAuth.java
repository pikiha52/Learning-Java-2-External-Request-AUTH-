package com.learn2.learn2.auth.contract;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestAuth {
    @JsonProperty("username")
    private String username;

    @JsonProperty("password")
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    @Override
    public String toString() {
        return "{\n" +
                "    \"username\": \"" + this.username + "\",\n" +
                "    \"password\": \"" + this.password + "\"\n" +
                "}";
    }
}
