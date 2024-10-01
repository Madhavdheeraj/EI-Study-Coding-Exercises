public class Main {
    public static void main(String[] args) {
        VehicleFactory factory = new ConcreteVehicleFactory();

        Vehicle car = factory.createVehicle("car");
        car.startEngine(); // Output: Car engine started.

        Vehicle bike = factory.createVehicle("bike");
        bike.startEngine(); // Output: Bike engine started.

        Vehicle truck = factory.createVehicle("truck");
        truck.startEngine(); // Output: Truck engine started.
    }
}
