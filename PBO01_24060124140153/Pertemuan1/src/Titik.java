/*
 * Nama File  : Titik.java
 * Deskripsi  : berisi atribut dan method dalam class Titik
 * Pembuat    : Iza Yunus Andhika / 24060124140153
 * Tanggal    : 24 Februari 2026
 */

public class Titik {

    double absis;
    double ordinat;

    Titik() {
        absis = 0;
        ordinat = 0;
    }

    Titik(double absis, double ordinat) {
    this.absis = absis;
    this.ordinat = ordinat;
    }

    double getAbsis() {
        return absis;
    }

    double getOrdinat() {
        return ordinat;
    }

    void setAbsis(double x) {
        absis = x;
    }

    void setOrdinat(double y) {
        ordinat = y;
    }

    // ===== METHOD GESER ===== //
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // ===== PRINT ===== //
    void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }
    // ===== GET KUADRAN ===== //
    int getKuadran() {
        if (absis > 0 && ordinat > 0) {
            return 1;
        } else if (absis < 0 && ordinat > 0) {
            return 2;
        } else if (absis < 0 && ordinat < 0) {
            return 3;
        } else if (absis > 0 && ordinat < 0) {
            return 4;
        } else {
            return 0;
        }
    }
    // ===== GetJarakPusat ===== //
    double getJarakPusat() {
        return Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat,2));
    }

    // ===== GetJarak ===== // 
    double getJarak(Titik T) {
        return Math.sqrt(
         Math.pow(this.absis - T.absis,2) +
         Math.pow(this.ordinat - T.ordinat,2)
        );
    }
    // ===== SET REFLEKSI TERHADAP SUMBU X ===== //
   void RefleksiX() {
    this.ordinat=this.ordinat*(-1);
    }

    // ===== SET REFLEKSI TERHADAP SUMBU Y ===== //
    void RefleksiY() {
    this.absis=this.absis*(-1);
    }
     // ===== GET REFLEKSI TERHADAP SUMBU X ===== //
    Titik getRefleksiX() {
    return new Titik(this.absis, -this.ordinat);
    }

     // ===== GET REFLEKSI TERHADAP SUMBU Y ===== //
    Titik getRefleksiY() {
    return new Titik(-this.absis, this.ordinat);



    }
}