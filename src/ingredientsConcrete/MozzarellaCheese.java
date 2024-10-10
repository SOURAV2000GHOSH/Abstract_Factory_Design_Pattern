package ingredientsConcrete;

import ingredientsInterface.Cheese;

public class MozzarellaCheese implements Cheese{
	@Override
	public void display() {
		System.out.println("Use Mozzarella Cheese !!");	
	}
}
