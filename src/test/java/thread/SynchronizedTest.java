package thread;

/**
 * @Author: sean.xu
 * @Date: 2020/5/8
 */
public class SynchronizedTest {

    int i = 0;

    public void test1(){
        synchronized (SynchronizedTest.class){
            i++;
        }
    }
}
