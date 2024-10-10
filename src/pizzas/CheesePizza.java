package pizzas;

import ingredientFactory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
	private PizzaIngredientFactory pizzaIngredientFactory;

	public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
		super();
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing: " + super.getName());
		super.setDough(pizzaIngredientFactory.createDough());
		super.setSauce(pizzaIngredientFactory.createSauce());
		super.setCheese(pizzaIngredientFactory.createCheese());

	}

}
