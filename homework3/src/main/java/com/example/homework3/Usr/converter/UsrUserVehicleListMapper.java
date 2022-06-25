package com.example.homework3.Usr.converter;

import com.example.homework3.Usr.DTO.UsrVehicleListDTO;
import com.example.homework3.Usr.DTO.UsrVehicleListSaveRequestDTO;
import com.example.homework3.Usr.Entity.UsrVehicle;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UsrUserVehicleListMapper {
    UsrUserVehicleListMapper INSTANCE = Mappers.getMapper(UsrUserVehicleListMapper.class);

    UsrVehicleListDTO convertToUsrFavoriteListDto(UsrVehicle usrFavoriteList);

    List<UsrVehicleListDTO> convertToUsrFavoriteListDtoList(List<UsrVehicle> usrFavoriteList);

    UsrVehicle convertToUsrFavoriteList(UsrVehicleListSaveRequestDTO usrFavoriteListSaveRequestDto);

    UsrVehicleListSaveRequestDTO convertToUsrFavoriteListSaveRequestDto(UsrVehicle usrFavoriteList);
}
