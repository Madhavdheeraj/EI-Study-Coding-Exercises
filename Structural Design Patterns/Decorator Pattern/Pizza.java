// Pizza.java (Concrete Component)
public class Pizza implements Food {
    @Override
    public String prepareFood() {
        return "Basic Pizza";
    }

    @Override
    public double foodPrice() {
        return 50.0;
    }
}