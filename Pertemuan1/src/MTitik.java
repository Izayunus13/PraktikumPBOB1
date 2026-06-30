public class MTitik {

    public static void main(String[] args) {

        Titik T1 = new Titik();   // membuat objek titik (0,0)

        T1.setAbsis(3);           // ubah absis jadi 3
        T1.setOrdinat(4);         // ubah ordinat jadi 4

        T1.printTitik();          // tampilkan titik

        T1.geser(3,4);            // geser titik sejauh (3,4)

        T1.printTitik();          // tampilkan lagi
    }

}