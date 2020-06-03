package thread;

/**
 * Daemon线程是一种支持型线程，因为它主要被用作程序中后台调度以及支持性工作。这
 * 意味着，当一个Java虚拟机中不存在非Daemon线程的时候，Java虚拟机将会退出。可以通过调
 * 用Thread.setDaemon(true)将线程设置为Daemon线程。
 *
 * 运行Daemon程序，可以看到在终端或者命令提示符上没有任何输出。main线程（非
 * Daemon线程）在启动了线程DaemonRunner之后随着main方法执行完毕而终止，而此时Java虚拟
 * 机中已经没有非Daemon线程，虚拟机需要退出。Java虚拟机中的所有Daemon线程都需要立即
 * 终止，因此DaemonRunner立即终止，但是DaemonRunner中的finally块并没有执行。
 *
 * 在构建Daemon线程时，不能依靠finally块中的内容来确保执行关闭或清理资源
 * 的逻辑。
 *
 * @Author: sean.xu
 * @Date: 2020/5/28
 */
public class Daemon {
    public static void main(String[] args) {
        Thread thread = new Thread(new DaemonRunner(), "DaemonRunner");
        thread.setDaemon(true);
        thread.start();
    }
    static class DaemonRunner implements Runnable {
        public void run() {
            try {
                Thread.sleep(100);
            }catch (Exception e){

            }finally {
                System.out.println("DaemonThread finally run.");
            }
        }
    }
}
