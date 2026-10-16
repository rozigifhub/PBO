// Class sederhana (enkapsulasi: atribut private + getter)
public class Penonton {
    private String nama;
    private String noHp;

    public Penonton(String nama, String noHp) {
        this.nama = nama;
        this.noHp = noHp;
    }

    public String getNama() {
        return nama;
    }

    public String getNoHp() {
        return noHp;
    }
}
