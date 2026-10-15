package Jobsheet6.tugas;

public class Tiket {
    protected String kodeTiket;
    protected String namaPenumpang;
    protected String asal;
    protected String tujuan;
    protected int hargaDasar;

    public Tiket() {
    }

    public Tiket(String kodeTiket, String namaPenumpang, String asal, String tujuan, int hargaDasar) {
        this.kodeTiket = kodeTiket;
        this.namaPenumpang = namaPenumpang;
        this.asal = asal;
        this.tujuan = tujuan;
        this.hargaDasar = hargaDasar;
    }

    public void tampilTiket() {
        System.out.printf("%-14s = %s%n", "Kode Tiket", kodeTiket);
        System.out.printf("%-14s = %s%n", "Nama Penumpang", namaPenumpang);
        System.out.printf("%-14s = %s - %s%n", "Rute", asal, tujuan);
        System.out.printf("%-14s = %d%n", "Harga Dasar", hargaDasar);
    }
}
