# Jawaban Tugas — Jobsheet 6 (Inheritance)

## 1. Program tersebut termasuk jenis inheritance apa? Tunjukkan bagian mana yang merupakan hierarchical dan bagian mana yang merupakan multilevel.

Program ini merupakan **kombinasi (hybrid)** dari hierarchical inheritance dan multilevel inheritance:

- **Multilevel inheritance** terjadi pada rantai:
  `Tiket → TiketPesawat → TiketDomestik` dan `Tiket → TiketPesawat → TiketInternasional`.
  Di sini sebuah subclass (TiketPesawat) menjadi superclass bagi class lain (TiketDomestik/TiketInternasional), sehingga membentuk bertingkat.

- **Hierarchical inheritance** terjadi karena satu class memiliki lebih dari satu subclass:
  - `Tiket` memiliki 2 subclass: `TiketKereta` dan `TiketPesawat`.
  - `TiketPesawat` memiliki 2 subclass: `TiketDomestik` dan `TiketInternasional`.

## 2. Sebutkan seluruh atribut yang dimiliki objek TiketInternasional, beserta class asal masing-masing atribut.

| Atribut | Tipe | Class Asal |
|---|---|---|
| kodeTiket | String | Tiket |
| namaPenumpang | String | Tiket |
| asal | String | Tiket |
| tujuan | String | Tiket |
| hargaDasar | int | Tiket |
| maskapai | String | TiketPesawat |
| beratBagasi | int | TiketPesawat |
| nomorPaspor | String | TiketInternasional |
| asuransi | int | TiketInternasional |

Total: 9 atribut (5 diwarisi dari Tiket, 2 dari TiketPesawat, 2 milik sendiri).

## 3. Mengapa TiketDomestik dapat memanggil hitungBiayaBagasi() padahal method tersebut tidak dideklarasikan di dalam class-nya?

Karena `TiketDomestik` merupakan subclass dari `TiketPesawat`, dan method `hitungBiayaBagasi()` dideklarasikan di class `TiketPesawat` dengan access modifier `public`. Sesuai konsep pewarisan, member superclass dengan modifier `public`/`protected`/default akan **diwariskan** ke subclass-nya, sehingga objek `TiketDomestik` dapat memanggil method tersebut seolah-olah miliknya sendiri tanpa perlu mendeklarasikannya ulang.

## 4. Ubah access modifier hargaDasar pada class Tiket menjadi private, lalu compile ulang. Apa yang terjadi? Berikan satu cara memperbaikinya tanpa mengembalikan modifier ke protected.

Jika `hargaDasar` diubah menjadi `private`, proses compile **gagal (error)**. Muncul error seperti:

```
error: hargaDasar has private access in Tiket
```

Error muncul di class `TiketKereta`, `TiketDomestik`, dan `TiketInternasional` karena ketiganya mengakses `hargaDasar` secara langsung, sedangkan member `private` **tidak diwariskan** dan tidak dapat diakses dari luar class-nya (termasuk oleh subclass).

**Cara memperbaiki tanpa mengembalikan ke protected:** tambahkan getter dan setter `public` pada class `Tiket`, misalnya:

```java
public int getHargaDasar() {
    return hargaDasar;
}

public void setHargaDasar(int hargaDasar) {
    this.hargaDasar = hargaDasar;
}
```

Lalu ganti semua akses langsung `hargaDasar` pada subclass dengan `getHargaDasar()`, dan pengisian nilainya melalui `setHargaDasar(...)` atau lewat konstruktor `super(...)`.
