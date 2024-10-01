// ToppingsDecorator.java (Concrete Decorator)
public class ToppingsDecorator extends FoodDecorator {
    public ToppingsDecorator(Food newFood) {
        super(newFood);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood() + " + Extra Toppings";
    }

    @Override
    public double foodPrice() {
        return super.foodPrice() + 30.0;
    }
}