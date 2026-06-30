// file : Burung.java //
// deskripsi : Kelas anak Burung yang mewarisi Anabul, bergerak terbang dan bersuara cuit //
// Nama : Iza Yunus Andhika //
// NIM  : 24060124140153 // 

public class Burung extends Anabul {

    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(panggilan + " (Burung) bergerak dengan terbang");
    }

    @Override
    public void bersuara() {
        System.out.println(panggilan + " (Burung) bersuara : Cuit!");
    }
}