// file : Anjing.java //
// deskripsi : Kelas anak Anjing yang mewarisi Anabul, bergerak melata dan bersuara guk-guk //
// Nama : Iza Yunus Andhika //
// NIM  : 24060124140153 //

public class Anjing extends Anabul {

    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(panggilan + " (Anjing) bergerak dengan melata");
    }

    @Override
    public void bersuara() {
        System.out.println(panggilan + " (Anjing) bersuara : Guk-guk!");
    }
}