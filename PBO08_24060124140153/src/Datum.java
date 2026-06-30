// file : Datum.java //
// deskripsi : Kelas generik Datum dengan atribut isi bertipe generik T //
// Nama : Iza Yunus Andhika //
// NIM  : 24060124140153 // 

// <T> artinya kelas ini bisa menampung tipe data apapun
// T hanya nama placeholder, bisa diganti huruf lain
public class Datum<T> {

    // atribut isi bertipe generik T
    private T isi;

    // konstruktor
    public Datum(T isi) {
        this.isi = isi;
    }

    // fungsi getIsi - mengembalikan nilai isi
    public T getIsi() {
        return isi;
    }

    // prosedur setIsi - mengubah nilai isi
    public void setIsi(T isibaru) {
        this.isi = isibaru;
    }
}