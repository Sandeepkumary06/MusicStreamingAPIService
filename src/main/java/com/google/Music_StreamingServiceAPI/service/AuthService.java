package com.google.Music_StreamingServiceAPI.service;

import com.google.Music_StreamingServiceAPI.model.Admin;
import com.google.Music_StreamingServiceAPI.model.AuthTokenAdmin;
import com.google.Music_StreamingServiceAPI.model.AuthTokenUser;
import com.google.Music_StreamingServiceAPI.model.User;
import com.google.Music_StreamingServiceAPI.repository.IAuthenticateAdminDao;
import com.google.Music_StreamingServiceAPI.repository.IAuthenticateDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    IAuthenticateDao authenticateDao;

    @Autowired
    IAuthenticateAdminDao authenticateAdminDao;

    //Save Token For User
    public void saveToken(AuthTokenUser token) {
        authenticateDao.save(token);
    }

    //Get Token For User
    public AuthTokenUser getToken(User user) {
        return authenticateDao.findByUser(user);
    }

    public void saveAdminToken(AuthTokenAdmin token) {
        authenticateAdminDao.save(token);
    }

    public AuthTokenAdmin getAdminToken(Admin admin) {
        return authenticateAdminDao.findByAdmin(admin);
    }
}
