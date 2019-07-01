package com.sui.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.sui.dao.UserMapper;
import com.sui.entity.User;
import com.sui.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userdao;

    @Override
    public int register(User user) {
        return userdao.insert(user);
    }
}
