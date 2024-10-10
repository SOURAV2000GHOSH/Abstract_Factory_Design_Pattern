import pizzastore.NYPizzaStore;
import pizzastore.PizzaStore;

public class Main {
	public static void main(String[] args) {
		PizzaStore pizzaStore = new NYPizzaStore();
		pizzaStore.orderPizza("veggie");
	}
}
