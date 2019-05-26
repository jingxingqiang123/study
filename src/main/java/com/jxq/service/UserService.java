package com.jxq.service;

import com.jxq.service.model.UserModel;

public interface UserService {
    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    UserModel getUserById(Integer id);
}
