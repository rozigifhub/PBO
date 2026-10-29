# Latihan Materi 9: Abstract Class dan Interface

## A. Soal dari Materi

1. Class yang tidak dapat diinstansiasi namun dapat di-extend disebut ….

   **Jawaban:** abstract class.

2. Method yang hanya dideklarasikan tanpa implementasi disebut ….

   **Jawaban:** abstract method.

3. Keyword untuk menggunakan interface pada sebuah class adalah ….

   **Jawaban:** `implements`.

4. Apa yang terjadi jika class turunan tidak meng-override semua abstract method induknya?

   **Jawaban:** Terjadi compile error (`... is not abstract and does not override abstract method ...`). Class turunan tersebut harus di-override semua method abstract-nya, atau dideklarasikan `abstract` juga.

5. Mengapa MP3Player lebih tepat meng-implements ChargeAble daripada meng-extends Phone?

   **Jawaban:** `MP3Player` bukan telepon (bukan relasi "adalah") dan tidak bisa `call()`/`endCall()`. Ia hanya punya kemampuan "bisa di-charge" (relasi "bisa"), sehingga cocok memakai interface `ChargeAble`.

6. Sebutkan 3 perbedaan abstract class dan interface!

   **Jawaban (contoh):**
   - Abstract class boleh punya method konkret, atribut biasa, dan constructor; interface hanya method abstract, konstanta, dan tanpa constructor.
   - Class hanya boleh `extends` 1 abstract class, tetapi boleh `implements` banyak interface.
   - Abstract class untuk relasi "adalah" (is-a); interface untuk relasi "bisa" (can-do).

## B. Latihan Tambahan

### Benar atau Salah
7. Abstract class boleh dibuat objeknya dengan `new`.
8. Interface boleh memiliki constructor.
9. Sebuah class boleh `extends` dua class sekaligus.
10. Method di interface otomatis bersifat `public abstract`.

### Analisis Kode
11. Kode berikut error. Sebutkan alasannya dan perbaikannya.
```java
public abstract class Bentuk {
    public abstract double luas() { return 0; }
}
```

12. Kode berikut error. Sebutkan alasannya dan perbaikannya.
```java
public interface Terbang { void terbang(); }

public class Burung implements Terbang {
    void terbang() { System.out.println("Burung terbang"); }
}
```

13. Apa output kode berikut?
```java
abstract class Hewan {
    protected String nama;
    Hewan(String nama) { this.nama = nama; }
    void tambahUmur() { System.out.println(nama + " bertambah umur"); }
    abstract void bergerak();
}
class Ikan extends Hewan {
    Ikan(String nama) { super(nama); }
    @Override
    void bergerak() { System.out.println(nama + " berenang"); }
}
public class Main {
    public static void main(String[] args) {
        Hewan h = new Ikan("Nemo");
        h.bergerak();
        h.tambahUmur();
    }
}
```

### Praktik Coding
14. Buat abstract class `Bentuk` dengan atribut `nama` (protected), constructor, method konkret `info()` yang mencetak nama, serta method abstract `hitungLuas()` bertipe `double`. Buat class turunan `Persegi` (sisi) dan `Lingkaran` (jari-jari), lalu di `Main` simpan keduanya dalam array `Bentuk[]` dan cetak luasnya dengan perulangan.

15. Buat interface `ChargeAble` (`doCharge()`) dan `ModAble` (`installMod(String modName)`). Buat class `Tablet` yang meng-implements keduanya, dan class `USBCharger` dengan method `charge(ChargeAble device)`. Panggil dari `Main`.

16. Buat class `SmartPhone` yang `extends Phone` sekaligus `implements ChargeAble, ModAble`. Tuliskan header class dan method yang wajib di-override.

### Notasi UML
17. Gambarkan class diagram (boleh teks/ASCII) untuk: abstract class `Bentuk`, turunan `Persegi` dan `Lingkaran`, serta interface `Printable` yang di-implements `Persegi`. Gunakan notasi garis penuh vs putus-putus dengan benar.

