/*
 * Nama File  : Titik.java
 * Deskripsi  : berisi atribut dan method dalam class Titik
 * Pembuat    : Iza Yunus Andhika / 24060124140153
 * Tanggal    : 24 Februari 2026
 */

public class Titik {

    // ===== ATRIBUT =====
    double absis;
    double ordinat;

    // ===== KONSTRUKTOR =====
    Titik() {
        absis = 0;
        ordinat = 0;
    }

    // ===== GETTER =====
    double getAbsis() {
        return absis;
    }

    double getOrdinat() {
        return ordinat;
    }

    // ===== SETTER =====
    void setAbsis(double x) {
        absis = x;
    }

    void setOrdinat(double y) {
        ordinat = y;
    }

    // ===== METHOD GESER =====
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // ===== PRINT =====
    void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }
}