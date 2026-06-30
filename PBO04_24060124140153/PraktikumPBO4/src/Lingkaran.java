/*
File : Lingkaran.java
Deskripsi : Kelas Lingkaran sebagai kelas turunan dari BangunDatar
Nama : Iza Yunus Andhika / 24060124140153
Tanggal : 12 Maret 2026
*/

public class Lingkaran extends BangunDatar {
    private double jariJari;
    private static int counterlingkaran = 0;

    //Konstruktor Tanpa Parameter
    public Lingkaran() {
        setJmlSisi(0);
        counterlingkaran++;
    }

    //Konstruktor dengan Parameter
    public Lingkaran(double jariJari, String warna, String border) {
        this.jariJari = jariJari;
        setJmlSisi(0);
        setWarna(warna);
        setBorder(border);
    }

    //Getter dan Setter Lingkaran
    public double getJari() {
        return jariJari;
    }

    public void setJari(double jariJari) {
        this.jariJari = jariJari;
    }

    //Mencari Luas Lingkaran
    public double getLuas() {
        return Math.PI * jariJari * jariJari;
    }

    //Mencari Keliling Lingkaran
    public double getKeliling() {
        return 2 * Math.PI * jariJari;
    }

    //Print info Lingkaran
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari: " + jariJari);
    }

    @Override
    public void printCounter() {
        System.out.println("Total Lingkaran: " + counterlingkaran);
    }
}