package com.auroralove.mybatis.plus.demo.service.impl;

import com.auroralove.mybatis.plus.demo.dao.UserMapper;
import com.auroralove.mybatis.plus.demo.entity.User;
import com.auroralove.mybatis.plus.demo.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author ：zyu
 * @date ：2020/5/22 18:13
 */
@Service("UserServiceImpl")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {



}
