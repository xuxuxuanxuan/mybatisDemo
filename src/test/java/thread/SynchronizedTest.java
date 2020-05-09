package thread;

/**
 * @Author: sean.xu
 * @Date: 2020/5/8
 */
public class SynchronizedTest {
    public synchronized void test1(){

    }
    public void test2(){
        synchronized (this){

        }
    }
}
