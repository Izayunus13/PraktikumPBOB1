import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        // Membuat objek pegawai
        Pegawai pegawai1 = new Pegawai("321321098", "Joko Widodo", LocalDate.of(1972, 5, 12), LocalDate.of(2015, 3, 1), 8500000);
        Pegawai pegawai2 = new Pegawai("123123098", "Prabowo Subianto", LocalDate.of(1985, 8, 13), LocalDate.of(2010, 7, 15), 9000000);

        // Menampilkan informasi pegawai dan masa kerja
        System.out.println("Informasi Pegawai 1:");
        pegawai1.printInfo();
        System.out.println("Masa Kerja: " + pegawai1.hitungMasaKerja().getYears() + " tahun");

        System.out.println("\nInformasi Pegawai 2:");
        pegawai2.printInfo();
        System.out.println("Masa Kerja: " + pegawai2.hitungMasaKerja().getYears() + " tahun");
    }
}