package pizzas;

import ingredientFactory.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {
	private PizzaIngredientFactory pizzaIngredientFactory;

	public VeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing: " + super.getName());
		super.setDough(pizzaIngredientFactory.createDough());
		super.setSauce(pizzaIngredientFactory.createSauce());
		super.setCheese(pizzaIngredientFactory.createCheese());
		super.setVeggies(pizzaIngredientFactory.createVeggies());

	}

}
