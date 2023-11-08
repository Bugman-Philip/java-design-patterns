package bugman;

/*
*   - 饿汉式
*       优点：类装载的时候就完成实例化，避免线程安全问题
*       缺点：在类装载的时候就完成实例化，没有达到lazyloading的效果，如果始终未使用过这个实例，会造成内存浪费
*
* */

public class HungerSingleton {
    private final static HungerSingleton hungerSingleton = new HungerSingleton();
    private HungerSingleton() { }
    public static HungerSingleton getInstance() {
        return hungerSingleton;
    }
}
