public class Jadwal {
    private int idJadwal;
    private String tanggal;
    private String jamMulai;
    private String jamSelesai;

    public Jadwal() {
    }

    public Jadwal(int idJadwal, String tanggal, String jamMulai, String jamSelesai) {
        this.idJadwal = idJadwal;
        this.tanggal = tanggal;
        this.jamMulai = jamMulai;
        this.jamSelesai = jamSelesai;
    }

    public int getIdJadwal() {
        return idJadwal;
    }

    public void setIdJadwal(int idJadwal) {
        this.idJadwal = idJadwal;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getJamMulai() {
        return jamMulai;
    }

    public void setJamMulai(String jamMulai) {
        this.jamMulai = jamMulai;
    }

    public String getJamSelesai() {
        return jamSelesai;
    }

    public void setJamSelesai(String jamSelesai) {
        this.jamSelesai = jamSelesai;
    }

    public void tampilkanJadwal() {
        System.out.println("Jadwal: " + tanggal + ", " + jamMulai + " - " + jamSelesai);
    }
}