package com.jsf.ssm.service.impl;

import com.jsf.ssm.bean.User;
import com.jsf.ssm.dao.UserDao;
import com.jsf.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @FileName UserServiceImpl
 * @Author JSF
 * @date 2024-11-12
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User getById(Long id) {
        return userDao.selectById(id);
    }
}
