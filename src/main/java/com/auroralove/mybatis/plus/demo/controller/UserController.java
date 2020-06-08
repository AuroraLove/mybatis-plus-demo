package com.auroralove.mybatis.plus.demo.controller;

import com.auroralove.mybatis.plus.demo.entity.User;
import com.auroralove.mybatis.plus.demo.service.impl.UserServiceImpl;
import com.auroralove.mybatis.plus.demo.util.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：zyu
 * @date ：2020/5/22 21:19
 */
@RestController
public class UserController {

    @Autowired
    @Qualifier("UserServiceImpl")
    private UserServiceImpl userServiceImpl;

    //http://localhost:9092/get/all
    @GetMapping("/get/all")
    public String getUser(){
        List<User> list = userServiceImpl.list();
        return JsonUtils.objectToJson(list);
    }

    //http://localhost:9092/insert?id=1&name=zyu
    @GetMapping("/insert")
    public String insert(Long id,String name){
        boolean result = userServiceImpl.save(new User(id, name));
        return JsonUtils.objectToJson(result);
    }
}
