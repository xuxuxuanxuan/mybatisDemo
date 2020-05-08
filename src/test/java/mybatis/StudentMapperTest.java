package mybatis;

import com.sean.entity.Student;
import com.sean.mapper.StudentMapper;
import com.sean.utils.SessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

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
