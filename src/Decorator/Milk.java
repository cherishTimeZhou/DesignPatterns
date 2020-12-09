package Decorator;

public class Milk extends Decorator{
    
    //传入被装饰的饮料
    public Milk(Drink drink) {
        super(drink);
        setDescription("牛奶");
        setPrice(1.5f);
    }
    
}
