package com.jxq.controller;

import com.jxq.controller.viewobject.UserVO;
import com.jxq.service.UserService;
import com.jxq.service.model.UserModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/get")
    public UserVO getUser(@RequestParam(name = "id") Integer id) {
        // 调用service服务获取对应的id的用户对象并返回给前端
        UserModel userModel = userService.getUserById(id);
         // 将核心领域模型用户对象转化为可供UI使用的viewobject
        return convertFromModel(userModel);
    }

    private UserVO  convertFromModel(UserModel userModel){
        if (userModel==null){
            return null;
        }
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(userModel, userVO);
        return userVO;
    }
}
