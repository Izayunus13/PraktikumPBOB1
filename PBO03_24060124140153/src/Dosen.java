public class Dosen {

// MENYIMPAN NIP DOSEN,NAMA DOSEN,PROGRAM STUDI DOSEN //
private String nip;
private String nama;
private String prodi;

// KONSTRUKTOR KOSONG UNTUK MEMBUAT OBJEK DOSEN //
public Dosen(){}

    // KONSTRUKTOR UNTUK MENGISI DATA DOSEN //
    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    // MENGAMBIL NIP DOSEN //
    public String getNip(){
        return nip;
    }

    // MENGUBAH NIP DOSEN //
    public void setNip(String nip){
        this.nip = nip;
    }

    // MENGAMBIL NAMA DOSEN //
    public String getNama(){
        return nama;
    }

    // MENGUBAH NAMA DOSEN //
    public void setNama(String nama){
        this.nama = nama;
    }

    // MENGAMBIL PROGRAM STUDI DOSEN //
    public String getProdi(){
        return prodi;
    }

    // MENGUBAH PROGRAM STUDI DOSEN //
    public void setProdi(String prodi){
        this.prodi = prodi;
    }
}