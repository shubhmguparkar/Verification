package com.shubhamVerification.main.controller;


import com.shubhamVerification.main.dto.RegisterDto;
import com.shubhamVerification.main.dto.ResponseDto;
import com.shubhamVerification.main.service.AuthenticationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class Authentication {

    private final AuthenticationService authenticationService;

    public Authentication(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/register")
    public ResponseEntity<ResponseDto> register(@RequestBody RegisterDto registerDto) {
        ResponseDto response = authenticationService.registerUser(registerDto);

        if ("FAILED".equals(response.getStatus())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}

