package Decorator;

public class Chocolate extends Decorator {
    
    //传入被装饰的饮料
    public Chocolate(Drink drink) {
        super(drink);
        setDescription("巧克力");
        setPrice(2.5f);
    }
    
    @Override
    public float cost() {
        return super.cost();
    }
    
    @Override
    public String getDescription() {
        return super.getDescription();
    }
}
