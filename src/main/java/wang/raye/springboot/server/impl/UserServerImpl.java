package wang.raye.springboot.server.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import wang.raye.springboot.model.User;
import wang.raye.springboot.model.mapper.UserMapper;
import wang.raye.springboot.server.UserServer;
/**
 * 用户相关数据库操作实现类
 * @author Raye
 * @since 2016年10月11日19:29:02
 */
@Repository
public class UserServerImpl implements UserServer {
	@Autowired
	private UserMapper mapper;
	
	public boolean add(User user) {
		return mapper.insert(user) > 0;
	}

	public List<User> findAll() {
		return mapper.selectByExample(null);
	}

}
