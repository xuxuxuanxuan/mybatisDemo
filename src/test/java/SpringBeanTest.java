import com.sean.entity.User;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: sean.xu
 * @Date: 2020/4/17
 */
public class SpringBeanTest {

    Logger logger = Logger.getLogger(UserMapperTest.class);

    @Autowired
    private User user;
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-config.xml");
//        User user = context.getBean(User.class);
        logger.debug(user);
        ((ClassPathXmlApplicationContext) context).close();
    }
}
