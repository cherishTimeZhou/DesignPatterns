package Factory.FactoryMethod.order;


import Factory.FactoryMethod.Pizza.LDCheesePizza;
import Factory.FactoryMethod.Pizza.LDPepperPizza;
import Factory.FactoryMethod.Pizza.Pizza;

public class LDOrderPizza extends OrderPizza {

	
	@Override
	Pizza createPizza(String orderType) {
	
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		// TODO Auto-generated method stub
		return pizza;
	}

}
