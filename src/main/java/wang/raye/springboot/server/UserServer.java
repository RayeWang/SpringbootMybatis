package wang.raye.springboot.server;

import java.util.List;

import wang.raye.springboot.model.User;

/**
 * 用户服务
 * @author Raye
 * @since 2016年9月21日20:57:39
 */
public interface UserServer {
	/**
	 * 添加一个用户
	 * @param user 用户对象
	 * @since 2016年9月21日20:58:17
	 * @return 是否添加成功
	 */
	public boolean add(User user);
	/**
	 * 查询所有用户
	 * @return
	 */
	public List<User> findAll();
}
