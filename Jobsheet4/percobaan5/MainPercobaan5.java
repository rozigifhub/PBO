package Jobsheet4.percobaan5;

public class MainPercobaan5 {
    public static void main(String[] args) {
        Mesin mesin = new Mesin();

        Mobil mobil = new Mobil("Avanza", mesin);

        mobil.tampilkanInfo();
    }
}