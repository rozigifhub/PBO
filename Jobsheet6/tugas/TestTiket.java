package Jobsheet6.tugas;

public class TestTiket {
    public static void main(String[] args) {
        // Objek dibuat dengan konstruktor tanpa parameter,
        // lalu atributnya diisi satu per satu (sesuai ketentuan tugas)
        TiketKereta kereta = new TiketKereta();
        kereta.kodeTiket = "KA-001";
        kereta.namaPenumpang = "Andi";
        kereta.asal = "Malang";
        kereta.tujuan = "Jakarta";
        kereta.hargaDasar = 3500000;
        kereta.nomorGerbong = 3;
        kereta.nomorKursi = "12A";

        TiketDomestik domestik = new TiketDomestik("GA-102", "Sinta", "Surabaya", "Denpasar", 900000, "Garuda Indonesia", 25, 75000);
        TiketInternasional internasional = new TiketInternasional("SQ-205", "Budi", "Jakarta", "Singapura", 2500000, "Singapore Airlines", 20, "C1234567", 150000);

        System.out.println("========== Tiket Kereta ==========");
        kereta.tampilKereta();

        System.out.println("\n========= Tiket Pesawat Domestik =========");
        domestik.tampilDomestik();

        System.out.println("\n====== Tiket Pesawat Internasional ======");
        internasional.tampilInternasional();
    }
}
