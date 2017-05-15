package cn.serge.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.serge.domain.User;
import cn.serge.mapper.UserMapper;
import cn.serge.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	@Override
	public User login(String loginname, String password) {
		
		return userMapper.findWithLoginNameAndPassword(loginname, password);
	}
	
}
