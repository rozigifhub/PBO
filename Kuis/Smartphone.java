package Kuis;

public class Smartphone {
    private String merk;
    private Baterai baterai;

    public Smartphone(String merk, int kapasitasBaterai) {
        this.merk = merk;
        this.baterai = new Baterai(kapasitasBaterai);
    }

    public int isiDaya(Charger c, int menit) {
        
        if (c == null) {
            System.out.println("Charger tidak tidak terdeteksi.");
            return baterai.getPersen();
        }
        int dayaCharger = c.getDaya();
        int totalIsi = (dayaCharger * menit)/10; // Menghitung total isi daya berdasarkan daya charger dan waktu pengisian
        baterai.tambah(totalIsi);
        return baterai.getPersen();
    }
    public int pakai(int persen) {
        baterai.tambah(-persen);
        return baterai.getPersen();
    }


    public void tampilkanInfo() {
        System.out.println(merk + " | " + "Baterai " + baterai.getKapasitas() + " mAh" + " | " + baterai.getPersen() + "%");
    }


}
