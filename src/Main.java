import abstractFactroryClasses.NYPizzaStore;
import abstractFactroryClasses.PizzaStore;
import pizzas.Pizza;

public class Main {
	public static void main(String[] args) {
		PizzaStore pizzaStore = new NYPizzaStore();
		Pizza pizza = pizzaStore.orderPizza("veggie");
		pizza.getDough().display();
	}
}
