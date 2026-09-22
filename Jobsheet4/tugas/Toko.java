package Jobsheet4.tugas;

public class Toko {
    private String nama;
    private Buku[] daftarBuku;

    public Toko(String nama, Buku[] daftarBuku) {
        this.nama = nama;
        this.daftarBuku = daftarBuku;
    }

    public void tampilkanBuku() {
        System.out.println("Toko: " + nama);

        for (Buku buku : daftarBuku) {
            System.out.println("- " + buku.info());
        }
    }
}