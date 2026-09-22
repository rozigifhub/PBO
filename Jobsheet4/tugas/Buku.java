package Jobsheet4.tugas;

public class Buku {
    private String judul;
    private int harga;

    public Buku(String judul, int harga) {
        this.judul = judul;
        this.harga = harga;
    }

    public String getJudul() {
        return judul;
    }

    public int getHarga() {
        return harga;
    }

    public String info() {
        return judul + " - Rp" + harga;
    }
}