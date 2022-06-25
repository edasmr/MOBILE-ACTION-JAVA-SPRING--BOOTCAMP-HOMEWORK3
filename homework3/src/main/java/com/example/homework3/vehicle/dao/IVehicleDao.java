package com.example.homework3.vehicle.dao;


import com.example.homework3.vehicle.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IVehicleDao extends JpaRepository<Vehicle,Long> {

    Vehicle findByVehiclePlateNo(String plateNo);

    List<Vehicle> findAllByVehicleBrand(String brandName);

    List<Vehicle> findAllByVehicleModel(String modelName);
}
