package Decorator;

public class Soy extends Decorator {
    
    //传入被装饰的饮料
    public Soy(Drink drink) {
        super(drink);
        setDescription("豆浆");
        setPrice(2.0f);
    }
}
