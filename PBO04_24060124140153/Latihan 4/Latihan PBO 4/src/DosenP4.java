import java.time.LocalDate;

public abstract class DosenP4 extends Pegawai {
    // Atribut
    protected String fakultas;

    // Konstruktor 
    public DosenP4(String nip, String nama, LocalDate tanggalLahir,
                 LocalDate tmt, double gajiPokok, String fakultas) {

        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }

    // Method
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas : " + fakultas);
    }

}