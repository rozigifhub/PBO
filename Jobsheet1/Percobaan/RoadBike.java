package Percobaan;

public class RoadBike extends Bike {
    private String tireWidth;

    public void setTireWidth(String width) {
        tireWidth = width;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Tire Width: " + tireWidth + " mm");
        System.out.println("Bike Type: Road Bike");
    }
}
