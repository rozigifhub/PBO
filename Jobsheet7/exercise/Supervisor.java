package Jobsheet7.exercise;

public class Supervisor extends Manajer {

    public Supervisor(String nama, int gaji) {
        super(nama, gaji);
    }

    // Overriding: naikkan gaji supervisor sebesar 1.500.000
    public void naikkanGaji() {
        gaji += 1500000;
    }
}
