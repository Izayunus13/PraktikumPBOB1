/*
File : BangunDatar.java
Deskripsi : Kelas BangunDatar sebagai kelas induk untuk bangun datar lainnya
Nama : Iza Yunus Andhika / 24060124140153
Tanggal : 12 Maret 2026
*/

public class BangunDatar {
    //Atribut BangunDatar
    private int jmlSisi;
    private String warna;
    private String border;
    private static int counterbangundatar = 0;

    //Konstruktor BangunDatar tanpa parameter
    public BangunDatar() {
        counterbangundatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterbangundatar++;
    }

    //Getter dan Setter BangunDatar
    public int getJmlSisi() {
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    //Method untuk menampilkan informasi bangun datar
    public void printInfo() {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    public void printCounter() {
        System.out.println("Total BangunDatar: " + counterbangundatar);
    }
}