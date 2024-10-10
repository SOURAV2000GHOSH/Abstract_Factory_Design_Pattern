package ingredientFactory;

import ingredientsInterface.Cheese;
import ingredientsInterface.Clams;
import ingredientsInterface.Dough;
import ingredientsInterface.Pepperoni;
import ingredientsInterface.Sauce;
import ingredientsInterface.Veggies;

public interface PizzaIngredientFactory {
	public Dough createDough();

	public Sauce createSauce();

	public Cheese createCheese();

	public Veggies[] createVeggies();

	public Pepperoni createPepperoni();

	public Clams createClams();
}
