public class MMahasiswa {

    public static void main(String[] args){

        MataKuliah PBO = new MataKuliah("PBO","Pemrograman Berorientasi Objek",3);
        MataKuliah MBD = new MataKuliah("MBD","Manajemen Basis Data",3);

        Mahasiswa M1 = new Mahasiswa("24060124140153","Kresna Aji","Kedokteran Gigi");

        Dosen D1 = new Dosen("2129212","Nazmi Riyana","Kedokteran Gigi");

        Kendaraan K1 = new Kendaraan("B 2003 DEK","Mobil");

        M1.setDosenWali(D1);
        M1.setKendaraan(K1);

        M1.addMatKul(PBO);
        M1.addMatKul(MBD);

        M1.printDetailMhs();

        System.out.println("\nJumlah Mata Kuliah : " + M1.getJumlahMatKul());
        System.out.println("Jumlah SKS : " + M1.getJumlahSKS());
    }
}