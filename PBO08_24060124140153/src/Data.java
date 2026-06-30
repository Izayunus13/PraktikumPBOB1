// file : Data.java //
// deskripsi : Kelas generik Data dengan larik statis 100 elemen generik //
// Nama : Iza Yunus Andhika //
// NIM  : 24060124140153 //

public class Data<T> {

    // larik statis berisi 100 elemen generik
    private Object[] ruang;  // pakai Object karena Java tidak bisa new T[100]
    private int banyak;      // banyaknya elemen efektif

    // konstruktor
    public Data() {
        ruang = new Object[100];
        banyak = 0;
    }

    // prosedur setIsi - mengisi elemen pada posisi tertentu
    // posisi {1..100} sesuai soal (1-indexed)
    public void setIsi(int posisi, T objek) {
        if (posisi >= 1 && posisi <= 100) {
            // kalau posisi itu belum pernah diisi sebelumnya, tambah banyak
            if (ruang[posisi - 1] == null) {
                banyak++;
            }
            ruang[posisi - 1] = objek;
        } else {
            System.out.println("Posisi harus antara 1 sampai 100!");
        }
    }

    // fungsi getIsi - mengembalikan elemen pada posisi tertentu
    // posisi {1..100} sesuai soal (1-indexed)
    @SuppressWarnings("unchecked")
    public T getIsi(int posisi) {
        if (posisi >= 1 && posisi <= 100) {
            return (T) ruang[posisi - 1];
        } else {
            System.out.println("Posisi harus antara 1 sampai 100!");
            return null;
        }
    }

    // fungsi getSize - mengembalikan banyak elemen efektif
    public int getSize() {
        return banyak;
    }
}