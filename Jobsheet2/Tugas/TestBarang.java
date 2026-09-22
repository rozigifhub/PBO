package Tugas;

public class TestBarang {
    public static void main(String[] args) {
        Barang barang1 = new Barang("Laptop", 10000000, "BRG001", 0.1f);
        barang1.tampilBarang();

        System.out.println();

        Barang barang2 = new Barang("Smartphone", 5000000, "BRG002", 0.05f);
        barang2.tampilBarang();
    }
}
