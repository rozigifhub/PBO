package Kuis;

public class MainSoalA5 {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("Pixel 8", 4500);

        int persenBaterai = smartphone.isiDaya(new Charger(20), 0);
        smartphone.tampilkanInfo();

        System.out.println();

        int persenBaterai2 = smartphone.isiDaya(new Charger(25), 30);
        smartphone.tampilkanInfo();

        System.out.println();

        int persenBaterai3 = smartphone.isiDaya(new Charger(25), 40);
        smartphone.tampilkanInfo();

        System.out.println();
        int persenBaterai4 = smartphone.pakai(60);
        smartphone.tampilkanInfo();

        System.out.println();
        int persenBaterai5 = smartphone.pakai(50);
        smartphone.tampilkanInfo();

        System.out.println();
        int persenBaterai6 = smartphone.isiDaya(null, 30);
        smartphone.tampilkanInfo();
        

    }
}
