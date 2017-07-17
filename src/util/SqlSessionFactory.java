package util;

import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class SqlSessionFactory {

	// 由此对象来获取对应的Mapper对象
	private static SqlSession sqlSession;

	// 通过静态块获取SqlSession
	static {
		try {
			// 获取MyBatis的配置文件
			Reader reader = Resources.getResourceAsReader("configuration.xml");
			// 创建SqlSessionFactory对象，用于获取SqlSession对象
			org.apache.ibatis.session.SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
			// 获取SqlSession对象
			sqlSession = factory.openSession();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// 获取SqlSession对象
	public static SqlSession getSqlSession() {
		return sqlSession;
	}

	// 关闭SqlSession对象
	public static void closeSqlSession() {
		if (sqlSession != null) {
			sqlSession.close();
		}
	}

}
