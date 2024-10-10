package ingredientFactory;

import ingredientsConcrete.BlackOlives;
import ingredientsConcrete.EggPlant;
import ingredientsConcrete.FrozenClams;
import ingredientsConcrete.MozzarellaCheese;
import ingredientsConcrete.PlumTomatoSauce;
import ingredientsConcrete.SlicedPepperoni;
import ingredientsConcrete.ThickCrustDough;
import ingredientsInterface.Cheese;
import ingredientsInterface.Clams;
import ingredientsInterface.Dough;
import ingredientsInterface.Pepperoni;
import ingredientsInterface.Sauce;
import ingredientsInterface.Spinach;
import ingredientsInterface.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies[] veggies = { new BlackOlives(), new Spinach(), new EggPlant() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClams() {
		return new FrozenClams();
	}

}
