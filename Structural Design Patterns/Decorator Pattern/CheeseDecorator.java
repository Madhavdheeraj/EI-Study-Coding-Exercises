// CheeseDecorator.java (Concrete Decorator)
public class CheeseDecorator extends FoodDecorator {
    public CheeseDecorator(Food newFood) {
        super(newFood);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood() + " + Extra Cheese";
    }

    @Override
    public double foodPrice() {
        return super.foodPrice() + 20.0;
    }
}