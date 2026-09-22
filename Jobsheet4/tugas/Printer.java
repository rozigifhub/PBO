package Jobsheet4.tugas;

public class Printer {
    private String merk;

    public Printer(String merk) {
        this.merk = merk;
    }

    public void cetak(String teks) {
        System.out.println("[" + merk + "] " + teks);
    }
}