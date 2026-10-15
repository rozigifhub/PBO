package Jobsheet7.exercise;

public class GasStation {

    // Overloading: nama method sama, signature (parameter) berbeda
    public void isiBahanBakar(MobilKuno mobil) {
        System.out.println("Mobil kuno telah diisi dengan Pertalite!");
    }

    public void isiBahanBakar(MobilMewah mobil) {
        System.out.println("Mobil mewah telah diisi dengan Pertamax!");
    }

    // Overloading dengan parameter bayar:
    // pertalite Rp5.000/liter, pertamax Rp10.000/liter
    public void isiBahanBakar(MobilKuno mobil, int bayar) {
        int liter = bayar / 5000;
        System.out.println("Mobil kuno telah diisi dengan pertalite sebanyak " + liter + " liter");
    }

    public void isiBahanBakar(MobilMewah mobil, int bayar) {
        int liter = bayar / 10000;
        System.out.println("Mobil mewah telah diisi dengan pertamax sebanyak " + liter + " liter");
    }
}
