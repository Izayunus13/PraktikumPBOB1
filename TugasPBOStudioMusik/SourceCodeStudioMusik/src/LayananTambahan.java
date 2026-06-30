public class LayananTambahan {
    private int idLayanan;
    private String namaLayanan;
    private double harga;

    public LayananTambahan() {
    }

    public LayananTambahan(int idLayanan, String namaLayanan, double harga) {
        this.idLayanan = idLayanan;
        this.namaLayanan = namaLayanan;
        this.harga = harga;
    }

    public int getIdLayanan() {
        return idLayanan;
    }

    public void setIdLayanan(int idLayanan) {
        this.idLayanan = idLayanan;
    }

    public String getNamaLayanan() {
        return namaLayanan;
    }

    public void setNamaLayanan(String namaLayanan) {
        this.namaLayanan = namaLayanan;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void tampilkanLayanan() {
        System.out.println("Layanan tambahan: " + namaLayanan + " - Rp" + harga);
    }
}