package Template;
//游子回家

//定义为父类/抽象类
//重构了HappyPeople类为抽象父类，
// 它包含了一个抽象方法travel()供子类实现各自自定义的回家方式
//celebrateSpringFestival()方法保证了subcribeTicket()方法， travel();
//    celebrate()方法按顺序执行。

public abstract class HappyPeople {
public void celebrateSpringFestival()
{
    subscribeTicket();
    travel();
    celebrate();
    hook();
}
//买票
protected final void subscribeTicket()
{System.out.println("buying ticket...");}
//交给子类各自覆写回家方式
protected abstract void travel();
protected final void celebrate()
{
System.out.println("Happy Chinese New Year!");
}

//可以有“默认不做事的方法”，称之为“钩子hook”
    //子类可以视情况而定要不要覆盖它们。
void hook()
{}


}


    /**
//Buy ticket...
System.out.println("Buy ticket...");

//Traveling by train...
    System.out.println("Traveling by train");

    //Celebrating Chinese new year...
    System.out.println("Happy Chinese New Year!");}}
     */

