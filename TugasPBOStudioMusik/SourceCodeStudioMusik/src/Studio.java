public class Studio {
    private int idStudio;
    private String namaStudio;
    private int kapasitas;
    private double tarifPerJam;
    private boolean statusTersedia;

    public Studio() {
    }

    public Studio(int idStudio, String namaStudio, int kapasitas, double tarifPerJam, boolean statusTersedia) {
        if (kapasitas <= 0) {
            throw new IllegalArgumentException("Kapasitas studio harus lebih dari 0.");
        }
        if (tarifPerJam < 0) {
            throw new IllegalArgumentException("Tarif per jam tidak boleh negatif.");
        }

        this.idStudio = idStudio;
        this.namaStudio = namaStudio;
        this.kapasitas = kapasitas;
        this.tarifPerJam = tarifPerJam;
        this.statusTersedia = statusTersedia;
    }

    public int getIdStudio() {
        return idStudio;
    }

    public void setIdStudio(int idStudio) {
        this.idStudio = idStudio;
    }

    public String getNamaStudio() {
        return namaStudio;
    }

    public void setNamaStudio(String namaStudio) {
        this.namaStudio = namaStudio;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        if (kapasitas <= 0) {
            throw new IllegalArgumentException("Kapasitas studio harus lebih dari 0.");
        }
        this.kapasitas = kapasitas;
    }

    public double getTarifPerJam() {
        return tarifPerJam;
    }

    public void setTarifPerJam(double tarifPerJam) {
        if (tarifPerJam < 0) {
            throw new IllegalArgumentException("Tarif per jam tidak boleh negatif.");
        }
        this.tarifPerJam = tarifPerJam;
    }

    public boolean isStatusTersedia() {
        return statusTersedia;
    }

    public void setStatusTersedia(boolean statusTersedia) {
        this.statusTersedia = statusTersedia;
    }

    public boolean cekKetersediaan() {
        return statusTersedia;
    }

    public void ubahStatus(boolean statusTersedia) {
        this.statusTersedia = statusTersedia;
    }
}