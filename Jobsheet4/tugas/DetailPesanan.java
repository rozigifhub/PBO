package Jobsheet4.tugas;

public class DetailPesanan {
    private Buku buku;
    private int jumlah;

    public DetailPesanan(Buku buku, int jumlah) {
        this.buku = buku;
        this.jumlah = jumlah;
    }

    public int hitungSubtotal() {
        return buku.getHarga() * jumlah;
    }

    public String info() {
        return buku.getJudul() + " x " + jumlah
                + " = Rp" + hitungSubtotal();
    }
}