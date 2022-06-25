package com.example.homework3.vehicle.service;



import com.example.homework3.vehicle.converter.VehicleMapper;
import com.example.homework3.vehicle.dto.VehicleDto;
import com.example.homework3.vehicle.dto.VehicleSaveRequestDto;
import com.example.homework3.vehicle.entity.Vehicle;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class VehicleService {

    private final VehicleEntityService vehicleEntityService;
    final private VehicleMapper vehicleMapper;

    public VehicleDto saveVehicle(VehicleSaveRequestDto vehicleSaveRequestDto) {
        Vehicle vehicle = vehicleMapper.convertToVehicle(vehicleSaveRequestDto);

        String checkPlateNo = vehicle.getVehiclePlateNo();


       //save vehicle
        vehicle = vehicleEntityService.save(vehicle);
        VehicleDto vehicleDto = vehicleMapper.convertToVehicleDto(vehicle);
        return vehicleDto;
    }

    // delete vehicles
    public void findDeleteVehicles(Long id)
    {
        List<Vehicle> vehicleList = vehicleEntityService.findAll();
        for (Vehicle vehicle : vehicleList) {
            if (Objects.equals(vehicle.getUser().getId(), id)) {
                vehicleEntityService.delete(vehicle);
            }
        }
    }

// get users vehicles from id
    public List<Vehicle> findUserVehicles(Long id)
    {
        List<Vehicle> vehicleList = vehicleEntityService.findAll();
        List<Vehicle> customizedUserVehicleList = new ArrayList<>();
        for (Vehicle vehicle : vehicleList) {
            if (Objects.equals(vehicle.getUser().getId(), id)) {
                customizedUserVehicleList.add(vehicle);
            }
        }
        return  customizedUserVehicleList;
    }

    // upfate vehicles information
    public Vehicle updateVehicle(Long vehicleId,String vehicleBrand,String vehicleModel,String vehicleProductionYear,String vehiclePlateNo)
    {
        Vehicle vehicle = vehicleEntityService.findById(vehicleId);
        vehicle.setVehicleBrand(vehicleBrand);
        vehicle.setVehicleModel(vehicleModel);
        vehicle.setVehicleProductionYear(vehicleProductionYear);
        vehicle.setVehiclePlateNo(vehiclePlateNo);
        vehicle = vehicleEntityService.save(vehicle);
        return vehicle;
    }
//delete vehicle with id
    public void deleteVehicle(Long id)
    {
        Vehicle vehicle = vehicleEntityService.findById(id);
        vehicleEntityService.delete(vehicle);
    }
// show list vehicle by models
    public List<Vehicle> findByModels(String model)
    {
        List<Vehicle> vehicleList = vehicleEntityService.findAllByVehicleModel(model);
        return  vehicleList;
    }
    // show list vehicle by brands
    public List<Vehicle> findByBrands(String brand)
    {
        List<Vehicle> vehicleList = vehicleEntityService.findAllByVehicleBrand(brand);
        return  vehicleList;
    }




}
