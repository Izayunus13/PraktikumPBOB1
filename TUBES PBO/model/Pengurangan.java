package model;

public class Pengurangan extends Operasi {

    public Pengurangan() {

        namaOperasi = "Pengurangan";
    }

    @Override
    public double hitung(
            double angka1,
            double angka2) {

        return angka1 - angka2;
    }
}