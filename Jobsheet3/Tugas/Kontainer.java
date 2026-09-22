package Tugas;

public class Kontainer {
    private String nomorResi;
    private String namaPemilik;
    private float kapasitasMaksimal;
    private float beratMuatanSaatIni;

    public Kontainer(
            String nomorResi,
            String namaPemilik,
            float kapasitasMaksimal) {

        this.nomorResi = nomorResi;
        this.namaPemilik = namaPemilik;
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.beratMuatanSaatIni = 0;
    }

    public String getNomorResi() {
        return nomorResi;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public float getKapasitasMaksimal() {
        return kapasitasMaksimal;
    }

    public float getBeratMuatanSaatIni() {
        return beratMuatanSaatIni;
    }

    public void tambahMuatan(float berat) {
        if (beratMuatanSaatIni + berat <= kapasitasMaksimal) {
            beratMuatanSaatIni += berat;
        } else {
            System.out.println(
                "Maaf, berat muatan melebihi kapasitas maksimal kontainer."
            );
        }
    }

    public void turunkanMuatan(float berat) {
        float batasMaksimal = beratMuatanSaatIni * 0.5f;

        if (berat > batasMaksimal) {
            System.out.println(
                "Maaf, demi keselamatan, pembongkaran muatan satu kali jalan "
                + "tidak boleh melebihi 50% dari muatan saat ini!"
            );
        } else {
            beratMuatanSaatIni -= berat;
        }
    }
}