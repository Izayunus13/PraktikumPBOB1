package model;

public class Perkalian extends Operasi {

    public Perkalian() {

        namaOperasi = "Perkalian";
    }

    @Override
    public double hitung(
            double angka1,
            double angka2) {

        return angka1 * angka2;
    }
}