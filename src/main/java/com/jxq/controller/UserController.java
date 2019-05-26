package com.jxq.controller;

import com.jxq.controller.viewobject.BaseController;
import com.jxq.controller.viewobject.UserVO;
import com.jxq.error.BusinessException;
import com.jxq.error.EmBusinessError;
import com.jxq.response.CommonReturnType;
import com.jxq.service.UserService;
import com.jxq.service.model.UserModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    @RequestMapping("/get")
    public CommonReturnType getUser(@RequestParam(name = "id") Integer id) throws BusinessException {
        // 调用service服务获取对应的id的用户对象并返回给前端
        UserModel userModel = userService.getUserById(id);

        // 若获取对应用户信息不存在
        if (userModel == null)
           throw new BusinessException(EmBusinessError.USER_NOT_EXIST);


        // 将核心领域模型用户对象转化为可供UI使用的viewobject
        UserVO userVO = convertFromModel(userModel);

        // 返回通用对象
        return CommonReturnType.create(userVO);
    }

    private UserVO convertFromModel(UserModel userModel) {
        if (userModel == null) {
            return null;
        }
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(userModel, userVO);
        return userVO;
    }


}
