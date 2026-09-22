package Tugas;

public class Laptop {
    public static void main(String[] args) {
        Product laptop1 = new Product("Asus", "Intel Core i7", 16, 15000000, true, 8);
        Product laptop2 = new Product("Acer", "Intel Core i5", 8, 10000000, false, 4);

        laptop1.tampilkanInfo();
        System.out.println();
        
        laptop2.tampilkanInfo();
    }
}

class Product {
    private String merk;
    private String processor;
    private int ram;
    private int harga;
    private boolean isAvailable;
    private int tambahRam;

    public Product(String merk, String processor, int ram, int harga, boolean isAvailable, int tambahanRam) {
        this.merk = merk;
        this.processor = processor;
        this.ram = ram;
        this.harga = harga;
        this.isAvailable = isAvailable;
        this.tambahRam = tambahanRam;
    }

    public int tambahRam(int tambahan) {
        this.ram += tambahRam;
        return ram;
    }

    public void tampilkanInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Harga: Rp" + harga);
    }
    public boolean isAvailable() {
        return isAvailable;
    }


}