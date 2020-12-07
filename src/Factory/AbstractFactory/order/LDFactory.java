package Factory.AbstractFactory.order;


import Factory.AbstractFactory.pizza.LDCheesePizza;
import Factory.AbstractFactory.pizza.LDPepperPizza;
import Factory.AbstractFactory.pizza.Pizza;

public class LDFactory implements AbsFactory {
	
	@Override
	public Pizza createPizza(String orderType) {
		System.out.println("~使用的是抽象工厂模式~");
		Pizza pizza = null;
		if (orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;
	}
	
}
