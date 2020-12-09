package Decorator;

/**
 * <P><B> 饮料类 </B></P>
 * <P> 抽象饮料类，被调料装饰，与调料既是继承哟是组合关系 </P>
 *
 * Date 2020/12/9 15:08
 * @author Rider Zhou
 * @version 1.0
 **/
public abstract class Drink {
    
    //饮料描述
    public String description;
    
    //价格
    private float price = 0;
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public float getPrice() {
        return price;
    }
    
    public void setPrice(float price) {
        this.price = price;
    }
    
    //抽象价格计算方法，由各个子类实现价格计算
    public abstract float cost();

}
