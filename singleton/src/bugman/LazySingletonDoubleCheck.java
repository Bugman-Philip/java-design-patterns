package bugman;

/*
*   - 双重检查
*       线程安全，延时加载，效率较高
* */
public class LazySingletonDoubleCheck {
    private volatile static LazySingletonDoubleCheck lazySingletonDoubleCheck;

    private LazySingletonDoubleCheck(){}

    public static LazySingletonDoubleCheck getInstance() {
        if(lazySingletonDoubleCheck == null) {
            synchronized (LazySingletonDoubleCheck.class) {
                if(lazySingletonDoubleCheck == null) {
                    lazySingletonDoubleCheck = new LazySingletonDoubleCheck();
                }
            }
        }
        return lazySingletonDoubleCheck;
    }
}
