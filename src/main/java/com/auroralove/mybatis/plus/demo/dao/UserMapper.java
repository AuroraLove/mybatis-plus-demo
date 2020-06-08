package com.auroralove.mybatis.plus.demo.dao;

import com.auroralove.mybatis.plus.demo.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
