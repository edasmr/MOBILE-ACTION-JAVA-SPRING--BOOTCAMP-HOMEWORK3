package com.example.homework3.Usr.Sevice.entityService;

import com.example.homework3.Usr.DAO.UsrPhoneDAO;
import com.example.homework3.Usr.Entity.UsrPhone;
import com.example.homework3.Usr.Sevice.BaseEntityService;
import org.springframework.stereotype.Service;

@Service
public class UsrPhoneEntityService extends BaseEntityService<UsrPhone, UsrPhoneDAO> {

    public UsrPhoneEntityService(UsrPhoneDAO dao) {
        super(dao);
    }
}