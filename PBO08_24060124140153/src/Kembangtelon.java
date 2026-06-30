// file : Kembangtelon.java //
// deskripsi : Kelas Kembangtelon yang mewarisi kelas Kucing //
// Nama : Iza Yunus Andhika //
// NIM  : 24060124140153 // 

public class Kembangtelon extends Kucing {

    public Kembangtelon(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " (Kembangtelon) bergerak dengan lincah");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " (Kembangtelon) bersuara : Mreong!");
    }
}