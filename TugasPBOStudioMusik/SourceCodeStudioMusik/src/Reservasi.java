import java.util.ArrayList;

public class Reservasi implements Printable {
    private int idReservasi;
    private String tanggalPesan;
    private int durasiJam;
    private String status;
    private Pelanggan pelanggan;
    private Studio studio;
    private Jadwal jadwal;
    private ArrayList<LayananTambahan> daftarLayanan;
    private Pembayaran pembayaran;

    public Reservasi() {
        daftarLayanan = new ArrayList<>();
    }

    public Reservasi(int idReservasi, String tanggalPesan, int durasiJam, String status,
                     Pelanggan pelanggan, Studio studio, Jadwal jadwal) {
        assert durasiJam > 0 : "Durasi harus lebih dari 0";

        this.idReservasi = idReservasi;
        this.tanggalPesan = tanggalPesan;
        this.durasiJam = durasiJam;
        this.status = status;
        this.pelanggan = pelanggan;
        this.studio = studio;
        this.jadwal = jadwal;
        this.daftarLayanan = new ArrayList<>();
    }

    public int getIdReservasi() {
        return idReservasi;
    }

    public void setIdReservasi(int idReservasi) {
        this.idReservasi = idReservasi;
    }

    public String getTanggalPesan() {
        return tanggalPesan;
    }

    public void setTanggalPesan(String tanggalPesan) {
        this.tanggalPesan = tanggalPesan;
    }

    public int getDurasiJam() {
        return durasiJam;
    }

    public void setDurasiJam(int durasiJam) {
        assert durasiJam > 0 : "Durasi harus lebih dari 0";
        this.durasiJam = durasiJam;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public Studio getStudio() {
        return studio;
    }

    public void setStudio(Studio studio) {
        this.studio = studio;
    }

    public Jadwal getJadwal() {
        return jadwal;
    }

    public void setJadwal(Jadwal jadwal) {
        this.jadwal = jadwal;
    }

    public ArrayList<LayananTambahan> getDaftarLayanan() {
        return daftarLayanan;
    }

    public void setPembayaran(Pembayaran pembayaran) {
        this.pembayaran = pembayaran;
    }

    public Pembayaran getPembayaran() {
        return pembayaran;
    }

    public void tambahLayananTambahan(LayananTambahan layanan) {
        daftarLayanan.add(layanan);
    }

    public double hitungTotal() {
        double total = studio.getTarifPerJam() * durasiJam;
        for (LayananTambahan layanan : daftarLayanan) {
            total += layanan.getHarga();
        }
        return total;
    }

    public double hitungTotal(double diskon) {
        return hitungTotal() - diskon;
    }

    public void konfirmasiReservasi() throws JadwalBentrokException {
        if (!studio.cekKetersediaan()) {
            throw new JadwalBentrokException("Studio sedang tidak tersedia pada jadwal tersebut.");
        }
        status = "Dikonfirmasi";
        studio.ubahStatus(false);
        System.out.println("Reservasi berhasil dikonfirmasi.");
    }

    public void konfirmasiReservasi(String catatan) throws JadwalBentrokException {
        konfirmasiReservasi();
        System.out.println("Catatan reservasi: " + catatan);
    }

    @Override
    public void cetakDetail() {
        System.out.println("=== Detail Reservasi ===");
        System.out.println("ID Reservasi   : " + idReservasi);
        System.out.println("Tanggal Pesan  : " + tanggalPesan);
        System.out.println("Durasi         : " + durasiJam + " jam");
        System.out.println("Status         : " + status);
        System.out.println("Pelanggan      : " + pelanggan.getNama());
        System.out.println("Studio         : " + studio.getNamaStudio());
        System.out.println("Jadwal         : " + jadwal.getTanggal() + ", " + jadwal.getJamMulai() + " - " + jadwal.getJamSelesai());
        System.out.println("Total          : Rp" + hitungTotal());
    }
}