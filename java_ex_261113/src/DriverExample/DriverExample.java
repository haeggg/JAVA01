package DriverExample;
public class DriverExample {
    public static void main(String[] args) {
        
        Vehicle vehicle = new Vehicle();

        vehicle.run();

        System.out.println("==================");

        Driver driver = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.drive(bus);
        driver.drive(taxi);

    }
}
