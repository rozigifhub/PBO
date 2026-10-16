// SUPERCLASS. Relasi: Tiket o-- Penonton (agregasi, atribut pemilik + setPemilik)
public class Tiket {
    protected String kode;        // protected = bisa diakses subclass
    protected String judulFilm;
    protected int hargaDasar;
    private Penonton pemilik;     // agregasi

    public Tiket(String kode, String judulFilm, int hargaDasar) {
        this.kode = kode;
        this.judulFilm = judulFilm;
        this.hargaDasar = hargaDasar;
    }

    public void setPemilik(Penonton pemilik) {
        this.pemilik = pemilik;
    }

    public Penonton getPemilik() {
        return pemilik;
    }

    public String getKode() {
        return kode;
    }

    public String getJudulFilm() {
        return judulFilm;
    }

    // method yang akan di-OVERRIDE subclass
    public int hitungHarga() {
        return hargaDasar;
    }

    public String getJenis() {
        return "Biasa";
    }
}
