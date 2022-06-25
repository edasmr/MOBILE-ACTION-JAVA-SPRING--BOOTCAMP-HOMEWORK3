package com.example.homework3.Usr.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "USR_VEHICLE")
@Data
public class UsrVehicle implements BaseEntity {

    @Id
    @SequenceGenerator(name = "UsrVehicle", sequenceName = "USR_VEHICLE_ID_SEQ")
    @GeneratedValue(generator = "UsrVehicle")
    private Long id;

    private Long usrVehicleId;
    private Long vhcVehicleId;
}