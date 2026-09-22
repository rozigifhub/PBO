package Jobsheet4.Percobaan2;

public class MainPercobaan2 {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        Sopir sopir = new Sopir();

        mobil.setMerk("Toyota Avanza");
        mobil.setBiaya(200000);

        sopir.setNama("Budi");
        sopir.setBiaya(100000);

        Pelanggan pelanggan = new Pelanggan();
        pelanggan.setNama("Andi");
        pelanggan.setMobil(mobil);
        pelanggan.setSopir(sopir);
        pelanggan.setHari(3);
        pelanggan.info();

        System.out.println();

        System.out.println(pelanggan.getMobil().getMerk());
    }
}
