/*
// File : Piaraan.java //
// Deskripsi : Kelas koleksi antrean (LinkedList) untuk objek Anabul //
// Nama : Iza Yunus Andhika //
// NIM  : 24060124140153 //
*/

import java.util.LinkedList;

public class Piaraan {
    private int nbelm;
    private LinkedList<Anabul> Lanabul;

    // konstruktor
    public Piaraan() {
        Lanabul = new LinkedList<Anabul>();
        nbelm = 0;
    }

    // mendapatkan jumlah elemen dalam antrean
    public int getNbelm() {
        return nbelm;
    }

    // menambah elemen Anabul di akhir antrean
    public void enqueueAnabul(Anabul anabul) {
        Lanabul.addLast(anabul);
        nbelm = Lanabul.size();
    }

    // mengecek apakah anabul ada dalam antrean
    public boolean isMember(Anabul anabul) {
        return Lanabul.contains(anabul);
    }

    // mengambil data anabul pertama tanpa mengeluarkan dari antrean
    public Anabul getAnabul() {
        if (!Lanabul.isEmpty()) {
            return Lanabul.getFirst();
        }
        return null;
    }

    // mengambil dan mengeluarkan anabul pertama dari antrean
    public Anabul dequeueAnabul() {
        if (!Lanabul.isEmpty()) {
            Anabul a = Lanabul.removeFirst();
            nbelm = Lanabul.size();
            return a;
        }
        return null;
    }

    // menampilkan nama panggilan semua anabul dalam antrean
    public void showAnabul() {
        System.out.println("=== Daftar Anabul ===");
        if (Lanabul.isEmpty()) {
            System.out.println("(Antrean kosong)");
        } else {
            for (int i = 0; i < Lanabul.size(); i++) {
                System.out.println("[" + i + "] " + Lanabul.get(i).getPanggilan());
            }
        }
        System.out.println("Jumlah elemen: " + getNbelm());
    }

    // menghitung banyak objek dari keluarga Kucing dalam antrean
    public int countKucing() {
        int count = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    // menghitung total bobot keluarga Kucing dalam antrean
    public double bobotKucing() {
        double total = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                total += ((Kucing) a).getBobot();
            }
        }
        return total;
    }

    // menampilkan nama panggilan dan jenis kelas setiap anabul dalam antrean
    public void showJenisAnabul() {
        System.out.println("=== Daftar Jenis Anabul ===");
        if (Lanabul.isEmpty()) {
            System.out.println("(Antrean kosong)");
        } else {
            for (int i = 0; i < Lanabul.size(); i++) {
                Anabul a = Lanabul.get(i);
                System.out.println("[" + i + "] " + a.getPanggilan()
                        + " - " + a.getClass().getName());
            }
        }
        System.out.println("Jumlah elemen: " + getNbelm());
    }
}