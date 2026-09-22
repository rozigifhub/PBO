package Percobaan;

public class Bike {
    private String brand;
    private int speed;
    private int gear=1;
    public int distance;
    //gear 1: max5km/h, gear 2: max10km/h, gear 3: max15km/h
    private final int[] gearSpeedLimits = {5, 10, 25, 30, 40, 60};

    public void setBrand(String brandName) {
        brand = brandName;
    }

    public void gearChanges(int gearValue) {
        if (gearValue >= 1 && gearValue <= 6) {
            gear = gearValue;
        } else {
            System.out.println("Invalid gear. Please select a gear between 1 and 6.");
        }
    }

    public int speedAcceleration(int increment) {
        speed += increment;
        if (speed > gearSpeedLimits[gear - 1]) {
            speed = gearSpeedLimits[gear - 1];
        }
        return speed;
    }

    public int speedDeceleration(int decrement) {
        speed -= decrement;
        if (speed < 0) {
            speed = 0;
        }
        return speed;
    }

    public int jarak(int time) {
        distance = speed * time;
        return distance;
    }

    public void printInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Current Speed: " + speed + " km/h");
        System.out.println("Current Gear: " + gear);
        System.out.println("Distance Traveled: " + distance + " km");
    }


}
