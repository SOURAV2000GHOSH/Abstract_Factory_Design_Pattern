package pizzas;

import ingredientFactory.PizzaIngredientFactory;

public class ClamPizza extends Pizza {
	private PizzaIngredientFactory pizzaIngredientFactory;

	public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing: " + super.getName());
		super.setDough(pizzaIngredientFactory.createDough());
		super.setSauce(pizzaIngredientFactory.createSauce());
		super.setCheese(pizzaIngredientFactory.createCheese());
		super.setClams(pizzaIngredientFactory.createClams());

	}

}
