package com.example.homework3.vehicle.service;

import com.example.homework3.Usr.Sevice.BaseEntityService;
import com.example.homework3.vehicle.dao.IVehicleDao;
import com.example.homework3.vehicle.entity.Vehicle;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleEntityService extends BaseEntityService<Vehicle, IVehicleDao> {
    public VehicleEntityService(IVehicleDao vehicleDao) {
        super(vehicleDao);
    }

    public Vehicle findByVehiclePlateNo(String plateNo)
    {

        return getDao().findByVehiclePlateNo(plateNo);
    }

    public List<Vehicle> findAllByVehicleBrand(String brandName)
    {
        return getDao().findAllByVehicleBrand(brandName);
    }

    public List<Vehicle> findAllByVehicleModel(String modelName)
    {
        return getDao().findAllByVehicleModel(modelName);
    }



}
