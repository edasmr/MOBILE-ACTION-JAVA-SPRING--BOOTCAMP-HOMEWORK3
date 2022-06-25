package com.example.homework3.Usr.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "USR_USER")
@Data
public class UsrUser  implements BaseEntity {

    @Id
    @SequenceGenerator(name = "UsrUser", sequenceName = "USR_USER_ID_SEQ")
    @GeneratedValue(generator = "UsrUser")
    private Long id;
    private String name;
    private String shortName;
    private String username;
    private String password;
    private String imageUrl;

    @Enumerated(EnumType.STRING)
    private EnumUsrUserType usrUserType;
}
