package thread;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: sean.xu
 * @Date: 2020/5/9
 */
public class SynchronizedMethod {

    static  int i = 0;

    public synchronized void method() {
        System.out.println("Hello World!");
    }

    public synchronized void increase()
    {
        i++;
    }


}
