package com.example.homework3.jwt.dto;

import lombok.Data;

@Data
public class JwtLoginRequestDto {

    private String userName;
    private String userPassword;
}
