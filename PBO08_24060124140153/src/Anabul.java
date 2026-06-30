// file : Anabul.java //
// deskripsi : Kelas induk (abstract) untuk hewan peliharaan - Polimorfisme Universal Inclusion //
// Nama : Iza Yunus Andhika //
// NIM  : 24060124140153 //

public abstract class Anabul {

    // atribut
    protected String nama;

    // konstruktor
    public Anabul(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    // metode abstrak yang harus di-override di kelas anak
    public abstract void gerak();
    public abstract void bersuara();
}