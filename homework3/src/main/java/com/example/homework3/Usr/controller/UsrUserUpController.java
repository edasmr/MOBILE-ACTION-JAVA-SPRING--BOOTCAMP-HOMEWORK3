package com.example.homework3.Usr.controller;


import com.example.homework3.Usr.Sevice.UsrUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/userOp")
public class UsrUserUpController {

    private final UsrUserService userService;

    @PatchMapping("/updateUserPassword")
    public String updateUser(@RequestParam String name, String userOldPassword, String newPassword){

        String message = userService.updateUserPassword(name,userOldPassword,newPassword);

        return message;
    }

 //delete user and users vehicles
    @DeleteMapping("deleteUserAndVehicles")
    public ResponseEntity deleteUserAllVehicles(@RequestParam String name){
        userService.deleteUser(name);
        return ResponseEntity.ok().build();
    }

    // get user vehicles
    @GetMapping("findAllUserVehicles")
    public ResponseEntity findAllUserVehicles(@RequestParam String name){

        return ResponseEntity.ok(userService.findAllUserVehicles(name));

    }





}
