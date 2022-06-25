package com.example.homework3.Usr.converter;


import com.example.homework3.Usr.DTO.UsrUserVehicleSaveRequestDTO;
import com.example.homework3.Usr.DTO.UsrVehicleDTO;
import com.example.homework3.Usr.Entity.UsrVehicle;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UsrUserVehicleMapper {
    UsrUserVehicleMapper INSTANCE = Mappers.getMapper(UsrUserVehicleMapper.class);

    UsrVehicle convertToUsrFavoriteProduct(UsrUserVehicleSaveRequestDTO usrFavoriteProductSaveRequestDto);

    UsrVehicleDTO convertToUsrFavoriteProductDto(UsrVehicle usrFavoriteProduct);
}