package Tugas;



public class Michiko extends Character {
    private String hobi;
    private String ras;
    private String status;
    private String agama;

    public Michiko(String nama, int umur, String jenisKelamin, String pekerjaan, String hobi, String ras, String status, String agama) {
        super(nama, umur, jenisKelamin, pekerjaan);
        this.hobi = hobi;
        this.ras = ras;
        this.status = status;
        this.agama = agama;
    }   

    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Hobi: " + hobi);
        System.out.println("Ras: " + ras);
        System.out.println("Status: " + status);
        System.out.println("Agama: " + agama);
    }

    public String gantiHobi(String hobiBaru) {
        this.hobi = hobiBaru;
        return "Hobi baru: " + hobi;
    }

    public String gantiRas(String rasBaru) {
        this.ras = rasBaru;
        return "Ras baru: " + ras;
    }

    public String gantiStatus(String statusBaru) {
        this.status = statusBaru;
        return "Status baru: " + status;
    }
    
}
