package com.SpringSecurity.JwtTokenDemo.service.impl;

import com.SpringSecurity.JwtTokenDemo.dto.SignUpRequest;
import com.SpringSecurity.JwtTokenDemo.entity.Role;
import com.SpringSecurity.JwtTokenDemo.entity.User;
import com.SpringSecurity.JwtTokenDemo.repository.UserRepository;
import com.SpringSecurity.JwtTokenDemo.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public User signUp(SignUpRequest signUpRequest){
        User user  =new User();
        user.setEmail(signUpRequest.getEmail());
        user.setName(signUpRequest.getName());
        user.setSurname(signUpRequest.getSurname());
        user.setRole(Role.USER);
        user.setPassword(passwordEncoder.encode(signUpRequest.getPassword()));
        return userRepository.save(user);
    }
}
