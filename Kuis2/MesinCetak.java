// DEPENDENSI (uses-a): Tiket cuma jadi PARAMETER method, tidak disimpan jadi atribut
public class MesinCetak {
    private String kodeMesin;

    public MesinCetak(String kodeMesin) {
        this.kodeMesin = kodeMesin;
    }

    public void cetak(Tiket tiket) {
        System.out.println("[" + kodeMesin + "] Mencetak tiket...");
        System.out.println("  Kode      : " + tiket.getKode());
        System.out.println("  Film      : " + tiket.getJudulFilm());
        System.out.println("  Jenis     : " + tiket.getJenis());
        System.out.println("  Harga     : " + tiket.hitungHarga());
        Penonton p = tiket.getPemilik();
        if (p != null) {
            System.out.println("  Atas nama : " + p.getNama() + " (" + p.getNoHp() + ")");
        }
        System.out.println();
    }
}
