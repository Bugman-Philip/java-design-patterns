package bugman;

/*
*   - 懒汉式(线程不安全)
*       起到了懒加载的作用，只能在单线程模式下使用，多线程可能会造成多个实例
* */
public class LazySingleton {
    private static LazySingleton lazySingleton;

    private LazySingleton(){}

    public static LazySingleton getInstance() {
        if(lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
