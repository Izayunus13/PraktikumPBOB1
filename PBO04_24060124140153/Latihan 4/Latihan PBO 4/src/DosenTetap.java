import java.time.LocalDate;
import java.time.Period;

public class DosenTetap extends DosenP4 {
    // Atribut
    private String nidn;

    // Konstruktor dengan parameter
    public DosenTetap(String nip, String nidn, String nama, LocalDate tanggalLahir,
                      LocalDate tmt, double gajiPokok, String fakultas) {

        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    // Method
    public LocalDate hitungTanggalPensiun() { // Pensiun pada usia 65 tahun
        LocalDate pensiun = tanggalLahir.plusYears(65);
        return LocalDate.of(pensiun.getYear(), pensiun.getMonth().plus(1), 1);
    }

    public double hitungTunjangan() { // Tunjangan 2% per tahun masa kerja
        Period masaKerja = hitungMasaKerja();
        return 0.02 * masaKerja.getYears() * gajiPokok;
    }

    public Period hitungMasaKerja() { // Menghitung masa kerja dalam tahun dan bulan
        return Period.between(tmt, LocalDate.now());
    }

    // Method Override untuk menampilkan informasi lengkap dosen tetap
    @Override
    public void printInfo() {

        Period masaKerja = hitungMasaKerja();

        super.printInfo();
        System.out.println("NIDN : " + nidn);
        System.out.println("Jabatan : Dosen Tetap");
        System.out.println("Fakultas : " + fakultas);

        System.out.println("Masa Kerja : " +
                masaKerja.getYears() + " tahun " +
                masaKerja.getMonths() + " bulan");

        System.out.println("Tanggal Pensiun : " + formatTanggal(hitungTanggalPensiun()));

        System.out.println("Tunjangan : Rp " + hitungTunjangan());
    }
}