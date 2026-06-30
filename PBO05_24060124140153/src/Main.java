public class Main {
    public static void main(String[] args) {

        BangunDatar p1 = new Persegi(10);
        Persegi p2 = new Persegi(5);

        BangunDatar l1 = new Lingkaran(7);
        Lingkaran l2 = new Lingkaran(14);

        System.out.println("Luas p1 = " + p1.getLuas());
        System.out.println("Keliling l1 = " + l1.getKeliling());

        System.out.println("Apakah luas sama? " + p1.isEqualLuas(l1));

        // TEST INTERFACE
        p2.zoomIn();
        System.out.println("Persegi setelah zoomIn = " + p2.getLuas());

        p2.zoomOut();
        System.out.println("Persegi setelah zoomOut = " + p2.getLuas());

        l2.zoom(200);
        System.out.println("Lingkaran setelah zoom 200% = " + l2.getLuas());
    }
}