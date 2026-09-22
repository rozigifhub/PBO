package Jobsheet4.tugas;

public class Pesanan {
    private String nomor;
    private DetailPesanan[] detailPesanan;

    public Pesanan(String nomor, Buku buku, int jumlah) {
        this.nomor = nomor;

        this.detailPesanan = new DetailPesanan[1];

        this.detailPesanan[0] = new DetailPesanan(buku, jumlah);
    }

    public int hitungTotal() {
        int total = 0;

        for (DetailPesanan detail : detailPesanan) {
            total += detail.hitungSubtotal();
        }

        return total;
    }

    public void cetakNota(Printer printer) {
        printer.cetak(
            "Pesanan " + nomor + " - Total Rp" + hitungTotal()
        );
    }

    public void tampilkanPesanan() {
        System.out.println("Pesanan: " + nomor);

        for (DetailPesanan detail : detailPesanan) {
            System.out.println(detail.info());
        }

        System.out.println("Total: Rp" + hitungTotal());
    }
}