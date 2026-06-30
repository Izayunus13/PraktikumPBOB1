// file : Main_OperatorGenerik.java //
// deskripsi : Program utama untuk aplikasi prosedur Tukar dan fungsi Bobot2 //
// Nama : Iza Yunus Andhika //
// NIM  : 24060124140153 // 

public class Main_OperatorGenerik {
    public static void main(String[] args) {

        System.out.println("=== Aplikasi Prosedur Generik Tukar ===\n");

        // --- Tukar sesama Integer ---
        Integer[] a = {3};
        Integer[] b = {6};

        System.out.println("Sebelum Tukar : a = " + a[0] + ", b = " + b[0]);
        OperatorGenerik.Tukar(a, b);
        System.out.println("Sesudah Tukar : a = " + a[0] + ", b = " + b[0]);

        System.out.println();

        // --- Tukar sesama String ---
        String[] s1 = {"Halo"};
        String[] s2 = {"Dunia"};

        System.out.println("Sebelum Tukar : s1 = " + s1[0] + ", s2 = " + s2[0]);
        OperatorGenerik.Tukar(s1, s2);
        System.out.println("Sesudah Tukar : s1 = " + s1[0] + ", s2 = " + s2[0]);

        System.out.println();

        // --- Tukar sesama keluarga Anabul ---
        Anabul[] anabul1 = {new Kucing("Mochi", 3.5)};
        Anabul[] anabul2 = {new Anggora("Bella", 4.2)};

        System.out.println("Sebelum Tukar : anabul1 = " + anabul1[0].getNama()
                + ", anabul2 = " + anabul2[0].getNama());

        OperatorGenerik.Tukar(anabul1, anabul2);

        System.out.println("Sesudah Tukar : anabul1 = " + anabul1[0].getNama()
                + ", anabul2 = " + anabul2[0].getNama());

        System.out.println();

        // --- Fungsi Bobot2 ---
        System.out.println("=== Aplikasi Fungsi Generik Bobot2 ===\n");

        Kucing k1 = new Kucing("Mochi", 3.5);
        Kucing k2 = new Kucing("Luna", 4.0);

        double totalBobot = OperatorGenerik.Bobot2(k1, k2);

        System.out.println("Bobot " + k1.getNama() + " : " + k1.getBobot() + " kg");
        System.out.println("Bobot " + k2.getNama() + " : " + k2.getBobot() + " kg");
        System.out.println("Total Bobot2 Kucing : " + totalBobot + " kg");

        System.out.println();

        // Bobot2 dengan subclass Anggora dan Kembangtelon
        Anggora ag1 = new Anggora("Bella", 4.2);
        Kembangtelon kt1 = new Kembangtelon("Oreo", 3.8);

        double totalCampuran = OperatorGenerik.Bobot2(ag1, kt1);

        System.out.println("Bobot " + ag1.getNama() + " : " + ag1.getBobot() + " kg");
        System.out.println("Bobot " + kt1.getNama() + " : " + kt1.getBobot() + " kg");
        System.out.println("Total Bobot2 Anggora + Kembangtelon : " + totalCampuran + " kg");
    }
}