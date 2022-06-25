package com.example.homework3.vehicle.controller;

import com.example.homework3.vehicle.dto.VehicleSaveRequestDto;
import com.example.homework3.vehicle.entity.Vehicle;
import com.example.homework3.vehicle.service.VehicleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/vehicles")
@RequiredArgsConstructor
public class VehicleController {

    private final VehicleService vehicleService;

    //savee new vehicle
    @PostMapping("/saveNewVehicle")
    public ResponseEntity saveNewVehicle(@RequestBody VehicleSaveRequestDto vehicleSaveRequestDto){
        vehicleService.saveVehicle(vehicleSaveRequestDto);
        return new ResponseEntity(vehicleSaveRequestDto, HttpStatus.CREATED);
    }
// update this vehicle
    @PatchMapping("/updateVehicle")
    public ResponseEntity updateVehicle(@RequestParam Long vehicleId,String vehicleBrand,String vehicleModel,String vehicleProductionYear,String vehiclePlateNo){

        Vehicle vehicle = vehicleService.updateVehicle(vehicleId,vehicleBrand,vehicleModel,vehicleProductionYear,vehiclePlateNo);
        return ResponseEntity.ok().build();
    }

    // delete vehicle with id

    @DeleteMapping("deleteVehicle")
    public ResponseEntity deleteVehicle(@RequestParam Long id){
        vehicleService.deleteVehicle(id);
        return ResponseEntity.ok().build();
    }

    // get vehicles model name
    @GetMapping("findByModelName/")
    public ResponseEntity findByModelName(@RequestParam String modelName){

        List<Vehicle> vehicleList = vehicleService.findByModels(modelName);
        return new ResponseEntity<>(vehicleList, HttpStatus.OK);
    }



}
