package Jobsheet4.Percobaan2;

public class Pelanggan {
    private String nama;
    private Sopir sopir;
    private Mobil mobil;
    private int hari;

    public Pelanggan() {
        
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }

    public void setSopir(Sopir sopir) {
        this.sopir = sopir;
    }
    public Sopir getSopir() {
        return sopir;
    }

    public void setMobil(Mobil mobil) {
        this.mobil = mobil;
    }
    public Mobil getMobil() {
        return mobil;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }
    public int getHari() {
        return hari;
    }

    public int hitungTotalBiaya() {
        int totalBiayaMobil = mobil.hitungBiayaMobil(hari);
        int totalBiayaSopir = sopir.hitungBiayaSopir(hari);
        return totalBiayaMobil + totalBiayaSopir;
    }

    public void info() {
        System.out.println("Nama Pelanggan: " + nama);
        System.out.println("Merk Mobil: " + mobil.getMerk());
        System.out.println("Biaya Sewa Mobil: " + mobil.hitungBiayaMobil(hari));
        System.out.println("Nama Sopir: " + sopir.getNama());
        System.out.println("Biaya Sewa Sopir: " + sopir.hitungBiayaSopir(hari));
        System.out.println("Lama Sewa: " + hari + " hari");
        System.out.println("Total Biaya: " + hitungTotalBiaya());
    }
}
