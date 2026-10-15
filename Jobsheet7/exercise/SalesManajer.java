package Jobsheet7.exercise;

public class SalesManajer extends Manajer {
    private String departemen;

    public SalesManajer(String nama, String departemen, int gaji) {
        super(nama, gaji);
        this.departemen = departemen;
    }

    // Overriding: menampilkan departemen dari SalesManajer
    public void cetakStatus() {
        System.out.println("Nama: " + nama);
        System.out.println("Departemen: " + departemen);
        System.out.println("Gaji: " + gaji);
    }
}
