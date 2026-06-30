/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Iza Yunus Andhika
 * Tanggal      : 1 Maret 2026
 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); //Membuat objek titik T1 (0,0)
        T1.setAbsis(3); //mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4); //mengubah ordinat T1 dengan nilai 4
        T1.printTitik(); //mencetak koordinat T1 ke layar
        T1.geser(3,4); //menggeser T1 sejauh (3,4)
        T1.printTitik(); //menampilkan koordinat T1 setelah digeser

        Titik T2 = T1; //Membuat objek titik T2 yang merujuk ke objek yang sama dengan T1
        T2.setAbsis(5); //mengubah absis T2 dengan nilai 5
        T2.setOrdinat(6); //mengubah ordinat T2 dengan nilai 6
        T2.printTitik(); //mencetak koordinat T2 ke layar
        T1.printTitik(); //mencetak koordinat T1 ke layar (koordinat T1 juga berubah karena T1 dan T2 merujuk ke objek yang sama)
        T1.printcountertitik(); //mencetak jumlah objek titik yang telah dibuat (counterTitik) ke layar
        T2.printcountertitik(); //mencetak jumlah objek titik yang telah dibuat (counterTitik) ke layar (nilai counterTitik sama dengan yang dicetak oleh T1 karena counterTitik adalah variabel statik yang dimiliki oleh kelas Titik, bukan oleh objek individu)
        
    }

}