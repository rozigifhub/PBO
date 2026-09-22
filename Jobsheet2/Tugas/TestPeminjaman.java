package Tugas;

public class TestPeminjaman {
    public static void main(String[] args) {
        peminjaman p1 = new peminjaman("P001", "John Doe", true, "Game A", 5000, 3);
        peminjaman p2 = new peminjaman("P002", "Jane Smith", false, "Game B", 7000, 2);

        System.out.println("Data Peminjaman 1:");
        p1.tampilDataPeminjaman();

        System.out.println("\nData Peminjaman 2:");
        p2.tampilDataPeminjaman();
    }
}