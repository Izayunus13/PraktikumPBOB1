// file : Main_Data.java //
// deskripsi : Program utama untuk ilustrasi kelas generik Data + aplikasi keluarga Anabul //
// Nama : Iza Yunus Andhika //
// NIM  : 24060124140153 //  

public class Main_Data {
    public static void main(String[] args) {

        System.out.println("=== Ilustrasi Kelas Generik Data ===\n");

        // --- Aplikasi Data dengan Integer ---
        Data<Integer> dataAngka = new Data<>();
        dataAngka.setIsi(1, 10);
        dataAngka.setIsi(2, 20);
        dataAngka.setIsi(3, 30);

        System.out.println("Data Integer :");
        System.out.println("Elemen posisi 1 : " + dataAngka.getIsi(1));
        System.out.println("Elemen posisi 2 : " + dataAngka.getIsi(2));
        System.out.println("Elemen posisi 3 : " + dataAngka.getIsi(3));
        System.out.println("Jumlah elemen efektif : " + dataAngka.getSize());

        System.out.println();

        // --- Aplikasi Data dengan keluarga Anabul ---
        System.out.println("=== Aplikasi Data dengan Keluarga Anabul ===\n");

        Data<Anabul> dataAnabul = new Data<>();

        // b. setIsi untuk keluarga Anabul
        dataAnabul.setIsi(1, new Kucing("Mochi", 3.5));
        dataAnabul.setIsi(2, new Anggora("Bella", 4.2));
        dataAnabul.setIsi(3, new Kembangtelon("Oreo", 3.8));

        System.out.println("Setelah setIsi 5 anabul :");
        System.out.println();

        // c. getIsi untuk keluarga Anabul
        System.out.println("getIsi posisi 1 : " + dataAnabul.getIsi(1).getNama());
        dataAnabul.getIsi(1).bersuara();
        dataAnabul.getIsi(1).gerak();

        System.out.println();

        System.out.println("getIsi posisi 2 : " + dataAnabul.getIsi(2).getNama());
        dataAnabul.getIsi(2).bersuara();
        dataAnabul.getIsi(2).gerak();

        System.out.println();

        System.out.println("getIsi posisi 3 : " + dataAnabul.getIsi(3).getNama());
        dataAnabul.getIsi(3).bersuara();
        dataAnabul.getIsi(3).gerak();

        System.out.println();

        System.out.println("getIsi posisi 4 : " + dataAnabul.getIsi(4).getNama());
        dataAnabul.getIsi(4).bersuara();
        dataAnabul.getIsi(4).gerak();

        System.out.println();

        System.out.println("getIsi posisi 5 : " + dataAnabul.getIsi(5).getNama());
        dataAnabul.getIsi(5).bersuara();
        dataAnabul.getIsi(5).gerak();

        System.out.println();

        // d. getSize untuk keluarga Anabul
        System.out.println("getSize (jumlah anabul dalam Data) : " + dataAnabul.getSize());

        System.out.println();

        // Tampilkan semua anabul menggunakan loop
        System.out.println("=== Semua Anabul dalam Data (pakai loop) ===\n");
        for (int i = 1; i <= dataAnabul.getSize(); i++) {
            Anabul a = dataAnabul.getIsi(i);
            System.out.println("Posisi " + i + " : " + a.getNama());
            a.bersuara();
            a.gerak();
            System.out.println();
        }
    }
}