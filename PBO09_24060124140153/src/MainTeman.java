/*
// File : MainTeman.java //
// Deskripsi : Aplikasi untuk menguji kelas Teman (Koleksi Kelas Dasar) //
// Nama : Iza Yunus Andhika //
// NIM  : 24060124140153 //
*/

public class MainTeman {
    public static void main(String[] args) {
        Teman t = new Teman();

        // addNama
        t.addNama("Budi");
        t.addNama("Sari");
        t.addNama("Doni");
        t.addNama("Sari");
        t.addNama("Eko");
        t.showTeman();

        // getNbelm
        System.out.println("\nJumlah teman: " + t.getNbelm());

        // getNama
        System.out.println("Nama indeks 1: " + t.getNama(1));

        // setNama
        t.setNama(0, "Bagas");
        System.out.println("\nSetelah setNama(0, Bagas):");
        t.showTeman();

        // isMember
        System.out.println("\nisMember(Sari): " + t.isMember("Sari"));
        System.out.println("isMember(Rudi): " + t.isMember("Rudi"));

        // countNama
        System.out.println("\ncountNama(Sari): " + t.countNama("Sari"));

        // gantiNama
        t.gantiNama("Sari", "Maya");
        System.out.println("\nSetelah gantiNama(Sari, Maya):");
        t.showTeman();

        // delNama
        t.delNama("Doni");
        System.out.println("\nSetelah delNama(Doni):");
        t.showTeman();

        // delNama tidak ada
        t.delNama("Xyz");
    }
}