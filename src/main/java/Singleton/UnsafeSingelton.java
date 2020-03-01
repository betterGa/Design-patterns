package Singleton;

public class UnsafeSingelton {
    private static UnsafeSingelton instance;
    public static UnsafeSingelton getInstance()
    {
        if(instance==null) instance=new UnsafeSingelton();
    return instance;
    }
}