### Studi Kasus
18. Untuk tiap kebutuhan berikut, tentukan memakai abstract class atau interface, beserta alasannya:
    - a. `Mobil`, `Motor`, dan `Truk` yang berbagi atribut `platNomor` dan method `nyalakanMesin()`.
    - b. `Printer`, `Scanner`, dan `Kamera` yang sama-sama bisa `dikoneksikan` lewat WiFi.
    - c. `Dosen` dan `Mahasiswa` yang sama-sama `Pengguna`, serta `Dosen` yang juga bisa `Mengajar`.

---

## C. Kunci Jawaban Latihan Tambahan

7. **Salah.** Abstract class tidak bisa diinstansiasi.
8. **Salah.** Interface tidak punya constructor.
9. **Salah.** `extends` hanya boleh satu class (multiple inheritance class tidak didukung).
10. **Benar.**

11. Method abstract tidak boleh punya badan. Perbaikan: `public abstract double luas();`

12. Implementasi method interface harus `public` (error: attempting to assign weaker access privileges). Perbaikan: `@Override public void terbang() { ... }`

13. Output:
```
Nemo berenang
Nemo bertambah umur
```

14. Contoh jawaban:
```java
public abstract class Bentuk {
    protected String nama;
    public Bentuk(String nama) { this.nama = nama; }
    public void info() { System.out.println("Bentuk: " + nama); }
    public abstract double hitungLuas();
}

public class Persegi extends Bentuk {
    private double sisi;
    public Persegi(double sisi) { super("Persegi"); this.sisi = sisi; }
    @Override
    public double hitungLuas() { return sisi * sisi; }
}

public class Lingkaran extends Bentuk {
    private double r;
    public Lingkaran(double r) { super("Lingkaran"); this.r = r; }
    @Override
    public double hitungLuas() { return Math.PI * r * r; }
}

public class Main {
    public static void main(String[] args) {
        Bentuk[] daftar = { new Persegi(4), new Lingkaran(7) };
        for (Bentuk b : daftar) {
            b.info();
            System.out.println("Luas: " + b.hitungLuas());
        }
    }
}
```

15. Contoh jawaban:
```java
public interface ChargeAble { void doCharge(); }
public interface ModAble { void installMod(String modName); }

public class Tablet implements ChargeAble, ModAble {
    @Override
    public void doCharge() { System.out.println("Tablet sedang di-charge"); }
    @Override
    public void installMod(String modName) {
        System.out.println("Tablet memasang mod: " + modName);
    }
}

public class USBCharger {
    public void charge(ChargeAble device) {
        System.out.print("[USBCharger] ");
        device.doCharge();
    }
}

public class Main {
    public static void main(String[] args) {
        USBCharger charger = new USBCharger();
        Tablet t = new Tablet();
        charger.charge(t);
        t.installMod("Dark Mode");
    }
}
```

16. Header: `public class SmartPhone extends Phone implements ChargeAble, ModAble`.
    Wajib di-override: `call(String)`, `endCall()` (dari `Phone`), `doCharge()` (dari `ChargeAble`), `installMod(String)` (dari `ModAble`).

17. Contoh:
```
          Bentuk (abstract, miring)           «interface»
          # nama: String                       Printable
          + info(): void                       + cetak(): void
          + hitungLuas(): double  (miring)         ^
              ^             ^                      :  (garis putus-putus)
              |  (penuh)   |  (penuh)             :
          Persegi       Lingkaran                  :
          - sisi        - jariJari                 :
          + hitungLuas()  + hitungLuas()           :
          + cetak() ...............................:
```
    Persegi ke Bentuk: garis penuh + segitiga kosong (extends). Persegi ke Printable: garis putus-putus + segitiga kosong (implements).

18.
    - a. **Abstract class**: relasi "adalah" (Mobil/Motor/Truk adalah Kendaraan) dan berbagi atribut serta method konkret.
    - b. **Interface** (mis. `WifiAble`): tidak satu hierarki, hanya butuh kemampuan yang sama ("bisa").
    - c. **Keduanya**: abstract class `Pengguna` untuk `Dosen` dan `Mahasiswa` (is-a), dan interface `Mengajar` yang di-implements `Dosen` saja (can-do).
