/*
// File : Teman.java //
// Deskripsi : Aplikasi untuk menguji kelas Teman //
// Nama : Iza Yunus Andhika //
// NIM  : 24060124140153 //
*/

import java.util.ArrayList;
import java.util.List;
public class Teman{
    private int nbelm;
    private List<String> Lnama;

    // konstruktor
    public Teman(){
        Lnama = new ArrayList<String>();
        nbelm = 0;
    }

    // mendapatkan jumlah elemen dalam list
    public int getNbelm(){
        return nbelm;
    }

    // mendapatkan nama pada indeks tertentu
    public String getNama(int index){ 
        if(index >= 0 && index < Lnama.size()){
            return Lnama.get(index);
        } else {
            return null; 
        }
    }

    // mengganti nama pada indeks tertentu
    public void setNama(int indeks, String nama) {
        if (indeks >= 0 && indeks < Lnama.size()) {
            Lnama.set(indeks, nama);
        } else {
            System.out.println("Indeks tidak valid.");
        }
    }
 
    // menambahkan nama ke dalam list
    public void addNama(String nama) {
        Lnama.add(nama);
        nbelm = Lnama.size();
    }
 
    // menghapus nama pertama yang cocok dari list
    public void delNama(String nama) {
        boolean berhasil = Lnama.remove(nama);
        if (berhasil) {
            nbelm = Lnama.size();
            System.out.println("Nama \"" + nama + "\" berhasil dihapus.");
        } else {
            System.out.println("Nama \"" + nama + "\" tidak ditemukan.");
        }
    }
 
    // mengecek apakah nama ada dalam list
    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }
 
    // mengganti semua kemunculan nama dengan namabaru
    public void gantiNama(String nama, String namabaru) {
        boolean ada = false;
        for (int i = 0; i < Lnama.size(); i++) {
            if (Lnama.get(i).equals(nama)) {
                Lnama.set(i, namabaru);
                ada = true;
            }
        }
        if (!ada) {
            System.out.println("Nama \"" + nama + "\" tidak ditemukan.");
        }
    }
 
    // menghitung berapa kali nama muncul dalam list
    public int countNama(String nama) {
        int count = 0;
        for (String n : Lnama) {
            if (n.equals(nama)) {
                count++;
            }
        }
        return count;
    }
 
    // menampilkan semua nama dalam Lnama
    public void showTeman() {
        System.out.println("=== Daftar Teman ===");
        if (Lnama.isEmpty()) {
            System.out.println("(Daftar kosong)");
        } else {
            for (int i = 0; i < Lnama.size(); i++) {
                System.out.println("[" + i + "] " + Lnama.get(i));
            }
        }
        System.out.println("Jumlah elemen: " + getNbelm());
    }
}