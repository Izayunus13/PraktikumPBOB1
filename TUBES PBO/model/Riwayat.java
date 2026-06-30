package model;

import java.util.ArrayList;

public class Riwayat {

    private ArrayList<String> daftarRiwayat;

    public Riwayat() {

        daftarRiwayat = new ArrayList<>();
    }

    public void tambahRiwayat(
            String data) {

        daftarRiwayat.add(data);
    }

    public ArrayList<String>
        getDaftarRiwayat() {

        return daftarRiwayat;
    }
}