package com.google.Music_StreamingServiceAPI.repository;

import com.google.Music_StreamingServiceAPI.model.AuthTokenUser;
import com.google.Music_StreamingServiceAPI.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAuthenticateDao extends JpaRepository<AuthTokenUser,Integer> {
    AuthTokenUser findByUser(User user);
}
