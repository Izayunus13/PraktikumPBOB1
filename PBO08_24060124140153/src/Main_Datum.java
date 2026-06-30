// file : Main_Datum.java //
// deskripsi : Program utama untuk ilustrasi kelas generik Datum + aplikasi keluarga Anabul //
// Nama : Iza Yunus Andhika //
// NIM  : 24060124140153 // 

public class Main_Datum {
    public static void main(String[] args) {

        System.out.println("=== Ilustrasi Kelas Generik Datum ===\n");

        // Datum berisi Integer
        Datum<Integer> datumAngka = new Datum<>(42);
        System.out.println("Datum Integer awal : " + datumAngka.getIsi());
        datumAngka.setIsi(100);
        System.out.println("Datum Integer setelah setIsi : " + datumAngka.getIsi());

        System.out.println();

        // Datum berisi String
        Datum<String> datumKata = new Datum<>("Halo");
        System.out.println("Datum String awal : " + datumKata.getIsi());
        datumKata.setIsi("Dunia");
        System.out.println("Datum String setelah setIsi : " + datumKata.getIsi());

        System.out.println();

        // Datum berisi objek Kucing
        System.out.println("=== Aplikasi Datum dengan Keluarga Anabul ===\n");

        Kucing mochi = new Kucing("Mochi", 3.5);
        Datum<Kucing> datumKucing = new Datum<>(mochi);

        System.out.println("Datum Kucing awal : " + datumKucing.getIsi().getNama()
                + " (bobot: " + datumKucing.getIsi().getBobot() + " kg)");
        datumKucing.getIsi().bersuara();
        datumKucing.getIsi().gerak();

        System.out.println();

        // ganti isi datum dengan Anggora
        Anggora bella = new Anggora("Bella", 4.2);
        datumKucing.setIsi(bella);

        System.out.println("Datum Kucing setelah setIsi : " + datumKucing.getIsi().getNama()
                + " (bobot: " + datumKucing.getIsi().getBobot() + " kg)");
        datumKucing.getIsi().bersuara();
        datumKucing.getIsi().gerak();

        System.out.println();

        // Datum berisi Anabul sebagai tipe induk
        Datum<Anabul> datumAnabul = new Datum<>(new Kucing("Oyen", 5.0));

        System.out.println("Datum Anabul awal : " + datumAnabul.getIsi().getNama());
        datumAnabul.getIsi().bersuara();
        datumAnabul.getIsi().gerak();

        System.out.println();

        // ganti dengan Anggora
        datumAnabul.setIsi(new Anggora("Luna", 3.9));

        System.out.println("Datum Anabul setelah setIsi : " + datumAnabul.getIsi().getNama());
        datumAnabul.getIsi().bersuara();
        datumAnabul.getIsi().gerak();

        System.out.println();

        // ganti dengan Kembangtelon
        datumAnabul.setIsi(new Kembangtelon("Oreo", 3.8));

        System.out.println("Datum Anabul setelah setIsi lagi : " + datumAnabul.getIsi().getNama());
        datumAnabul.getIsi().bersuara();
        datumAnabul.getIsi().gerak();
    }
}