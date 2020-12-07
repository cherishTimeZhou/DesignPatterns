package Factory.SimpleFactory.Order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <P><B> 简单工厂-PizzaStore </B></P>
 * <P> 相当于一个客户端 </P>
 *
 * Date 2020/12/1 19:11
 * @author Rider Zhou
 * @version 1.0
 **/
public class PizzaStore {
    public static void main(String[] args) {
        try{
            BufferedReader strIn = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(" input type: ");
            String str = strIn.readLine();
            if(str.equals("simple")){
                System.out.println(" 进入简单工厂模式！ ");
                new OrderPizza1(new SimpleFactoryPizza());
            } else {
                new OrderPizza();
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        
    }
}
