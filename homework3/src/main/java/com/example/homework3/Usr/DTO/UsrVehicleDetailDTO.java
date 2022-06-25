package com.example.homework3.Usr.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class UsrVehicleDetailDTO {
    private Long id;
    private Long vehicleListId;
    private String vehicleListName;
    private Long vehicleId;
    private String vehicleName;
    private BigDecimal vehiclePrice;
}
