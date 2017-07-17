package test;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Ignore;


import dao.UserMapper;
import service.Service;
import service.UserServiceImpl;
import util.SqlSessionFactory;
import vo.User;

public class Test {
	int a = 10;
    @Ignore
	@org.junit.Test
	public void test(){
		Service service = new UserServiceImpl();
		//System.out.println(service.insertByUsernamePassword("ad", "er"));
		//System.out.println(service.insertUser(new User("kmm", "123")));
		System.out.println(service.updateUser(new User("kmm", "0")));
		//System.out.println(service.deleteUser(new User("kmm", "426")));
		//System.out.println(service.selectById(1).toString());
		//System.out.println(service.selectByUsername2("kmm").toString());
//		List<User> list = service.selectAll();
//		for(User user : list){
//			System.out.println(user.toString());
//		}
	}
	
    private SqlSession sqlSession;
    
    @Before
    public void getSession(){
    	sqlSession = SqlSessionFactory.getSqlSession();
    	
    }
    
    @Ignore
    @org.junit.Test
    public void test1(){
    	 UserMapper dao = sqlSession.getMapper(UserMapper.class);
    	 List<Integer> list = dao.selectId(new User("kmm","123"));
    	 for(int user: list){
    		 System.out.println(user);
    	 }
    }
    
    @Ignore
    @org.junit.Test
    public void test2(){
    	 UserMapper dao = sqlSession.getMapper(UserMapper.class);
    	 List<User> list = dao.selectByUsernamePassword(new User("kmm","123"));
    	 for(User user: list){
    		 System.out.println(user);
    	 }
    }
    
    @Ignore
    @org.junit.Test
    public void test3(){
    	 UserMapper dao = sqlSession.getMapper(UserMapper.class);
    	 List<User> list = dao.selectByUsername("kmm");
    	 for(User user: list){
    		 System.out.println(user);
    	 }
    }
    
    @Ignore
    @org.junit.Test
    public void test4(){
    	 UserMapper dao = sqlSession.getMapper(UserMapper.class);
    	 List<User> list = dao.selectByUsernamePassword2(1,"kmm");
    	 for(User user: list){
    		 System.out.println(user);
    	 }
    }
    
    @org.junit.Test
    public void test5(){
    	List<Integer> ids = new ArrayList<Integer>();
    	for (int i = 0; i < 4; i++) {
			ids.add(i);
		}
    	
    	UserMapper dao = sqlSession.getMapper(UserMapper.class);
    	List<User> list = dao.selectByIdList(ids);
    	for(User user: list){
    		System.out.println(user);
    	}
    	int a[] = new int[10];
    	a[0] = 1;
    	for(int b: a){
    		System.out.println(b);
    	}
    	System.out.println(String.valueOf(123));
    }
    
    
	
	
}