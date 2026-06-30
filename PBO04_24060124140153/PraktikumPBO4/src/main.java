public class main {
    public static void main(String[] args) {
        //Membuat objek Persegi
        Persegi persegi1 = new Persegi(5, "Merah", "Solid");
        Persegi persegi2 = new Persegi(7, "Biru", "Dashed");

        //Membuat objek Lingkaran
        Lingkaran lingkaran1 = new Lingkaran(3, "Hijau", "Dotted");
        Lingkaran lingkaran2 = new Lingkaran(4, "Kuning", "Solid");

        //Menampilkan informasi Persegi
        System.out.println("Informasi Persegi 1:");
        persegi1.printInfo();
        System.out.println("Luas: " + persegi1.getLuas());
        System.out.println("Keliling: " + persegi1.getKeliling());
        System.out.println("Diagonal: " + persegi1.getDiagonal());

        System.out.println("\nInformasi Persegi 2:");
        persegi2.printInfo();
        System.out.println("Luas: " + persegi2.getLuas());
        System.out.println("Keliling: " + persegi2.getKeliling());
        System.out.println("Diagonal: " + persegi2.getDiagonal());

        //Menampilkan informasi Lingkaran
        System.out.println("\nInformasi Lingkaran 1:");
        lingkaran1.printInfo();
        System.out.println("Luas: " + lingkaran1.getLuas());
        System.out.println("Keliling: " + lingkaran1.getKeliling());

        System.out.println("\nInformasi Lingkaran 2:");
        lingkaran2.printInfo();
        System.out.println("Luas: " + lingkaran2.getLuas());
        System.out.println("Keliling: " + lingkaran2.getKeliling());

        //Menampilkan total objek yang dibuat
        System.out.println("\nTotal BangunDatar yang dibuat:");
        BangunDatar bangunDatar = new BangunDatar();
        bangunDatar.printCounter();

        System.out.println("\nTotal Persegi yang dibuat:");
        persegi1.printCounter();

        System.out.println("\nTotal Lingkaran yang dibuat:");
        lingkaran1.printCounter();
    }
    
}