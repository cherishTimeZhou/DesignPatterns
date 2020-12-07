package Factory.SimpleFactory.Order;

import Factory.SimpleFactory.Pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza1 {

    public OrderPizza1(SimpleFactoryPizza simpleFactoryPizza){
        setFactory(simpleFactoryPizza);
    }
 
    Pizza pizza = null;
    SimpleFactoryPizza simpleFactoryPizza;
    
    public void setFactory(SimpleFactoryPizza simpleFactoryPizza){
        String orderType;
        orderType = getType();
        this.simpleFactoryPizza = simpleFactoryPizza;
        do {
           
            
            pizza = this.simpleFactoryPizza.creatPizza(orderType);
            
            if(pizza != null){
               pizza.prepare();
               pizza.bake();
               pizza.cut();
               pizza.box();
            } else {
                System.out.println(" 订购披萨失败！！！ ");
                break;
            }
        } while(orderType.equals("quit"));
    }
    
    
    
    private String getType(){
        try{
            BufferedReader strIn = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(" input pizza type: ");
            String str = strIn.readLine();
            return str;
        } catch (IOException e){
            return "";
        }
    }
}
