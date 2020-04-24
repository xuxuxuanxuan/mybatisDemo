import com.sean.entity.*;
import com.sean.mapper.GradeMapper;
import com.sean.mapper.HonorMapper;
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
import java.util.List;
import java.util.Properties;

/**
 * @Author: sean.xu
 * @Date: 2020/4/17
 */
public class GradeMapperTest {

    Logger logger = Logger.getLogger(GradeMapperTest.class);
    @Test
    public void findGrade(){
        SqlSession sqlSession = SessionUtil.getSession();
        GradeMapper mapper = sqlSession.getMapper(GradeMapper.class);
        Grade grade = mapper.findGradeBySlogan("加油加油，我最强");
        for (Student stu : grade.getStudentList()){
            logger.info(stu);
        }
    }

    @Test
    public void findHonor(){
        SqlSession sqlSession = SessionUtil.getSession();
        HonorMapper mapper = sqlSession.getMapper(HonorMapper.class);
        Honor honor = mapper.findHonorByType("最佳卖力奖");

        for(Grade grade : honor.getGradeList()){

            logger.info("班级："+grade.getClassName()+",学生信息："+grade.getStudentList());
        }
    }

}
