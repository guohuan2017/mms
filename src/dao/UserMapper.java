package dao;

import java.util.List;
import vo.User;

public interface UserMapper {

	int insertUser(User user);
	
	int insertByUsernamePassword(String username, String password);

	int updateUser(User user);

	int deleteUser(User user);

	User selectById(Integer id);

	List<User> selectAll();
	
	List<Integer> selectId(User user);
	
	List<User> selectByUsernamePassword(User user);

	List<User> selectByUsername(String username);

	User selectByUsername2(String username);

	List<User> selectByUsernamePassword2(int id, String password);
	
	List<User> selectByIdList(List<Integer> ids);
	
	
}
