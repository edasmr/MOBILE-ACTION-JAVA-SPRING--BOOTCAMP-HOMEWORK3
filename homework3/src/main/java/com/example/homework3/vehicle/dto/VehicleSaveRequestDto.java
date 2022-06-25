package com.example.homework3.vehicle.dto;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class VehicleSaveRequestDto {

    private String vehicleModel;
    private String vehicleProductionYear;
    private String vehiclePlateNo;
    private Long userId;
}
