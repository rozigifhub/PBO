package Jobsheet6.tugas;

public class TiketDomestik extends TiketPesawat {
    protected int pajakBandara;

    public TiketDomestik() {
    }

    public TiketDomestik(String kodeTiket, String namaPenumpang, String asal, String tujuan, int hargaDasar, String maskapai, int beratBagasi, int pajakBandara) {
        super(kodeTiket, namaPenumpang, asal, tujuan, hargaDasar, maskapai, beratBagasi);
        this.pajakBandara = pajakBandara;
    }

    public void tampilDomestik() {
        super.tampilPesawat();
        System.out.printf("%-14s = %d%n", "Pajak Bandara", pajakBandara);
        System.out.printf("%-14s = %d%n", "Total Bayar", hargaDasar + hitungBiayaBagasi() + pajakBandara);
    }
}
