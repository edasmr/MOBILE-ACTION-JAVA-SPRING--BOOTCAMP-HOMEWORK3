package com.example.homework3.jwt.controller;


import com.example.homework3.Usr.DTO.UsrUserDTO;
import com.example.homework3.jwt.dto.JwtLoginRequestDto;
import com.example.homework3.jwt.service.AuthenticationService;
import com.example.homework3.Usr.DTO.UsrUserDTO;
import com.example.homework3.Usr.DTO.UsrUserSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody UsrUserSaveRequestDto usrUserSaveRequestDto){

        UsrUserDTO usrUserDto = authenticationService.register(UsrUserSaveRequestDto);
        return ResponseEntity.ok(usrUserSaveRequestDto);
    }

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody JwtLoginRequestDto jwtLoginRequestDto){

        String login = authenticationService.login(jwtLoginRequestDto);

        return ResponseEntity.ok(login);
    }

}
