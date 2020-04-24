import com.sean.entity.User;
import com.sean.entity.UserParam;
import com.sean.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;
import java.util.Properties;

/**
 * @Author: sean.xu
 * @Date: 2020/4/17
 */
public class UserMapperTest {

    Logger logger = Logger.getLogger(UserMapperTest.class);
    @Test
    public void findUser(){
        SqlSession sqlSession = getSessionFactory().openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.findUserByName("熊");

        logger.debug(user);
    }

    @Test
    public void findUserByTime(){
        SqlSession sqlSession = getSessionFactory().openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.findUserByNameAndTime("熊",new Date());

        logger.debug(user);
    }

    @Test
    public void findUserAll(){
        SqlSession sqlSession = getSessionFactory().openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.findUser(null,null,"111");

        logger.debug(user);
    }

    @Test
    public void findUserByAge(){
        SqlSession sqlSession = getSessionFactory().openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> user = userMapper.findUserByAge(new int[]{18,20});

        logger.debug(user);
    }
    @Test
    public void insertUser(){
        SqlSession sqlSession = getSessionFactory().openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setAge(22);
        user.setName("小熊");
        user.setMobile("176");

        userMapper.insertUser(user);
        logger.info(user);
        sqlSession.commit();
    }

    @Test
    public void updateUser(){
        SqlSession sqlSession = getSessionFactory().openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        userMapper.updateUserByName(null,"小熊");
        sqlSession.commit();
    }

    @Test
    public void deleteUser(){
        SqlSession sqlSession = getSessionFactory().openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        userMapper.deleteUser("小熊");
        sqlSession.commit();
    }


    public static SqlSessionFactory getSessionFactory(){
        SqlSessionFactory sqlSessionFactory = null;
        String resource = "mybatis-config.xml";
        try {
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader(resource));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sqlSessionFactory;
    }

    public static SqlSessionFactory getSessionFactory2(){
        SqlSessionFactory sqlSessionFactory = null;
        String resource = "mybatis-config.xml";
        InputStream inputStream;
        try {
            InputStream in = Resources.getResourceAsStream("configuration.properties");
            Properties properties = new Properties();
            properties.load(in);
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");
            properties.put("username",username);
            properties.put("password",password);
            inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream,properties);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sqlSessionFactory;
    }
}
