package model;

public class Akar extends Operasi {

    public Akar() {

        namaOperasi = "Akar";
    }

    @Override
    public double hitung(
            double angka1,
            double angka2) {

        return Math.sqrt(angka1);
    }
}