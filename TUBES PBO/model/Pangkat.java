package model;

public class Pangkat extends Operasi {

    public Pangkat() {

        namaOperasi = "Pangkat";
    }

    @Override
    public double hitung(
            double angka1,
            double angka2) {

        return Math.pow(angka1, angka2);
    }
}