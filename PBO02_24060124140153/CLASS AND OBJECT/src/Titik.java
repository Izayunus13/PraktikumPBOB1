/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Iza Yunus Andhika
 * Tanggal      : 2 Maret 2026
 */

public class Titik {
    /*ATRIBUT*/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /*METHOD*/
    //konstruktor untuk membuat titik (0,0)
    Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    Titik(){  // Membuat Titik (0,0)
        this(0,0);
    }

    static int getCounterTitik(){
        return counterTitik;
    }

    //mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y){
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    void printcountertitik(){
        System.out.println(this.counterTitik);
    }

    //mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    double getjarakpusat(){
        return Math.sqrt(Math.pow(absis,2) + Math.pow(ordinat, 2));
    }

    double getjarak(Titik T){
        return Math.sqrt(Math.pow(absis - T.absis, 2) + Math.pow(ordinat - T.ordinat, 2));
    }

    void setrefleksiX(){
        this.ordinat = -this.ordinat;
    }

    void setrefleksiY(){
        this.absis = -this.absis;
    }

    Titik getRefleksiX(){
        return new Titik(this.absis, -this.ordinat);
    }

    Titik getRefleksiY(){
        return new Titik(-this.absis, this.ordinat);
    }

} 