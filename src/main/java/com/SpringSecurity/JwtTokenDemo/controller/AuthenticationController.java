package com.SpringSecurity.JwtTokenDemo.controller;

import com.SpringSecurity.JwtTokenDemo.dto.JwtAuthenticationResponse;
import com.SpringSecurity.JwtTokenDemo.dto.RefreshTokenRequest;
import com.SpringSecurity.JwtTokenDemo.dto.SignUpRequest;
import com.SpringSecurity.JwtTokenDemo.dto.SigninRequest;
import com.SpringSecurity.JwtTokenDemo.entity.User;
import com.SpringSecurity.JwtTokenDemo.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    @PostMapping("/signup")
    public ResponseEntity<User> signUp(@RequestBody SignUpRequest signUpRequest){
        return ResponseEntity.ok(authenticationService.signUp(signUpRequest));
    }

    @PostMapping("/signin")
    public ResponseEntity<JwtAuthenticationResponse> signin(@RequestBody SigninRequest signinRequest){
        return ResponseEntity.ok(authenticationService.signin(signinRequest));
    }

    @PostMapping("/refresh")
    public ResponseEntity<JwtAuthenticationResponse> refresh(@RequestBody RefreshTokenRequest refreshTokenRequest){
        return ResponseEntity.ok(authenticationService.resfreshToken(refreshTokenRequest));
    }
}
