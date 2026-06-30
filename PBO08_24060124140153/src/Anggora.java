// file : Anggora.java //
// deskripsi : Kelas Anggora yang mewarisi kelas Kucing //
// Nama : Iza Yunus Andhika //
// NIM  : 24060124140153 //

public class Anggora extends Kucing {

    public Anggora(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " (Anggora) bergerak dengan melata anggun");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " (Anggora) bersuara : Meooong~!");
    }
}