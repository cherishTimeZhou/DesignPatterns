package Factory.FactoryMethod.order;


import Factory.FactoryMethod.Pizza.BJCheesePizza;
import Factory.FactoryMethod.Pizza.BJPepperPizza;
import Factory.FactoryMethod.Pizza.Pizza;

public class BJOrderPizza extends OrderPizza {

	
	@Override
	Pizza createPizza(String orderType) {
	
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new BJPepperPizza();
		}
		// TODO Auto-generated method stub
		return pizza;
	}

}
