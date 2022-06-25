package com.example.homework3.Usr.DAO;

import com.example.homework3.Usr.Entity.UsrPhone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsrPhoneDAO extends JpaRepository<UsrPhone, Long> {
}
