package ingredientFactory;

import ingredientsConcrete.FreshClam;
import ingredientsConcrete.Garlic;
import ingredientsConcrete.MarinaraSauce;
import ingredientsConcrete.Mushroom;
import ingredientsConcrete.Onion;
import ingredientsConcrete.RedPapper;
import ingredientsConcrete.ReggianoCheese;
import ingredientsConcrete.SlicedPepperoni;
import ingredientsConcrete.ThinCrustDough;
import ingredientsInterface.Cheese;
import ingredientsInterface.Clams;
import ingredientsInterface.Dough;
import ingredientsInterface.Pepperoni;
import ingredientsInterface.Sauce;
import ingredientsInterface.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		System.out.println("Use A Thin Crust Dough !!");
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		System.out.println("Use Marinara Sauce !!");
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		System.out.println("Use Reggiano Cheese !!");
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Mushroom(), new Onion(), new RedPapper() };
		for (Veggies veggie : veggies) {
			veggie.display();
		}
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		System.out.println("Use Sliced Pepperoni !!");
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClams() {
		System.out.println("Use Fresh Clams !!");
		return new FreshClam();
	}

}
