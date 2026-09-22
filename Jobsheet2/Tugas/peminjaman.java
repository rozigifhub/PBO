package Tugas;

public class peminjaman {
    private String id;
    private String nama;
    private boolean isMember;
    private String namaGame;
    private int harga;
    private int lamaPinjam;

    public peminjaman(String id, String nama, boolean isMember, String namaGame, int harga, int lamaPinjam) {
        this.id = id;
        this.nama = nama;
        this.isMember = isMember;
        this.namaGame = namaGame;
        this.harga = harga;
        this.lamaPinjam = lamaPinjam;


    }

    public int hitungTotalHarga() {
        int totalHarga = harga * lamaPinjam;
        if (isMember) {
            totalHarga -= totalHarga * 0.1; // diskon 10% untuk member
        }
        return totalHarga;
    }
    public void tampilDataPeminjaman() {
        System.out.println("ID Peminjaman  : " + id);
        System.out.println("Nama Peminjam   : " + nama);
        System.out.println("Member          : " + (isMember ? "Ya" : "Tidak"));
        System.out.println("Nama Game       : " + namaGame);
        System.out.println("Harga Sewa      : " + harga);
        System.out.println("Lama Pinjam     : " + lamaPinjam + " hari");
        System.out.println("Total Harga     : " + hitungTotalHarga());
    }
}
