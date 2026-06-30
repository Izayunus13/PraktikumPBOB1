// file : Anabul.java //
// deskripsi : Kelas induk (abstract) untuk hewan peliharaan - Polimorfisme Universal Inclusion //
// Nama : Iza Yunus Andhika //
// NIM  : 24060124140153 //

public abstract class Anabul {

    // atribut
    protected String panggilan;

    // konstruktor
    public Anabul(String panggilan) {
        this.panggilan = panggilan;
    }

    public String getPanggilan() {
        return panggilan;
    }

    public void setPanggilan(String panggilan) {
        this.panggilan = panggilan;
    }

    // metode abstrak yang harus di-override di kelas anak
    public abstract void gerak();
    public abstract void bersuara();
}