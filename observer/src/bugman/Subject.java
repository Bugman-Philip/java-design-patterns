package bugman;


/*
*   - 观察者模式
*       1个被观察抽象类，包含一个观察者的对象的数组，包含观察者的add,remove,以及通知所有观察者的方法
*       观察者包含一个update方法，用于观察到变化后的操作
*
* */
import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> container = new ArrayList<>();

    public void addObserver(Observer observer) {
        container.add(observer);
    }

    public void removeObserve(Observer observer) {
        container.remove(observer);
    }

    public void notifyObserve(Object object) {
        for (Observer observer: container) {
            observer.update(object);
        }
    }
}
