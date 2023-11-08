package bugman;

/*
*   - 单例模式，静态内部类实现
*   有点： 避免线程不安全，延迟加载，效率高
* */
public class SingletonInnerClass {
    private SingletonInnerClass() {}

    private static class Singleton {
        private static final SingletonInnerClass singletonInnerClass = new SingletonInnerClass();
    }

    public static SingletonInnerClass getInstance() {
        return Singleton.singletonInnerClass;
    }
}

class Singleton {
    private static Singleton singleton;
    private Singleton() {}
    private static class InnerClass {
       private static Singleton singleton = new Singleton();
    }

    public static Singleton getInstance(){
        return InnerClass.singleton;
    }
}

