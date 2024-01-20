package com.learn2.learn2.auth.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.learn2.learn2.auth.contract.AuthContract;
import com.learn2.learn2.auth.contract.RequestAuth;
import com.learn2.learn2.auth.model.Auth;
import com.learn2.learn2.global.AppResponse;

@Component
public class LoginProcess implements IAuthService {
    @Override
    public ResponseEntity<AppResponse<String>> loginProcess(AuthContract authContract) {
        final AppResponse<String> response = new AppResponse<>();
        Auth apiResponse = new Auth();
        final RequestAuth requestAuth = new RequestAuth();
        requestAuth.setUsername(authContract.username);
        requestAuth.setPassword(authContract.password);
        String urlFakeApi = "https://dummyjson.com/auth/login";
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            RestTemplate restTemplate = new RestTemplate();
            HttpMethod  httpMethod = HttpMethod.POST;
            HttpEntity<String> entity = new HttpEntity<>(requestAuth.toString(), headers);
            ResponseEntity<String> responseEntity = restTemplate.exchange(urlFakeApi, httpMethod, entity, String.class);
            ObjectMapper objectMapper = new ObjectMapper();
            apiResponse = objectMapper.readValue(responseEntity.getBody(), Auth.class);
            System.out.println(apiResponse.getTOken());
        } catch (Exception e) {
            response.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
            response.setErrorMessage(e.getMessage());
            response.setMessage("Failed");
            return ResponseEntity.internalServerError().body(response);
        }

        response.setCode(HttpStatus.OK.value());
        response.setMessage("Success");
        response.setData(apiResponse);
        return ResponseEntity.ok().body(response);
    }

}
