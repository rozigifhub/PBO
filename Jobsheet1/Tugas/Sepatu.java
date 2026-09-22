package Tugas;

public class Sepatu{
    public static void main(String[] args) {
        Barang sepatu1 = new Barang("Nike", "Hitam", "42", 800000);

        sepatu1.tampilkanInfo();
        System.out.println();

        System.out.println("Jumlah: " + sepatu1.getJumlah());
        System.out.println("Merk: " + sepatu1.getMerk());
        System.out.println("Warna: " + sepatu1.getWarna());
        System.out.println("Ukuran: " + sepatu1.getUkuranSepatu());

        System.out.println(sepatu1.ubahWarna("Putih"));
        System.out.println(sepatu1.ubahUkuran("43"));

    }
}

class Barang{
    private String merk;
    private String warna;
    private String ukuran;
    private int harga;
    public int jumlah;

    public Barang(String merk, String warna, String ukuran, int harga) {
        this.merk = merk;
        this.warna = warna;
        this.ukuran = ukuran;
        this.harga = harga;
        jumlah++;
    }

    public void tampilkanInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Harga: Rp" + harga);
    }

    public String getUkuranSepatu(){
        return ukuran;
    }

    public int getHargaSepatu(){
        return harga;
    }

    public String getMerk() {
        return merk;
    }

    public String getWarna() {
        return warna;
    }

    public int getJumlah() {
        return jumlah;
    }

    public String ubahWarna(String warnaBaru) {
        this.warna = warnaBaru;
        return warna;
    }

    public String ubahUkuran(String ukuranBaru) {
        this.ukuran = ukuranBaru;
        return ukuran;
    }


}
