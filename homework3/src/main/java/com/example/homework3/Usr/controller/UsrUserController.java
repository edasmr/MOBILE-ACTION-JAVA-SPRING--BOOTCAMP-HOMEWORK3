package com.example.homework3.Usr.controller;

import com.example.homework3.Usr.DTO.UsrUserDTO;
import com.example.homework3.Usr.DTO.UsrUserSaveRequestDto;
import com.example.homework3.Usr.Sevice.UsrUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class UsrUserController {

    private final UsrUserService userService;

    @PostMapping("/newUser")
    public ResponseEntity saveNewUser(@RequestBody UsrUserSaveRequestDto usrUserSaveRequestDto) {
        userService.saveUser(usrUserSaveRequestDto);
        return ResponseEntity.ok(usrUserSaveRequestDto);
    }




}
