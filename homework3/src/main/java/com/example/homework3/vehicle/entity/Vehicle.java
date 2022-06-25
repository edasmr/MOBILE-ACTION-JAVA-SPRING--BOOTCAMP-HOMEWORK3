package com.example.homework3.vehicle.entity;

import com.example.homework3.Usr.Entity.BaseEntity;
import com.example.homework3.Usr.Entity.UsrUser;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@EntityScan
@Entity
@Getter
@Setter
public class Vehicle implements BaseEntity {
    @Id
    @SequenceGenerator(name = "Vehicle", sequenceName = "VEHICLE_ID_SEQ")
    @GeneratedValue(generator = "Vehicle")
    private Long id;

    @Column(name = "VEHICLE_BRAND")
    private String vehicleBrand;

    @Column(name = "VEHICLE_MODEL")
    private String vehicleModel;

    @Column(name = "VEHICLE_PRODUCE_YEAR")
    private String vehicleProductionYear;

    @Column(name = "VEHICLE_PLATE_NO")
    private String vehiclePlateNo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_USR_USER")
    private UsrUser user;




}
