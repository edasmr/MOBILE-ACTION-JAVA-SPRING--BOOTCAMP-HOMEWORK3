package com.example.homework3.jwt.service;

import com.example.homework3.Usr.DTO.UsrUserDTO;
import com.example.homework3.Usr.DTO.UsrUserSaveRequestDto;
import com.example.homework3.Usr.Sevice.UsrUserService;
import com.example.homework3.jwt.dto.JwtLoginRequestDto;
import com.example.homework3.jwt.enums.JwtConstant;
import com.example.homework3.jwt.security.JwtTokenGenerator;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class AuthenticationService {


    private final AuthenticationManager authenticationManager;
    private final JwtTokenGenerator jwtTokenGenerator;
    private final UsrUserService userService;

    public UsrUserDTO register(UsrUserSaveRequestDto usrUserSaveRequestDto)
    {
        return userService.saveUser(usrUserSaveRequestDto);

    }

    public String login(JwtLoginRequestDto jwtLoginRequestDto) {


        Authentication authentication = authenticationManager.authenticate(authenticationToken);
        SecurityContextHolder.getContext().setAuthentication(authentication);

        String token = jwtTokenGenerator.generateJwtToken(authentication);

        String fullToken = JwtConstant.BEARER.getConstant() + token;

        return fullToken;
    }


}
