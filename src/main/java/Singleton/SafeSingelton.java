package Singleton;


public class SafeSingelton {
    private static SafeSingelton instance;

    //这样，再多线程 都只会 实例化一个单例对象
    public static synchronized SafeSingelton getInstance() {
        if (instance == null) instance = new SafeSingelton();
        return instance;

    }
}