package com.google.Music_StreamingServiceAPI.repository;

import com.google.Music_StreamingServiceAPI.model.Admin;
import com.google.Music_StreamingServiceAPI.model.AuthTokenAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAuthenticateAdminDao extends JpaRepository<AuthTokenAdmin,Integer> {
    AuthTokenAdmin findByAdmin(Admin admin);
}
