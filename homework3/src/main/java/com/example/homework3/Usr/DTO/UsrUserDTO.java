package com.example.homework3.Usr.DTO;

import com.example.homework3.Usr.Enum.EnumUsrUserType;
import lombok.Data;

@Data
public class UsrUserDTO {

    private Long id;
    private String name;
    private String lastName;
    private String username;
    private String password;
    private String imageUrl;
    private EnumUsrUserType usrUserType;
}