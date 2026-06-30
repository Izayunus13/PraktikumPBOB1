public abstract class Pengguna {
    protected int idPengguna;
    protected String nama;
    protected String noHp;

    public Pengguna() {
    }

    public Pengguna(int idPengguna, String nama, String noHp) {
        this.idPengguna = idPengguna;
        this.nama = nama;
        this.noHp = noHp;
    }

    public int getIdPengguna() {
        return idPengguna;
    }

    public void setIdPengguna(int idPengguna) {
        this.idPengguna = idPengguna;
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

    public void login() {
        System.out.println(nama + " berhasil login.");
    }

    public void logout() {
        System.out.println(nama + " berhasil logout.");
    }

    public abstract void tampilkanPeran();
}