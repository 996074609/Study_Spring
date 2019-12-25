package com.yuejinfu.service.impl;

import com.yuejinfu.dao.UserDao;
import com.yuejinfu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public void save() {
        userDao.save();
    }
}
