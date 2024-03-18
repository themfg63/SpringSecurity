package com.SpringSecurity.JwtTokenDemo.service;

import com.SpringSecurity.JwtTokenDemo.dto.JwtAuthenticationResponse;
import com.SpringSecurity.JwtTokenDemo.dto.RefreshTokenRequest;
import com.SpringSecurity.JwtTokenDemo.dto.SignUpRequest;
import com.SpringSecurity.JwtTokenDemo.dto.SigninRequest;
import com.SpringSecurity.JwtTokenDemo.entity.User;

public interface AuthenticationService {
    User signUp(SignUpRequest signUpRequest);
    JwtAuthenticationResponse signin(SigninRequest signinRequest);

    public JwtAuthenticationResponse resfreshToken(RefreshTokenRequest refreshTokenRequest);
}
