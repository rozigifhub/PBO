package Jobsheet4.percobaan1;

public class MainPercobaan1 {
    public static void main(String[] args) {
        Processor p = new Processor("Intel i5", 3);
        Laptop lpt = new Laptop("Thinkpad", p);
        lpt.info();

        System.out.println();

        Processor p1 = new Processor("AMD Ryzen 3", 4);
        Laptop lpt1 = new Laptop();
        lpt1.setMerk("Asus");
        lpt1.setProc(p1);
        lpt1.info();

        System.out.println();

        Processor p2 = new Processor();
        p2.setMerk("Intel i3");
        p2.setCache(2);
        Laptop lpt2 = new Laptop();
        lpt2.setMerk("Acer");
        lpt2.setProc(p2);
        lpt2.info();

        System.out.println();

        Laptop lpt3 = new Laptop("Macbook", new Processor("M1", 8));
        lpt3.info();

        System.out.println();
        
    }
}
