package com.example.homework3.Usr.Sevice.entityService;

import com.example.homework3.Usr.DAO.UsrVehicleDAO;
import com.example.homework3.Usr.DTO.UsrVehicleDetailDTO;
import com.example.homework3.Usr.Entity.UsrVehicle;
import com.example.homework3.Usr.Sevice.BaseEntityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsrUserVehicleEntityService extends BaseEntityService<UsrVehicle, UsrVehicleDAO> {

    public UsrUserVehicleEntityService(UsrVehicleDAO dao) {
        super(dao);
    }

    public List<UsrVehicleDetailDTO> findAllUsrFavoriteProductDetailDtoByFavListId(Long vehicleId){
        return getDao().findAllUsrFavoriteProductDetailDtoByFavListId(vehicleId);
    }
}
