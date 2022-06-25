package com.example.homework3.Usr.DAO;

import com.example.homework3.Usr.Entity.UsrEmail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsrEmailDAO extends JpaRepository<UsrEmail, Long> {
}
