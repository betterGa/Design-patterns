package Singleton;

public class DoublieCheckSingleton {

    private volatile static DoublieCheckSingleton instance=null;

    public static DoublieCheckSingleton getInstance()
    {
        if(instance==null)
            //如果未被创建实例，使用 synchronized
            synchronized (DoublieCheckSingleton.class)
            {//再进行一次检查，保证只产生一个实例
                if(instance==null)
            instance=new DoublieCheckSingleton();
            }

        return instance;
    }




}
