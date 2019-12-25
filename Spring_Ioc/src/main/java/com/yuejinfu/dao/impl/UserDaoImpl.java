package com.yuejinfu.dao.impl;

import com.yuejinfu.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    public void save() {
        System.out.println("save Running...");

    }
}
