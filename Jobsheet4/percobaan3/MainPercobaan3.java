package Jobsheet4.percobaan3;

public class MainPercobaan3 {
    public static void main(String[] args) {
        Pegawai masinis = new Pegawai("101", "spongebob");
        Pegawai asisten = new Pegawai("102", "patrick");
        KeretaApi keretaApi = new KeretaApi("Kereta Api Cepat", "Eksekutif", masinis, asisten);
        System.out.println(keretaApi.info());

        System.out.println("==================================================");
        Pegawai masinis2 = new Pegawai("201", "sandy");
        KeretaApi keretaApi2 = new KeretaApi("Kereta Api Lambat", "Bisnis", masinis2);
        System.out.println(keretaApi2.info());
    }
}
