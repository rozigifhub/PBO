// OVERRIDING: harga VIP = harga dasar + jumlah paket snack x harga snack
public class TiketVIP extends Tiket {
    private boolean paketSnack;
    private static final int HARGA_SNACK = 20000;

    public TiketVIP(String kode, String judulFilm, int hargaDasar, boolean paketSnack) {
        super(kode, judulFilm, hargaDasar);
        this.paketSnack = paketSnack;
    }

    @Override
    public int hitungHarga() {
        return (int) (hargaDasar * 1.5) + (paketSnack ? HARGA_SNACK : 0);
    }

    @Override
    public String getJenis() {
        return "VIP";
    }
}
