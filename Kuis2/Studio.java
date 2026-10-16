public class Studio {
    private int nomor;
    private int kapasitas;
    private Tiket[] tiketTerjual;   // relasi 1-ke-banyak -> array of object
    private int jumlahTerjual;

    public Studio(int nomor, int kapasitas) {
        this.nomor = nomor;
        this.kapasitas = kapasitas;
        this.tiketTerjual = new Tiket[kapasitas];
        this.jumlahTerjual = 0;
    }

    // guard clause: tolak kalau penuh (kayak percobaan Gerbong-Kursi)
    public boolean jual(Tiket tiket) {
        if (jumlahTerjual >= kapasitas) {
            return false;
        }
        tiketTerjual[jumlahTerjual] = tiket;
        jumlahTerjual++;
        return true;
    }

    public int hitungPendapatan() {
        int total = 0;
        for (int i = 0; i < jumlahTerjual; i++) {
            total += tiketTerjual[i].hitungHarga();   // polymorphism!
        }
        return total;
    }

    public int getNomor() {
        return nomor;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public int getJumlahTerjual() {
        return jumlahTerjual;
    }
}
