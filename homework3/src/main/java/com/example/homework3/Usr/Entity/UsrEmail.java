package com.example.homework3.Usr.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "USR_EMAIL")
@Data
public class UsrEmail implements BaseEntity {

    @Id
    @SequenceGenerator(name = "UsrEmail", sequenceName = "USR_EMAIL_ID_SEQ")
    @GeneratedValue(generator = "UsrEmail")
    private Long id;

    private Long userUserId;
    private String mailAddress;

    @Enumerated(EnumType.STRING)
    private EnumYesNo isDefault;

    @Enumerated(EnumType.STRING)
    private EnumStatus status;

}