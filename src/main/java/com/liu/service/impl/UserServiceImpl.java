package com.liu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.liu.mapper.UserMapper;
import com.liu.pojo.User;
import com.liu.pojo.UserExample;
import com.liu.service.UserService;

/**
 * @Project Name:springboot
 * @author 刘佳瑞
 * @Package Name:com.liu.service.impl
 * @date 2018年3月18日下午2:04:05
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> getName() {
		PageHelper.startPage(1, 5);
		return userMapper.selectByExample(new UserExample());
	}
}
