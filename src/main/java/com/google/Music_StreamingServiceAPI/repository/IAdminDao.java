package com.google.Music_StreamingServiceAPI.repository;

import com.google.Music_StreamingServiceAPI.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdminDao extends JpaRepository<Admin, Integer> {
    Admin findFirstByAdminEmail(String email);

    Admin findByAdminEmail(String signInMail);
}
