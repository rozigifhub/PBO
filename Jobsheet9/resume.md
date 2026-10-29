# Resume Materi 9: Abstract Class dan Interface

## Capaian Pembelajaran
- Menjelaskan abstract class dan abstract method
- Membuat class turunan yang meng-override abstract method
- Menjelaskan interface dan membuat class yang `implements`
- Menerapkan multiple interface
- Menggambar notasi UML dan memilih antara abstract class dan interface

## 1. Review Inheritance
- `extends`: class anak mewarisi atribut dan method induk.
- `@Override`: class anak menulis ulang method versinya sendiri.
- Masalah: method seperti `Hewan.bergerak()` isinya tidak bermakna, karena cara bergerak tergantung jenis hewannya.

## 2. Abstract Class

### Pengertian
Abstract class adalah class yang **tidak bisa diinstansiasi** (`new`), tetapi **bisa di-extend**. Class ini baru dipakai lewat class turunannya.

- Boleh berisi atribut, constructor, method konkret, dan method abstract.
- Induk menetapkan aturan (setiap hewan wajib punya `bergerak()`), anak mengisi caranya.
- Pemanggilan seragam: semua objek bisa dipanggil `h.bergerak()`.
- Jika anak lupa meng-override method abstract, program **gagal dikompilasi**.

### Sintaks
```java
public abstract class Hewan {
    protected String nama;
    protected int umur;

    public Hewan(String nama) { this.nama = nama; }

    public void tambahUmur() {          // method konkret
        umur++;
        System.out.println(nama + " berumur " + umur + " tahun");
    }

    public abstract void bergerak();    // method abstract: tanpa { }, diakhiri ;
}
```

### Method abstract vs method biasa
| Method biasa (konkret) | Method abstract |
|---|---|
| Punya badan `{ }` | Tanpa badan, diakhiri `;` |
| Langsung dipakai class turunan | Hanya ada di abstract class (atau interface) |
| Override tidak wajib | **Wajib** di-override |

Aturan: class dengan minimal satu method abstract **wajib** dideklarasikan `abstract`.

### Class turunan
```java
public class Kucing extends Hewan {
    public Kucing(String nama) { super(nama); }

    @Override
    public void bergerak() {
        System.out.println(nama + " berjalan dengan kaki");
    }
}
```
- `super(nama)` memanggil constructor induk.
- Variabel bertipe `Hewan` bisa menampung `Kucing` atau `Ikan`; method yang jalan mengikuti objek aslinya (dibahas di materi Polimorfisme).

### Error yang sering muncul
| Kode salah | Error compiler | Perbaikan |
|---|---|---|
| `new Hewan("Tom")` | `Hewan is abstract; cannot be instantiated` | Buat dari turunan: `new Kucing("Tom")` |
| Turunan lupa `bergerak()` | `... is not abstract and does not override abstract method bergerak()` | Tambahkan `bergerak()` dengan `@Override` |
| `abstract void bergerak() { ... }` | `abstract methods cannot have a body` | Hapus `{ }`, akhiri `;` |

### Notasi UML abstract class
- Nama class abstract dan method abstract ditulis *miring (italic)*, boleh ditambah `«abstract»`.
- Generalisasi (`extends`): garis penuh + segitiga kosong, mengarah ke induk.

### Studi kasus: Phone
`Phone` (abstract) punya atribut `phoneNumber`, method konkret `setPhoneNumber()` dan `getPhoneNumber()`, serta method abstract `call()` dan `endCall()`. `MobilePhone` dan `SmartPhone` mewarisi method konkret apa adanya dan wajib mengisi `call()` serta `endCall()`.

## 3. Interface

### Masalah
`USBCharger.charge(Phone device)` hanya menerima `Phone`. `MP3Player` bukan telepon, jadi tidak bisa di-charge. Membuatnya `extends Phone` tidak masuk akal karena `MP3Player` tidak bisa `call()`.

### Pengertian
Interface adalah **kontrak** berisi daftar method yang wajib dimiliki class yang `implements`-nya, tanpa peduli hierarki pewarisannya. Analogi: port USB.

| Abstract class | Interface |
|---|---|
| Hubungan **ADALAH** (is-a): SmartPhone adalah Phone | Hubungan **BISA** (can-do): MP3Player bisa di-charge |

Nama interface sering berakhiran `-able` (`ChargeAble`, `Comparable`, `Runnable`).

### Sintaks
```java
public interface ChargeAble {
    void doCharge();
}

public class MP3Player implements ChargeAble {
    @Override
    public void doCharge() {
        System.out.println("MP3Player sedang di-charge");
    }
}
```

### Aturan isi interface
1. Method otomatis `public abstract`.
2. Atribut otomatis konstanta (`public static final`).
3. Tidak bisa di-`new` dan tidak punya constructor.
4. Implementasi di class **harus `public`**. Tanpa `public` muncul error `attempting to assign weaker access privileges; was public`.

Catatan: sejak Java 8, interface boleh punya `default` dan `static` method yang berisi. Materi ini fokus pada method abstract.

### Notasi UML interface
- `«interface»` ditulis di atas nama interface.
- Realisasi (`implements`): garis **putus-putus** + segitiga kosong.
- Bandingkan: `extends` memakai garis penuh + segitiga kosong.

### Solusi masalah charger
```java
public class USBCharger {
    public void charge(ChargeAble device) {
        System.out.print("[USBCharger] ");
        device.doCharge();
    }
}
```
Parameter bertipe interface menerima objek apa pun yang meng-`implements` `ChargeAble`. `USBCharger` tidak perlu tahu jenis perangkatnya.

## 4. Multiple Interface
- Satu class boleh `implements` banyak interface, dipisah koma.
- Boleh digabung dengan `extends`: tulis `extends` dulu, lalu `implements`.
- `extends` hanya boleh **satu** class (`class X extends A, B` error).

```java
class MP3Player implements ChargeAble, ModAble { ... }
class SmartPhone extends Phone implements ChargeAble, ModAble { ... }
```

## 5. Abstract Class vs Interface

| Aspek | Abstract Class | Interface |
|---|---|---|
| Kata kunci | `abstract class` / `extends` | `interface` / `implements` |
| Bisa di-`new`? | Tidak | Tidak |
| Isi method | Abstract dan konkret | Abstract |
| Atribut | Bebas (private, protected, dll.) | Hanya konstanta `public static final` |
| Constructor | Boleh | Tidak punya |
| Jumlah per class | `extends` hanya 1 | `implements` boleh banyak |
| Hubungan | "adalah" (is-a) | "bisa" (can-do) |
| UML | Nama miring, panah garis penuh | `«interface»`, panah garis putus-putus |

### Kapan memakai
- **Abstract class**: class berhubungan erat ("adalah"), ingin berbagi kode (atribut, method konkret), butuh atribut biasa atau constructor.
- **Interface**: class tidak satu hierarki tetapi butuh kemampuan yang sama, hanya menentukan APA bukan BAGAIMANA, atau butuh beberapa kemampuan sekaligus.

Tips cepat: "X adalah Y?" → abstract class. "X bisa Z?" → interface. Keduanya boleh dipakai bersamaan.

## Rangkuman
1. **Abstract class**: class umum yang tidak bisa di-`new`, dipakai lewat `extends`.
2. **Abstract method**: method tanpa isi, wajib di-override oleh turunan.
3. **Interface**: kontrak kemampuan, dipakai lewat `implements`.
4. **Pewarisan**: `extends` 1 class, `implements` banyak interface.
5. **UML**: abstract ditulis miring; interface diberi `«interface»` dan panah putus-putus.
