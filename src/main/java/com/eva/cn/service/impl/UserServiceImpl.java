package com.eva.cn.service.impl;

import com.eva.cn.dao.UserDao;
import com.eva.cn.pojo.User;
import com.eva.cn.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Create By ZhangSenWei on 2018/11/16
 **/
@Service
public class UserServiceImpl implements UserService {

    private  static  final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Resource
    private UserDao dao;

    @Override
    public User saveUser(User user) {
        int count = dao.insertSelective(user);
        return user;
    }
}
