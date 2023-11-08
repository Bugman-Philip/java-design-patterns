package bugman;

/*
*   - 饿汉式静态代码块
*   优点缺点与饿汉式-静态变量相同
* */
public class HungerSingletonCodeBlock {
    private final static HungerSingletonCodeBlock hungerSingletonCodeBlock;

    static {
        hungerSingletonCodeBlock = new HungerSingletonCodeBlock();
    }

    private HungerSingletonCodeBlock() {}

    public HungerSingletonCodeBlock getInstance() {
        return hungerSingletonCodeBlock;
    }
}
