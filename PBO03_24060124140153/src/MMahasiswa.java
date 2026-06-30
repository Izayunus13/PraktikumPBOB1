public class MMahasiswa {

    public static void main(String[] args){

        // MEMBUAT OBJEK DOSEN
        Dosen d1 = new Dosen("19800101","Prajanto","Informatika");
        Dosen d2 = new Dosen("19800202","Khadijah","Informatika");

        // MEMBUAT OBJEK MATA KULIAH
        MataKuliah mk1 = new MataKuliah("PBO","Pemrograman Berorientasi Objek",3);
        MataKuliah mk2 = new MataKuliah("MBD","Manajemen Basis Data",3);
        MataKuliah mk3 = new MataKuliah("ASA","Analisis dan Strategi Algoritma",3);
        MataKuliah mk4 = new MataKuliah("GTI","Grafik dan Teknik Interaktif",3);

        // MEMBUAT OBJEK KENDARAAN
        Kendaraan k1 = new Kendaraan("H1234AB","Motor");
        Kendaraan k2 = new Kendaraan("H5678CD","Mobil");

        // MEMBUAT OBJEK MAHASISWA
        Mahasiswa m1 = new Mahasiswa("24060124140153","Iza Yunus Andhika","Informatika");
        Mahasiswa m2 = new Mahasiswa("24060124120121","Fadli","Informatika");

        // RELASI MAHASISWA DENGAN DOSEN WALI
        m1.setDosenWali(d1);
        m2.setDosenWali(d2);

        // RELASI MAHASISWA DENGAN KENDARAAN
        m1.setKendaraan(k1);
        m2.setKendaraan(k2);

        // MENAMBAHKAN MATA KULIAH KE MAHASISWA
        m1.addMatKul(mk1);
        m1.addMatKul(mk2);

        m2.addMatKul(mk1);
        m2.addMatKul(mk3);

        // MENAMPILKAN DATA MAHASISWA 1
        System.out.println("===== DATA MAHASISWA 1 =====");
        m1.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah : " + m1.getJumlahMatKul());
        System.out.println("Jumlah SKS : " + m1.getJumlahSKS());

        // MENAMPILKAN DATA MAHASISWA 2
        System.out.println("\n===== DATA MAHASISWA 2 =====");
        m2.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah : " + m2.getJumlahMatKul());
        System.out.println("Jumlah SKS : " + m2.getJumlahSKS());

        // MENAMPILKAN DATA MAHASISWA 3
        System.out.println("\n===== DATA MAHASISWA 3 =====");
        m2.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah : " + m3.getJumlahMatKul());
        System.out.println("Jumlah SKS : " + m3.getJumlahSKS());
    }
}