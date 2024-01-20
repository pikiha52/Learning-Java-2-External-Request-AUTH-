package com.learn2.learn2.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn2.learn2.auth.contract.AuthContract;
import com.learn2.learn2.auth.service.IAuthService;
import com.learn2.learn2.global.AppResponse;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1.0/auth")
public class AuthController {
    @Autowired
    private IAuthService iAuthService;
    
    @PostMapping("/login")
    public ResponseEntity<AppResponse<String>> login(@RequestBody @Valid AuthContract authContract) {
        return iAuthService.loginProcess(authContract);
    }

}
