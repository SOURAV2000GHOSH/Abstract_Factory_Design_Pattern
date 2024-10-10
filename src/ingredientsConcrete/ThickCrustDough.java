package ingredientsConcrete;

import ingredientsInterface.Dough;

public class ThickCrustDough implements Dough {
	@Override
	public void display() {
		System.out.println("Use Thick Crust Dough !!");
	}
}
