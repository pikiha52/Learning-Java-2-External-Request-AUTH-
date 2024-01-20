package com.learn2.learn2.auth.service;

import org.springframework.http.ResponseEntity;

import com.learn2.learn2.auth.contract.AuthContract;
import com.learn2.learn2.global.AppResponse;

public interface IAuthService {
    public ResponseEntity<AppResponse<String>> loginProcess(AuthContract authContract);
}
