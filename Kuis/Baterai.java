package Kuis;

public class Baterai {
    private int kapasitas;
    private int persen;

    public Baterai(int kapasitas) {
        this.kapasitas = kapasitas;
        this.persen = 20; // Baterai awalnya penuh
    }

    public int getPersen() {
        return persen;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void tambah(int persen) {
        this.persen += persen;
        if (this.persen > 100) {
            this.persen = 100; // Baterai tidak boleh melebihi 100%
        } else if (this.persen < 0) {
            this.persen = 0; // Baterai tidak boleh kurang dari 0%
        }
    }

}
