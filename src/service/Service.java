package service;

import java.util.List;

import vo.User;

public interface Service {
	int insertUser(User user);

	int insertByUsernamePassword(String username, String password);
	
	int updateUser(User user);

	int deleteUser(User user);

	User selectById(Integer id);

	List<User> selectAll();

	User selectByUsername2(String username);

}
