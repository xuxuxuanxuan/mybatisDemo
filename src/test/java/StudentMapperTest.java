import com.sean.entity.Student;
import com.sean.entity.User;
import com.sean.entity.UserParam;
import com.sean.mapper.StudentMapper;
import com.sean.mapper.UserMapper;
import com.sean.utils.SessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Author: sean.xu
 * @Date: 2020/4/17
 */
public class StudentMapperTest {

    Logger logger = Logger.getLogger(StudentMapperTest.class);
    @Test
    public void findStudentByIdCard(){
        SqlSession sqlSession = SessionUtil.getSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Student student = mapper.findStudentByIdCard("2020001");
        logger.debug(student);
    }
}
