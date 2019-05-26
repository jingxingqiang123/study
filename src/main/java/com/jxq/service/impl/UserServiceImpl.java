package com.jxq.service.impl;

import com.jxq.dao.UserPasswordDOMapper;
import com.jxq.dataobject.UserPasswordDO;
import com.jxq.service.UserService;
import com.jxq.dao.UserDOMapper;
import com.jxq.dataobject.UserDO;
import com.jxq.service.model.UserModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDOMapper userDOMapper;

    @Autowired
    private UserPasswordDOMapper userPasswordDOMapper;

    @Override
    public UserModel getUserById(Integer id) {
        // 调用userDOMapper获取到对应的dataObject
        UserDO userDO = userDOMapper.selectByPrimaryKey(id);
        if (userDO == null) {
            return null;
        }
        // 通过用户id获取对应的用户加密密码信息
        UserPasswordDO userPasswordDO = userPasswordDOMapper.selectByPrimaryKey(userDO.getId());
        return convertFromDataObject(userDO, userPasswordDO);

    }
    // 将用户信息和密码转化封装在UserModel中
    private UserModel convertFromDataObject(UserDO userDO, UserPasswordDO userPasswordDO) {
        if (userDO == null) {
            return null;
        }
        UserModel userModel = new UserModel();
        //source:userDO  target:userModle
        BeanUtils.copyProperties(userDO, userModel);
        if (userPasswordDO != null) {
            userModel.setEncrptPassword(userPasswordDO.getEncrptPassword());
        }
        return userModel;
    }
}
