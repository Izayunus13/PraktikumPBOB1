package model;

public class Penjumlahan
        extends Operasi {

    public Penjumlahan() {

        namaOperasi = "Penjumlahan";
    }

    @Override
    public double hitung(
            double angka1,
            double angka2) {

        return angka1 + angka2;
    }
}