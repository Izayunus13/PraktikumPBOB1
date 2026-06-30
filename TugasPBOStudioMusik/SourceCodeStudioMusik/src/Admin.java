public class Admin extends Pengguna {

    public Admin() {
    }

    public Admin(int idPengguna, String nama, String noHp) {
        super(idPengguna, nama, noHp);
    }

    @Override
    public void tampilkanPeran() {
        System.out.println("Saya adalah admin studio musik.");
    }

    public void kelolaReservasi() {
        System.out.println("Admin " + nama + " sedang mengelola reservasi.");
    }

    public void konfirmasiPembayaran() {
        System.out.println("Admin " + nama + " sedang mengonfirmasi pembayaran.");
    }
}