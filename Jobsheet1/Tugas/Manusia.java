package Tugas;

public class Manusia {
    
    public static void main(String[] args) {
        Character character1 = new Character("John", 25, "Laki-laki", "Programmer");
        character1.tampilkanInfo();

        System.out.println();
        character1.gantiPekerjaan("Designer");
        character1.tambahUmur(1);
        character1.tampilkanInfo();

        System.out.println();
        Michiko michiko = new Michiko("Michiko", 20, "Perempuan", "Student", "Reading", "Japanese", "Single", "Buddha");
        michiko.tampilkanInfo();

        System.out.println();
        michiko.gantiHobi("Traveling");
        michiko.gantiRas("Korean");
        michiko.gantiStatus("Married");
        michiko.tampilkanInfo();
    }
}

class Character {
    private String nama;
    private int umur;
    private String jenisKelamin;
    private String pekerjaan;

    public Character(String nama, int umur, String jenisKelamin, String pekerjaan) {
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
        this.pekerjaan = pekerjaan;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Pekerjaan: " + pekerjaan);
    }

    public String gantiPekerjaan(String pekerjaanBaru) {
        this.pekerjaan = pekerjaanBaru;
        return "Pekerjaan baru: " + pekerjaan;
    }

    public int tambahUmur(int tambahan) {
        this.umur += tambahan;
        return umur;
    }
}
