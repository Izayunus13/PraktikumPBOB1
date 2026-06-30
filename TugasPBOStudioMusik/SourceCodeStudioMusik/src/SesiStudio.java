public class SesiStudio {
    private int idSesi;
    private Reservasi reservasi;
    private Operator operator;
    private String catatan;

    public SesiStudio() {
    }

    public SesiStudio(int idSesi, Reservasi reservasi, Operator operator, String catatan) {
        this.idSesi = idSesi;
        this.reservasi = reservasi;
        this.operator = operator;
        this.catatan = catatan;
    }

    public int getIdSesi() {
        return idSesi;
    }

    public void setIdSesi(int idSesi) {
        this.idSesi = idSesi;
    }

    public Reservasi getReservasi() {
        return reservasi;
    }

    public void setReservasi(Reservasi reservasi) {
        this.reservasi = reservasi;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public String getCatatan() {
        return catatan;
    }

    public void setCatatan(String catatan) {
        this.catatan = catatan;
    }

    public void mulaiSesi() {
        System.out.println("Sesi studio dimulai oleh operator " + operator.getNama() + ".");
    }

    public void akhiriSesi() {
        System.out.println("Sesi studio selesai.");
    }
}