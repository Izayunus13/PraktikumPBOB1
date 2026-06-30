/*
// File : MainPiaraan.java //
// Deskripsi : Aplikasi untuk menguji kelas Piaraan (Koleksi Kelas Bentukan) //
// Nama : Iza Yunus Andhika //
// NIM  : 24060124140153 //
*/

public class MainPiaraan {
    public static void main(String[] args) {
        Piaraan klinik = new Piaraan();

        // enqueueAnabul - menambah hewan ke antrean klinik
        Kucing k1 = new Kucing("Mochi", 3.5);
        Kucing k2 = new Kucing("Gembul", 5.2);
        Anjing a1 = new Anjing("Rocky");
        Burung b1 = new Burung("Tweety");
        Anjing a2 = new Anjing("Brownie");

        klinik.enqueueAnabul(k1);
        klinik.enqueueAnabul(a1);
        klinik.enqueueAnabul(k2);
        klinik.enqueueAnabul(b1);
        klinik.enqueueAnabul(a2);

        // showAnabul
        klinik.showAnabul();

        // getNbelm
        System.out.println("\nJumlah anabul dalam antrean: " + klinik.getNbelm());

        // getAnabul - peek elemen pertama
        System.out.println("Anabul pertama (peek): " + klinik.getAnabul().getPanggilan());

        // isMember
        System.out.println("\nisMember(Rocky): " + klinik.isMember(a1));
        System.out.println("isMember(new Anjing): " + klinik.isMember(new Anjing("Lain")));

        // showJenisAnabul
        System.out.println();
        klinik.showJenisAnabul();

        // countKucing
        System.out.println("\nJumlah keluarga Kucing: " + klinik.countKucing());

        // bobotKucing
        System.out.println("Total bobot keluarga Kucing: " + klinik.bobotKucing() + " kg");

        // dequeueAnabul - ambil dan keluarkan dari antrean
        System.out.println("\nMelayani: " + klinik.dequeueAnabul().getPanggilan());
        System.out.println("Melayani: " + klinik.dequeueAnabul().getPanggilan());
        System.out.println("\nAntrean setelah 2 dequeue:");
        klinik.showAnabul();
    }
}