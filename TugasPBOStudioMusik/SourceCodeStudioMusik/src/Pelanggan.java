public class Pelanggan {
    private int idPelanggan;
    private String nama;
    private String noHp;
    private String email;

    public Pelanggan() {
    }

    public Pelanggan(int idPelanggan, String nama, String noHp, String email) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.noHp = noHp;
        this.email = email;
    }

    public int getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(int idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void buatReservasi() {
        System.out.println(nama + " sedang membuat reservasi.");
    }

    public void lihatRiwayat() {
        System.out.println(nama + " sedang melihat riwayat reservasi.");
    }
}