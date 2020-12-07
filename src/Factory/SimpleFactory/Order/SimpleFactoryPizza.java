package Factory.SimpleFactory.Order;

import Factory.SimpleFactory.Pizza.CheesePizza;
import Factory.SimpleFactory.Pizza.GreekPizza;
import Factory.SimpleFactory.Pizza.PepperPizza;
import Factory.SimpleFactory.Pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleFactoryPizza {
    
    /**
     * 使用简单工厂创建披萨
     *
     * @param orderType pizza 类型
     * @return
     * @author Rider Zhou
     * @version v1.0.0 2020/12/1 19:24
     **/
    public Pizza creatPizza(String orderType) {
        Pizza pizza = null;
    
        do {
            switch (orderType) {
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
                    break;
            }
            return pizza;
        } while (true);
    }
}
