package service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dao.UserMapper;
import util.SqlSessionFactory;
import vo.User;

public class UserServiceImpl implements Service {
	private UserMapper dao;

	@Override
	public int insertUser(User user) {
		SqlSession sqlSession = SqlSessionFactory.getSqlSession();
		dao = sqlSession.getMapper(UserMapper.class);
		int i = dao.insertUser(user);
		sqlSession.commit();
		return i;
	}

	@Override
	public int updateUser(User user) {
		SqlSession sqlSession = SqlSessionFactory.getSqlSession();
		dao = sqlSession.getMapper(UserMapper.class);
		int i = dao.updateUser(user);
		sqlSession.commit();
		return i;
	}

	@Override
	public int deleteUser(User user) {
		SqlSession sqlSession = SqlSessionFactory.getSqlSession();
		dao = sqlSession.getMapper(UserMapper.class);
		int i = dao.deleteUser(user);
		sqlSession.commit();
		return i;
	}

	@Override
	public User selectById(Integer id) {
		SqlSession sqlSession = SqlSessionFactory.getSqlSession();
		dao = sqlSession.getMapper(UserMapper.class);
		return dao.selectById(id);
	}

	@Override
	public List<User> selectAll() {
		SqlSession sqlSession = SqlSessionFactory.getSqlSession();
		dao = sqlSession.getMapper(UserMapper.class);
		return dao.selectAll();
	}

	@Override
	public User selectByUsername2(String username) {
		SqlSession sqlSession = SqlSessionFactory.getSqlSession();
		dao = sqlSession.getMapper(UserMapper.class);
		return dao.selectByUsername2(username);
	}

	@Override
	public int insertByUsernamePassword(String username, String password) {
		SqlSession sqlSession = SqlSessionFactory.getSqlSession();
		dao = sqlSession.getMapper(UserMapper.class);
		return dao.insertByUsernamePassword(username,password);
	}

}
