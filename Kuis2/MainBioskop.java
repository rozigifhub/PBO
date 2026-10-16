public class MainBioskop {
    public static void main(String[] args) {
     
        Bioskop bioskop = new Bioskop("Sinema Malang", 3, 50);

        bioskop.setManajer(new Manajer("Pak Hadi"));

        Penonton budi = new Penonton("Andi", "0812-3456-7890");
        Penonton sari = new Penonton("Sinta", "0813-9876-5432");

     
        Tiket reguler = new TiketReguler("T-001", "Laskar Pelangi", 40000, true);  // weekend
        Tiket vip = new TiketVIP("T-002", "Laskar Pelangi", 40000, true);  // paket snack
        reguler.setPemilik(budi);
        vip.setPemilik(sari);


        MesinCetak mesin = new MesinCetak("M-01");
        mesin.cetak(reguler);
        mesin.cetak(vip);


        bioskop.jualTiket(reguler);
        bioskop.jualTiket(vip, 1);
        bioskop.jualTiket(vip, 4);  // jual tiket reguler di studio 1

        bioskop.tampilkanInfo();
    }
}
