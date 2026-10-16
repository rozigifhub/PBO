// OVERRIDING: hitungHarga() dan getJenis() dimodifikasi versi anak
public class TiketReguler extends Tiket {
    private boolean weekend;

    public TiketReguler(String kode, String judulFilm, int hargaDasar, boolean weekend) {
        super(kode, judulFilm, hargaDasar);   // panggil konstruktor induk
        this.weekend = weekend;
    }

    @Override
    public int hitungHarga() {
        if (weekend) {
            return (int) (hargaDasar + 10000);  // weekend, tambah 10 ribu
        }
        return hargaDasar;
    }

    @Override
    public String getJenis() {
        return weekend ? "Reguler (Weekend)" : "Reguler";
    }
}
