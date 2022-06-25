package com.example.homework3.Usr.DAO;

import com.example.homework3.Usr.DTO.UsrVehicleDetailDTO;
import com.example.homework3.Usr.Entity.UsrVehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsrVehicleDAO extends JpaRepository<UsrVehicle, Long> {

    List<UsrVehicleDetailDTO> findAllUsrFavoriteProductDetailDtoByFavListId(@Param("vehicleListId") Long favListId);
}
