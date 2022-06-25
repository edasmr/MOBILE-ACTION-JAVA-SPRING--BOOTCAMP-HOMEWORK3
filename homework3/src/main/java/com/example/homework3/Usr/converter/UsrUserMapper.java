package com.example.homework3.Usr.converter;

import com.example.homework3.Usr.DTO.UsrUserDTO;
import com.example.homework3.Usr.DTO.UsrUserSaveRequestDto;
import com.example.homework3.Usr.Entity.UsrUser;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UsrUserMapper {

    UsrUserMapper INSTANCE = Mappers.getMapper(UsrUserMapper.class);

    UsrUser convertToUser(UsrUserSaveRequestDto usrUserSaveRequestDto);

    UsrUserDTO convertToAddressDto(UsrUser usrUser);

}
