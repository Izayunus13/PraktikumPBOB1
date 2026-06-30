public class Pembayaran implements Printable {
    private int idPembayaran;
    private String metode;
    private double jumlahBayar;
    private String statusBayar;

    public Pembayaran() {
    }

    public Pembayaran(int idPembayaran, String metode, double jumlahBayar, String statusBayar) {
        this.idPembayaran = idPembayaran;
        this.metode = metode;
        this.jumlahBayar = jumlahBayar;
        this.statusBayar = statusBayar;
    }

    public int getIdPembayaran() {
        return idPembayaran;
    }

    public void setIdPembayaran(int idPembayaran) {
        this.idPembayaran = idPembayaran;
    }

    public String getMetode() {
        return metode;
    }

    public void setMetode(String metode) {
        this.metode = metode;
    }

    public double getJumlahBayar() {
        return jumlahBayar;
    }

    public void setJumlahBayar(double jumlahBayar) {
        this.jumlahBayar = jumlahBayar;
    }

    public String getStatusBayar() {
        return statusBayar;
    }

    public void setStatusBayar(String statusBayar) {
        this.statusBayar = statusBayar;
    }

    public void prosesPembayaran(double totalTagihan) throws PembayaranTidakValidException {
        if (jumlahBayar < totalTagihan) {
            throw new PembayaranTidakValidException("Pembayaran kurang dari total tagihan.");
        }
        statusBayar = "Lunas";
        System.out.println("Pembayaran berhasil diproses.");
    }

    @Override
    public void cetakDetail() {
        System.out.println("=== Detail Pembayaran ===");
        System.out.println("ID Pembayaran : " + idPembayaran);
        System.out.println("Metode        : " + metode);
        System.out.println("Jumlah Bayar  : Rp" + jumlahBayar);
        System.out.println("Status        : " + statusBayar);
    }
}