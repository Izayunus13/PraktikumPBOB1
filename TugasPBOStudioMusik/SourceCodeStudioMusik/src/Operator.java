public class Operator extends Pengguna {

    public Operator() {
    }

    public Operator(int idPengguna, String nama, String noHp) {
        super(idPengguna, nama, noHp);
    }

    @Override
    public void tampilkanPeran() {
        System.out.println("Saya adalah operator studio musik.");
    }

    public void siapkanStudio() {
        System.out.println("Operator " + nama + " sedang menyiapkan studio.");
    }

    public void cekPeralatan() {
        System.out.println("Operator " + nama + " sedang mengecek peralatan.");
    }
}