package com.example.homework3.Usr.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "USR_VEHICLE_LIST")
@Data
public class UsrVehicleList implements BaseEntity  {

    @Id
    @SequenceGenerator(name = "UsrvehicleList", sequenceName = "USR_VEHICLE_LIST_ID_SEQ")
    @GeneratedValue(generator = "UsrvehicleList")
    private Long id;

    private Long usrUserId;
    private String name;
}
