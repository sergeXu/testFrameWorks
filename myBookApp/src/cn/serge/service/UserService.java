package cn.serge.service;

import cn.serge.domain.User;

public interface UserService {
	User login(String loginname,String password);
}
