package Percobaan;

public class bikeDemo {
    public static void main(String[] args) {
        Bike bike1 = new Bike();
        bike1.setBrand("Polygon");
        bike1.gearChanges(2);
        bike1.speedAcceleration(8);
        bike1.speedDeceleration(3);
        bike1.jarak(2); // Calculate distance traveled in 2 hours
        bike1.printInfo();

        System.out.println();

        Bike bike2 = new Bike();
        bike2.setBrand("United");
        bike2.gearChanges(3);
        bike2.speedAcceleration(12);
        bike2.jarak(1); // Calculate distance traveled in 1 hour
        bike2.speedDeceleration(2);
        bike2.printInfo();

        System.out.println();

        RoadBike roadBike1 = new RoadBike();
        roadBike1.setBrand("Specialized");
        roadBike1.setTireWidth("25");
        roadBike1.gearChanges(4);
        roadBike1.speedDeceleration(5);
        roadBike1.speedAcceleration(20);
        roadBike1.jarak(3); // Calculate distance traveled in 1 hour
        roadBike1.printInfo();
    }
}
