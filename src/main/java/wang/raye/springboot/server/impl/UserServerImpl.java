package wang.raye.springboot.server.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wang.raye.springboot.model.User;
import wang.raye.springboot.model.mapper.UserMapper;
import wang.raye.springboot.server.UserServer;

@Service
public class UserServerImpl implements UserServer {
	@Autowired
	private UserMapper mapper;
	
	public boolean add(User user) {
		return mapper.insert(user) > 0;
	}

}
