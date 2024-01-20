package com.learn2.learn2.auth.contract;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class AuthContract {

    @NotBlank(message = "property username is required.")
    @NotNull(message = "property username is required.")
    @Size(min = 1, message = "username is required")
    public String username;

    @NotBlank(message = "property password is undifiend.")
    @NotNull(message = "property password is required")
    @Size(min = 1, message = "password is required")
    public String password;
}
