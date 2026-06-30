// file : Kucing.java //
// deskripsi : Kelas anak Kucing yang mewarisi Anabul, ditambah atribut bobot //
// Nama : Iza Yunus Andhika //
// NIM  : 24060124140153 // 

public class Kucing extends Anabul {

    // atribut bobot dalam kilogram
    protected double bobot;

    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    public double getBobot() {
        return bobot;
    }

    @Override
    public void gerak() {
        System.out.println(panggilan + " (Kucing) bergerak dengan melata");
    }

    @Override
    public void bersuara() {
        System.out.println(panggilan + " (Kucing) bersuara : Meong!");
    }
}