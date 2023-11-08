package bugman.simpleFactory;

import bugman.entity.Americano;
import bugman.entity.Cappuccino;
import bugman.entity.Coffee;
import bugman.entity.Latte;

public class SimpleFactory {
    public static Coffee createInstance(String type) {
        if(type == "Americano") {
            return new Americano();
        } else if(type == "Cappuccino") {
            return new Cappuccino();
        } else if(type == "Latte") {
            return new Latte();
        }else{
            throw new RuntimeException("type["+type+"]类型不可识别，没有匹配到可实例化的对象！");
        }
    }
}
