package Tugas;
public class Lingkaran {
    private double jariJari;
    private static final double PI = 3.14159;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungLuas() {
        return PI * jariJari * jariJari;
    }

    public double hitungKeliling() {
        return 2 * PI * jariJari;
    }

    public void tampilkanInfo() {
        System.out.println("Lingkaran dengan jari-jari: " + jariJari);
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }
}