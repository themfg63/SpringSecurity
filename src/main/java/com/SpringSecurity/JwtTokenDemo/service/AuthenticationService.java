package com.SpringSecurity.JwtTokenDemo.service;

import com.SpringSecurity.JwtTokenDemo.dto.SignUpRequest;
import com.SpringSecurity.JwtTokenDemo.entity.User;

public interface AuthenticationService {
    User signUp(SignUpRequest signUpRequest);
}
