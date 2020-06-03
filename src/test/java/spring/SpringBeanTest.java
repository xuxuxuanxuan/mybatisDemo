package spring;

import com.sean.spring.bean.B;
import com.sean.spring.bean.ExampleBean;
import com.sean.spring.bean.UserFactory;
import mybatis.UserMapperTest;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: sean.xu
 * @Date: 2020/4/17
 */
public class SpringBeanTest {

    Logger logger = Logger.getLogger(UserMapperTest.class);

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-config.xml");
        UserFactory bean = context.getBean(UserFactory.class);
        logger.debug(bean);
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/application-context.xml");
        B bean  = context.getBean(B.class);
        logger.debug(bean);

    }

    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-config.xml");
        ExampleBean bean = context.getBean(ExampleBean.class);
        logger.debug(bean.getExample());
    }
}
