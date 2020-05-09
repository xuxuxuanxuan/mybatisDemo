package proxy;

import com.sean.Service.CglibProxy;
import com.sean.Service.impl.StudentCglib;
import net.sf.cglib.proxy.Enhancer;


/**
 * @Author: sean.xu
 * @Date: 2020/5/8
 */
public class CglibTest {

    public static void main(String[] args) {
        //CGLIB enhancer增强类对象
        Enhancer enhancer = new Enhancer();
        //设置增强类型
        enhancer.setSuperclass(StudentCglib.class);
        //定义代理逻辑对象为当前对象，要求当前对象实现MethodInterceptor方法
        enhancer.setCallback(new CglibProxy());
        //生成并返回代理对象
        StudentCglib proxy = (StudentCglib)enhancer.create();
        proxy.handWork("小王");
    }
}
