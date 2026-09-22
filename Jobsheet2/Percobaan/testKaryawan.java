package Percobaan;
public class testKaryawan {
    public static void main(String[] args) {
        Karyawan kry1 = new Karyawan();

        kry1.id = 101;
        kry1.nama = "Rozi";
        kry1.jenisKelamin = "Laki-laki";
        kry1.jabatan = "Staff";
        kry1.gaji = 5000000;

        Karyawan kry2 = new Karyawan();
        kry2.id = 102;
        kry2.nama = "Rizki";
        kry2.jenisKelamin = "Laki-laki";
        kry2.jabatan = "Manager";
        kry2.gaji = 10000000;

        Karyawan kry3 = new Karyawan();
        kry3.id = 103;
        kry3.nama = "Rizal";
        kry3.jenisKelamin = "Laki-laki";
        kry3.jabatan = "Direktur";
        kry3.gaji = 15000000;

        kry1.tampilDataPribadi();
        System.out.println("Gaji          : " + kry1.lihatGaji());

        try {
            kry1.setGaji(-5000000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}