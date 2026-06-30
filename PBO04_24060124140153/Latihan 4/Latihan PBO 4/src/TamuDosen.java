import java.time.LocalDate;
import java.time.Period;

public class DosenTamu extends DosenP4 {
    // Atribut
    private String nidk;
    private LocalDate akhirKontrak;

    // Konstruktor dengan parameter 
    public DosenTamu(String nip, String nidk, String nama, LocalDate tanggalLahir,
                     LocalDate tmt, double gajiPokok, String fakultas, LocalDate akhirKontrak) {

        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.akhirKontrak = akhirKontrak;
    }

    // Method
    public double hitungTunjangan() { // Tunjangan 2.5% dari gaji pokok
        return 0.025 * gajiPokok;
    }

    public Period sisaKontrak() { // Menghitung sisa kontrak dalam bulan
        return Period.between(LocalDate.now(), akhirKontrak);
    }

    // Method Override untuk menampilkan informasi lengkap dosen tamu
    @Override
    public void printInfo() {

        Period kontrak = sisaKontrak();

        super.printInfo();
        System.out.println("NIDK : " + nidk);
        System.out.println("Jabatan : Dosen Tamu");
        System.out.println("Fakultas : " + fakultas);

        System.out.println("Kontrak Berakhir : " + formatTanggal(akhirKontrak));

        System.out.println("Sisa Kontrak : " +
                kontrak.getMonths() + " bulan");

        System.out.println("Tunjangan : Rp " + hitungTunjangan());
    }
}