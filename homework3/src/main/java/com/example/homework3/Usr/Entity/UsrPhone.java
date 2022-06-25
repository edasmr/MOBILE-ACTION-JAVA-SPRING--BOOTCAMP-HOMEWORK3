package com.example.homework3.Usr.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "USR_PHONE")
@Data
public class UsrPhone implements BaseEntity {

    @Id
    @SequenceGenerator(name = "UsrPhone", sequenceName = "USR_PHONE_ID_SEQ")
    @GeneratedValue(generator = "UsrPhone")
    private Long id;

    private Long userUserId;
    private String number;

    @Enumerated(EnumType.STRING)
    private EnumYesNo isDefault;

    @Enumerated(EnumType.STRING)
    private EnumStatus status;

}