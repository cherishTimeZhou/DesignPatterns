package Decorator;

public class Decorator extends Drink{
    
    //需要装饰的饮料
    private Drink drink;
    
    //组合关系
    public Decorator(Drink drink){
        this.drink = drink;
    }
    
    @Override
    public float cost() {
        return super.getPrice() + drink.cost();
    }
    
    @Override
    public String getDescription() {
        return this.description + "&&" + drink.getDescription();
    }
    
}
