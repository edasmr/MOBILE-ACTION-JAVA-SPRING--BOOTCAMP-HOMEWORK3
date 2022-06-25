package com.example.homework3.vehicle.converter;

import com.example.homework3.vehicle.dto.VehicleDto;
import com.example.homework3.vehicle.dto.VehicleSaveRequestDto;
import com.example.homework3.vehicle.entity.Vehicle;
import com.example.homework3.vehicle.service.VehicleEntityService;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public abstract class VehicleMapper {

    @Autowired
    VehicleEntityService vehicleEntityService;
    @Mapping(target = "userId",source = "user.id")
    public abstract VehicleDto convertToVehicleDto(Vehicle vehicle);

    @Mapping(target = "user.id",source = "userId")
    public abstract Vehicle convertToVehicle(VehicleSaveRequestDto vehicleSaveRequestDto);
}