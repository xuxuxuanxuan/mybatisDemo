package thread;

/**
 * @Author: sean.xu
 * @Date: 2020/5/9
 */
public class SynchronizedTest2 implements Runnable{

    volatile static int count = 0;

    public void run() {
       synchronized (this){
           for(int i = 0; i < 5; i++){
               try {
                   System.out.println(Thread.currentThread().getName() + ":" + (count++));
                   Thread.sleep(100);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
       }
    }

    public static void main(String[] args) {
        SynchronizedTest2 test1 = new SynchronizedTest2();
        SynchronizedTest2 test2 = new SynchronizedTest2();

        Thread thread1 = new Thread(test1);
        Thread thread2 = new Thread(test2);
        thread1.start();
        thread2.start();

    }
}
