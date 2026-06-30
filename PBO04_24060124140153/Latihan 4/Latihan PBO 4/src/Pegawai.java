import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Pegawai {
    // Atribut
    protected String nip;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate tmt;
    protected double gajiPokok;

    // Konstruktor
    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    // Method
    public Period hitungMasaKerja() { // Menghitung masa kerja dalam tahun dan bulan
        return Period.between(tmt, LocalDate.now());
    }

    public String formatTanggal(LocalDate tanggal) { // Format tanggal menjadi "d MMMM yyyy"
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d MMMM yyyy");
        return tanggal.format(format);
    }


    // menampilkan informasi dasar pegawai
    public void printInfo() {
        System.out.println("NIP : " + nip);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + formatTanggal(tanggalLahir));
        System.out.println("TMT : " + formatTanggal(tmt));
        System.out.println("Gaji Pokok : Rp " + gajiPokok);
    }
}