package proxy;

import com.sean.Service.Student;
import com.sean.Service.impl.StudentImpl;
import com.sean.Service.impl.StudentInvocationHandler;

import java.lang.reflect.Proxy;

/**
 * @Author: sean.xu
 * @Date: 2020/5/8
 */
public class ProxyTest {

    public static void main(String[] args) {
        StudentImpl student = new StudentImpl("小王");
        StudentInvocationHandler studentInvocationHandler = new StudentInvocationHandler(student);
        Student studentProxy = (Student)Proxy.newProxyInstance(Student.class.getClassLoader(), new Class[]{Student.class}, studentInvocationHandler);
        studentProxy.handWork();
    }
}
