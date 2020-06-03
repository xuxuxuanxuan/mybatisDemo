package thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: sean.xu
 * @Date: 2020/5/8
 */
public class LockTest {

    public void test(){
        int a = 0;
        Lock lock = new ReentrantLock();
        lock.lock();
        lock.tryLock();
        try{
            a++;
        }finally {
            lock.unlock();
        }
    }
}
