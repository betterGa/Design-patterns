package Singleton;

public class LazyLoadedSingleton {

    private LazyLoadedSingleton()
    {}

    //静态内部类
        private static class LazyLoader
        {
            //在这个静态内部类中，
            //有个 static 静态属性
            private static final LazyLoadedSingleton singleInstance
                    =new LazyLoadedSingleton();
        }

        //第一次调用 getInstance 方法时，才会加载 LazyLoader 类
        public static LazyLoadedSingleton getInstance()
        {return LazyLoader.singleInstance;}

    }

