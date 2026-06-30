/* Nama File    : MGaris.java
 * Deskripsi    : berisi Main Garis
 * Pembuat      : Iza Yunus Andhika
 * Tanggal      : 4 Maret 2026
 */

public class MGaris {

    public static void main(String[] args) {

        Titik T1 = new Titik(-2, 0);
        Titik T2 = new Titik(0, 4);
        Garis G1 = new Garis(T1, T2);//Membuat garis G1

        Titik T3 = new Titik(0, 0);
        Titik T4 = new Titik(2, 4);
        Garis G2 = new Garis(T3, T4); //Membuat garis G2

        G1.printGaris(); //Print garis G1
        G2.printGaris(); //Print garis G2

        System.out.println("Panjang Garis : " + G1.getPanjang()); // Menghitung panjang garis
        System.out.println("Gradien       : " + G1.getGradien()); // Menghitung gradien garis
        System.out.println("Sejajar? " + G1.isSejajar(G2)); // Mengecek apakah G1 sejajar dengan G2
        System.out.println("Tegak Lurus? " + G1.isTegakLurus(G2)); // Mengecek apakah G1 tegak lurus dengan G2

        Titik tengah = G1.getTitikTengah(); // Menghitung titik tengah garis G1
        System.out.println("Titik Tengah  : (" + tengah.getAbsis() + "," + tengah.getOrdinat() + ")"); // Menampilkan koordinat titik tengah garis G1
        System.out.println("Persamaan     : " + G1.getPersamaanGaris()); //menampilkan persamaan garis G1
        System.out.println("Jumlah Garis  : " + Garis.getCounterGaris()); //menampilkan jumlah objek garis yang telah dibuat (counterGaris) ke layar

    }
}