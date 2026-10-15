package Jobsheet6.tugas;

public class TiketPesawat extends Tiket {
    protected String maskapai;
    protected int beratBagasi;

    public TiketPesawat() {
    }

    public TiketPesawat(String kodeTiket, String namaPenumpang, String asal, String tujuan, int hargaDasar, String maskapai, int beratBagasi) {
        super(kodeTiket, namaPenumpang, asal, tujuan, hargaDasar);
        this.maskapai = maskapai;
        this.beratBagasi = beratBagasi;
    }

    public int hitungBiayaBagasi() {
        if (beratBagasi > 20) {
            return (beratBagasi - 20) * 50000;
        } else {
            return 0;
        }
    }

    public void tampilPesawat() {
        super.tampilTiket();
        System.out.printf("%-14s = %s%n", "Maskapai", maskapai);
        System.out.printf("%-14s = %d kg%n", "Berat Bagasi", beratBagasi);
        System.out.printf("%-14s = %d%n", "Biaya Bagasi", hitungBiayaBagasi());
    }
}
