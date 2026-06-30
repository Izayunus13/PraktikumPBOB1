// file : OperatorGenerik.java //
// deskripsi : Kelas OperatorGenerik dengan prosedur Tukar dan fungsi Bobot2 //
// Nama : Iza Yunus Andhika //
// NIM  : 24060124140153 // 

public class OperatorGenerik {

    // Prosedur Tukar tidak bisa langsung swap primitive (pass by value di Java)
    // Jadi kita pakai wrapper array 1 elemen supaya bisa dimodifikasi di dalam method
    // <T> di depan void artinya ini method generik
    public static <T> void Tukar(T[] a, T[] b) {
        T temp = a[0];
        a[0] = b[0];
        b[0] = temp;
    }

    // Fungsi Bobot2 - menerima dua objek keturunan Kucing, kembalikan jumlah bobotnya
    // <T extends Kucing> artinya T harus Kucing atau subclass Kucing
    public static <T extends Kucing> double Bobot2(T k1, T k2) {
        return k1.getBobot() + k2.getBobot();
    }
}