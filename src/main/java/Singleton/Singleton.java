package Singleton;
//为了限制 该类的对象 被随意创建，需要保证该类构造方法是私有的,
//  这样外部类就无法创建该类的对象了。

//另外，为了方便给客户对象 提供 对此到哪里对象的使用 ，我们为它提供了一个全局访问点。
public class Singleton {

    //instance 变量是私有的，外界无法访问

    //JVM 对 static 属性的变量 的初始化 只能由一个线程执行 且一次
    private static Singleton instance=new Singleton();

    private Singleton(){}

    public static Singleton getInstance()
    {return instance;}


    public static void main(String[] args) {
        Singleton singleton=Singleton.getInstance();
    }
}

