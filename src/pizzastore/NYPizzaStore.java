package pizzastore;

import abstractFactoryClass.CheesePizza;
import abstractFactoryClass.ClamPizza;
import abstractFactoryClass.PepperoniPizza;
import abstractFactoryClass.Pizza;
import abstractFactoryClass.VeggiePizza;
import ingredientFactory.NYPizzaIngredientFactory;
import ingredientFactory.PizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		if ("cheese".equalsIgnoreCase(item)) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza !!");
		} else if ("veggie".equalsIgnoreCase(item)) {
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("New York Style Veggie Pizza !!");
		} else if ("clam".equalsIgnoreCase(item)) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza !!");
		} else if ("pepperoni".equalsIgnoreCase(item)) {
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("New York Style Pepperoni Pizza  !!");
		}
		return pizza;
	}

}
