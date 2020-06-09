package thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Author: sean.xu
 * @Date: 2020/5/8
 */
public class LockTest {

    public void test(){
        int a = 0;
        Lock lock = new ReentrantLock();
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        readLock.lock();
        lock.newCondition();
        readLock.unlock();
        lock.lock();
        lock.tryLock();
        try{
            a++;
        }finally {
            lock.unlock();
        }
    }
}
