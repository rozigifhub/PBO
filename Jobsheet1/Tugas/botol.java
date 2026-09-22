package Tugas;

public class botol {
    public static void main(String[] args) {
        Botol botol1 = new Botol(10, 600, 5000, "diminum");
        botol1.tampilkanInfo();

        System.out.println();
        botol1.setWidth(12);
        botol1.setKapasitas(750);
        botol1.setHarga(6000);
        botol1.setKegunaan("minum");
        botol1.tampilkanInfo();

        System.out.println();
        aqua aqua1 = new aqua("Biru", "Aqua", 20, "diminum", 10, 600, 5000, "Original");
        aqua1.tampilkanInfo();

        System.out.println();
        aqua1.gantiRasa("Jeruk");
        aqua1.gantiWarna("Hijau");
        System.out.println("Setelah mengganti rasa dan warna:");
        aqua1.tampilkanInfo();

        
    }
}

class Botol {
    private int width;
    private int kapasitas;
    private int harga;
    private String kegunaan;

    public Botol(int width, int kapasitas, int harga, String kegunaan) {
        this.width = width;
        this.kapasitas = kapasitas;
        this.harga = harga;
        this.kegunaan = kegunaan;
    }

    public void tampilkanInfo() {
        System.out.println("Width: " + width);
        System.out.println("Kapasitas: " + kapasitas + " ml");
        System.out.println("Harga: Rp" + harga);
        System.out.println("Kegunaan: " + kegunaan);
    }

    public int getWidth() {
        return width;
    }
    public int getKapasitas() {
        return kapasitas;
    }
    public int getHarga() {
        return harga;
    }
    public String getKegunaan() {
        return kegunaan;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public void setKegunaan(String kegunaan) {
        this.kegunaan = kegunaan;
    }
}
