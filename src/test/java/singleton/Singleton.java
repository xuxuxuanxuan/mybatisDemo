package singleton;

/**
 * @Author: sean.xu
 * @Date: 2020/5/13
 */
public class Singleton {

    /**
     * 双重校验锁 实现单例
     */
    private volatile static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }

            }
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton.getInstance();
    }
}
