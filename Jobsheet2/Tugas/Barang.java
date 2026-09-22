package Tugas;

public class Barang {
    private String namaBarang;
    private int hargaDasar;
    private String kode;
    private float diskon;

    protected Barang(String namaBarang, int hargaDasar, String kode, float diskon) {
        this.namaBarang = namaBarang;
        this.hargaDasar = hargaDasar;
        this.kode = kode;
        this.diskon = diskon;
    }

    public int hargaJual(){
        return (int) (hargaDasar - (hargaDasar * diskon));
    }

    public void tampilBarang() {
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Dasar: " + hargaDasar);
        System.out.println("Kode Barang: " + kode);
        System.out.println("Diskon: " + (diskon * 100) + "%");
        System.out.println("Harga Jual: " + hargaJual());
    }
}
