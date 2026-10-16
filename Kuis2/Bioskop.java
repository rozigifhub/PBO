// COMPOSISI: daftarStudio dibuat DI DALAM constructor (tanpa setter)
// AGREGASI : manajer dibuat di luar, masuk lewat setManajer()
public class Bioskop {
    private String nama;
    private Studio[] daftarStudio;
    private Manajer manajer;

    public Bioskop(String nama, int jumlahStudio, int kapasitasStudio) {
        this.nama = nama;
        this.daftarStudio = new Studio[jumlahStudio];       // lahir bareng Bioskop
        for (int i = 0; i < jumlahStudio; i++) {
            daftarStudio[i] = new Studio(i + 1, kapasitasStudio);
        }
    }

    public void setManajer(Manajer manajer) {   // return void, BUKAN Manajer
        this.manajer = manajer;
    }

    public Studio getStudio(int nomor) {        // balikin Studio, BUKAN int
        if (nomor >= 1 && nomor <= daftarStudio.length) {
            return daftarStudio[nomor - 1];
        }
        return null;
    }

    // delegasi: cari studio yang masih kosong
    public void jualTiket(Tiket tiket) {
        for (Studio s : daftarStudio) {
            if (s.jual(tiket)) {
                System.out.println(">> Tiket " + tiket.getKode() + " terjual di Studio " + s.getNomor());
                return;
            }
        }
        System.out.println(">> Maaf, semua studio penuh!");
    }

    public void jualTiket(Tiket tiket, int nomorStudio) {
        Studio s = getStudio(nomorStudio);
        if (s != null && s.jual(tiket)) {
            System.out.println(">> Tiket " + tiket.getKode() + " terjual di Studio " + s.getNomor());
        } else {
            System.out.println(">> Maaf, studio " + nomorStudio + " penuh atau tidak ada!");
        }
    }

    public void tampilkanInfo() {
        System.out.println("===== " + nama + " =====");
        System.out.println("Manajer: " + (manajer != null ? manajer.getNama() : "-"));
        int total = 0;
        for (Studio s : daftarStudio) {
            int pendapatan = s.hitungPendapatan();
            total += pendapatan;
            System.out.println("Studio " + s.getNomor()
                    + " | kapasitas " + s.getKapasitas()
                    + " | terjual " + s.getJumlahTerjual()
                    + " | pendapatan " + pendapatan);
        }
        System.out.println("TOTAL PENDAPATAN: " + total);
    }
}
