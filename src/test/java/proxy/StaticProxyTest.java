package proxy;

import com.sean.Service.impl.StudentImpl;
import com.sean.Service.impl.StudentProxy;

/**
 * @Author: sean.xu
 * @Date: 2020/5/8
 */
public class StaticProxyTest {

    public static void main(String[] args) {
        StudentImpl student = new StudentImpl("小王");
        StudentProxy studentProxy = new StudentProxy(student);
        studentProxy.handWork();
    }
}
