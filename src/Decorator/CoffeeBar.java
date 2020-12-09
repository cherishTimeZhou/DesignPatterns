package Decorator;

import java.util.Scanner;

public class CoffeeBar {
    
    //全局输入流
    private static final Scanner inputStream = new Scanner(System.in);
    
    public static void main(String[] args) {
        //装饰者模式下订单
    
        System.out.println("=====================欢迎来到本店，请问客观需要点些什么嘛？=====================");
        System.out.println("本店有意大利、美式、无糖三种咖啡和巧克力、牛奶、豆浆三种调料，调料可以随意选择哦！");
    
        String drinkType = inputStream.nextLine();
//        int seasoningCnt = inputStream.nextInt();
        
        while(!drinkType.equals("quit")){
            
            Drink order = null;
            switch (drinkType){
                case "espresso":
                    System.out.print("您的点的是意大利咖啡,");
                    order = new Espresso();
                    break;
                case "longBlack":
                    System.out.print("您的点的是美式咖啡,");
                    order = new LongBlack();
                    break;
                case "shortBlack":
                    System.out.print("您的点的是无糖咖啡,");
                    order = new ShortBlack();
                    break;
                default:
                    System.out.println("我们店会尽快研发新的咖啡，欢迎您的意见。");
                    break;
            }
            
            while (order != null){
                System.out.println("请问客官您需要配料嘛？");
                String seasoningType = inputStream.nextLine();
    
                switch (seasoningType){
                    case "chocolate":
                        order = new Chocolate(order);
                        break;
                    case "milk":
                        order = new Milk(order);
                        break;
                    case "soy":
                        order = new Soy(order);
                        break;
                    default:
                        break;
                }
                System.out.println("客官您点的是：" + order.getDescription()
                        + "收费明细：" + order.cost() +
                        "，这是您的咖啡，小心烫哦，拿好慢走，欢迎您的再来！！ ");
                break;
            }
            break;
            
        }
        inputStream.close();
    
    
        try {
            Thread.sleep(2000);
    
            System.out.println("私家研究：");
            
            Drink drink1 = new Espresso();
            Drink drink2 = new LongBlack();
            Drink drink3 = new ShortBlack();
            
            drink1 = new Chocolate(drink1);
            drink1 = new Chocolate(drink1);
            drink1 = new Milk(drink1);
            System.out.println(drink1.getDescription() + "\n" + drink1.cost());
            
            drink2 = new Milk(drink2);
            drink2 = new Soy(drink2);
            drink2 = new Soy(drink2);
            System.out.println(drink2.getDescription() + "\n" + drink2.cost());
    
            drink3 = new Milk(drink3);
            drink3 = new Milk(drink3);
            drink3 = new Soy(drink3);
            drink3 = new Soy(drink3);
            drink3 = new Chocolate(drink3);
            System.out.println(drink3.getDescription() + "\n" + drink3.cost());
    
    
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
