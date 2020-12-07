package Factory.SimpleFactory.Order;

import Factory.SimpleFactory.Pizza.CheesePizza;
import Factory.SimpleFactory.Pizza.GreekPizza;
import Factory.SimpleFactory.Pizza.PepperPizza;
import Factory.SimpleFactory.Pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    public OrderPizza() {
        Pizza pizza = null;
        String orderType;
        orderType = getType();
        do{
           switch(orderType){
               case "greek":
                   pizza = new GreekPizza();
                   pizza.setName(orderType);
                   break;
               case "cheese":
                   pizza = new CheesePizza();
                   pizza.setName(orderType);
                   break;
               case "pepper":
                   pizza = new PepperPizza();
                   pizza.setName(orderType);
                   break;
               default:
                   System.out.println(" 等待开发,后退一步！ ");
                   break;
           }
           if(pizza!=null){
               pizza.prepare();
               pizza.bake();
               pizza.cut();
               pizza.box();
           }
        }while(orderType.equals("quit"));
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
