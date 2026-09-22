package Jobsheet4.tugas;

public class MainTugas {
    public static void main(String[] args) {

        // Buku dibuat di luar Toko
        Buku buku1 = new Buku("Pemrograman Java", 75000);
        Buku buku2 = new Buku("Algoritma Dasar", 60000);

        Buku[] daftarBuku = {buku1, buku2};

        // Aggregation
        Toko toko = new Toko("Toko Buku Java", daftarBuku);

        toko.tampilkanBuku();

        System.out.println();

        // Composition
        Pesanan pesanan = new Pesanan(
            "ORD001",
            buku1,
            2
        );

        pesanan.tampilkanPesanan();

        System.out.println();

        // Dependency
        Printer printer = new Printer("Epson L3110");

        pesanan.cetakNota(printer);
    }
}