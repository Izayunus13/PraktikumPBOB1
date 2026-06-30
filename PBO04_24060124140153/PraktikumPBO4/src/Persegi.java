/*
File : Persegi.java
Deskripsi : Kelas Persegi sebagai kelas turunan dari BangunDatar
Nama : Iza Yunus Andhika / 24060124140153
Tanggal : 12 Maret 2026
*/

public class Persegi extends BangunDatar {
    private double sisi;
    private static int counterpersegi = 0;

    //Konstruktor tanpa parameter
    public Persegi() {
        setJmlSisi(4);
        counterpersegi++;
    }

    //Konstruktor dengan parameter
    public Persegi(double sisi,String warna, String border) {
        this.sisi = sisi;
        setJmlSisi(4);
        setWarna(warna);
        setBorder(border);
    }

    //Getter dan setter
    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    //Method mencari Luas Persegi
    public double getLuas() {
        return sisi * sisi;
    }

    //Mencari Keliling Persegi
    public double getKeliling() {
        return 4 * sisi;
    }

    //Mencari diagonal Persegi
    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }

    //Print info Persegi
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }

    @Override
    public void printCounter() {
        System.out.println("Total Persegi: " + counterpersegi);
    }

}