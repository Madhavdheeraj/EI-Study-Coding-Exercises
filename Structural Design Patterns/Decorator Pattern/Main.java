
public class Main {
    public static void main(String[] args) {
        Food pizza = new Pizza();
        System.out.println(pizza.prepareFood() + " -> Cost: $" + pizza.foodPrice());

        Food cheesePizza = new CheeseDecorator(pizza);
        System.out.println(cheesePizza.prepareFood() + " -> Cost: $" + cheesePizza.foodPrice());

        Food fullyLoadedPizza = new ToppingsDecorator(cheesePizza);
        System.out.println(fullyLoadedPizza.prepareFood() + " -> Cost: $" + fullyLoadedPizza.foodPrice());
    }
}
