

public class Mahasiswa {

    // MENYIMPAN NIM MAHASISWA //
    private String nim;

    // MENYIMPAN NAMA MAHASISWA //
    private String nama;

    //  MENYIMPAN PROGRAM STUDI //
    private String prodi;

    // MENYIMPAN DAFTAR MATA KULIAH MAKSIMAL 50 //
    private MataKuliah[] listMatKul = new MataKuliah[50];

    // MENYIMPAN JUMLAH MATA KULIAH YANG SUDAH DIAMBIL // 
    private int jumlahMatKul = 0;

    // MENYIMPAN DOSEN WALI MAHASISWA //
    private Dosen dosenWali;

    // MENYIMPAN KENDARAAN MAHASISWA //
    private Kendaraan kendaraan;

    // KONSTRUKTOR KOSONG //
    public Mahasiswa(){}

    // KONSTRUKTOR UNTUK MENGISI DATA MAHASISWA //
    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    // MENETAPKAN DOSEN WALI MAHASISWA //
    public void setDosenWali(Dosen dosen){
        this.dosenWali = dosen;
    }

    // MENETAPKAN KENDARAAN MAHASISWA //
    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    // MENAMBAHKAN MATA KULIAH KE DAFTAR MATA KULIAH //
    public void addMatKul(MataKuliah mk){
        if(jumlahMatKul < 50){
            listMatKul[jumlahMatKul] = mk;
            jumlahMatKul++;
        }
    }

    // MENGHITUNG JUMLAH MATA KULIAH YANG DIAMBIL //
    public int getJumlahMatKul(){
        return jumlahMatKul;
    }

    // MENGHITUNG TOTAL SKS YANG DIAMBIL MAHASISWA //
    public int getJumlahSKS(){
        int total = 0;
        for(int i = 0; i < jumlahMatKul; i++){
            total += listMatKul[i].getSks();
        }
        return total;
    }

    // MENAMPILKAN DATA DASAR MAHASISWA //
    public void printMhs(){
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi : " + prodi);
    }

    // MENAMPILKAN DETAIL MAHASISWA BESERTA RELASINYA //
    public void printDetailMhs(){

        printMhs();

        System.out.println("\nDosen Wali : " + dosenWali.getNama());

        System.out.println("\nDaftar Mata Kuliah:");

        for(int i = 0; i < jumlahMatKul; i++){
            System.out.println(listMatKul[i].getNama());
        }

        if(kendaraan != null){
            System.out.println("\nKendaraan : " + kendaraan.getJenis());
            System.out.println("No Plat : " + kendaraan.getNoPlat());
        }
    }
}