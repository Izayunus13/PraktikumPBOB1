public class Kendaraan {

    // MENYIMPAN NOMOR PLAT KENDARAAN //
    private String noPlat;

    // MENYIMPAN JENIS KENDARAAN (MOBIL / MOTOR) //
    private String jenis;

    // KONSTRUKTOR KOSONG //
    public Kendaraan(){}

    // KONSTRUKTOR UNTUK MENGISI DATA KENDARAAN //
    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    // MENGAMBIL NOMOR PLAT //
    public String getNoPlat(){
        return noPlat;
    }

    // MENGUBAH NOMOR PLAT //
    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    // MENGAMBIL JENIS KENDARAAN //
    public String getJenis(){
        return jenis;
    }

    // MENGUBAH JENIS KENDARAAN //
    public void setJenis(String jenis){
        this.jenis = jenis;
    }
}