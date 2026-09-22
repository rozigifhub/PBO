package Tugas;

public class aqua extends Botol {
    private String warna;
    private String merk;
    public int tinggiBotol;
    public String rasa;


    public aqua(String warna, String merk, int tinggiBotol, String kegunaan, int width, int kapasitas, int harga, String rasa) {
        super(width, kapasitas, harga, kegunaan);
        this.warna = warna;
        this.merk = merk;
        this.tinggiBotol = tinggiBotol;
        this.rasa = rasa;
    }

    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Warna: " + warna);
        System.out.println("Merk: " + merk);
        System.out.println("Tinggi Botol: " + tinggiBotol + " cm");
        System.out.println("Rasa: " + rasa);
        System.out.println("Botol Aqua ini memiliki warna " + warna + ", merk " + merk + ", tinggi botol " + tinggiBotol + " cm, dan rasa " + rasa + ".");
    }

    public String gantiRasa(String rasaBaru) {
        this.rasa = rasaBaru;
        return "Rasa baru: " + rasa;
    }
    public String gantiWarna(String warnaBaru) {
        this.warna = warnaBaru;
        return "Warna baru: " + warna;
    }
    
}
