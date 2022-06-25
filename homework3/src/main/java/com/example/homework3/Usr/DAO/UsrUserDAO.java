package com.example.homework3.Usr.DAO;

import com.example.homework3.Usr.Entity.UsrUser;
import com.example.homework3.Usr.Enum.EnumUsrUserType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UsrUserDAO extends JpaRepository<UsrUser, Long> {

    UsrUser findByUsername(String username);

}