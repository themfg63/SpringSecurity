package com.SpringSecurity.JwtTokenDemo.dto;

import lombok.Data;

@Data
public class RefreshTokenRequest {
    private String token;
}
