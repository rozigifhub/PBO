package Percobaan;
public class Karyawan {
    public int id;
    public String nama;
    public String jenisKelamin;
    public String jabatan;
    public double gaji;

    public void tampilDataPribadi() {
        System.out.println("ID            : " + id);
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("Jabatan       : " + jabatan);
    }

    public double lihatGaji() {
        return gaji;
    }
    
    public void setGaji(double gaji) throws Exception{
        if (gaji < 0) {
            throw new Exception("Gaji tidak boleh negatif");
        }
    }
}