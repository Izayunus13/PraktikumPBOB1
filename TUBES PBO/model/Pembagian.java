package model;

public class Pembagian
        extends Operasi {

    public Pembagian() {

        namaOperasi = "Pembagian";
    }

    @Override
    public double hitung(
            double angka1,
            double angka2) {

        if (angka2 == 0) {

            throw new ArithmeticException(
                    "Tidak bisa dibagi nol!");
        }

        return angka1 / angka2;
    }
}