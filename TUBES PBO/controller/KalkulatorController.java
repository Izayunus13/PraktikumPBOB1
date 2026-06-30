package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.*;
import view.KalkulatorView;

public class KalkulatorController {

    private KalkulatorView view;

    public KalkulatorController() {

        view = new KalkulatorView();

        // BUTTON TAMBAH
        view.buttonTambahOnClick(
                new ActionListener() {

            @Override
            public void actionPerformed(
                    ActionEvent e) {

                prosesOperasi(
                        new Penjumlahan());
            }
        });

        // BUTTON KURANG
        view.buttonKurangOnClick(
                new ActionListener() {

            @Override
            public void actionPerformed(
                    ActionEvent e) {

                prosesOperasi(
                        new Pengurangan());
            }
        });

        // BUTTON KALI
        view.buttonKaliOnClick(
                new ActionListener() {

            @Override
            public void actionPerformed(
                    ActionEvent e) {

                prosesOperasi(
                        new Perkalian());
            }
        });

        // BUTTON BAGI
        view.buttonBagiOnClick(
                new ActionListener() {

            @Override
            public void actionPerformed(
                    ActionEvent e) {

                prosesOperasi(
                        new Pembagian());
            }
        });

        // BUTTON CLEAR
        view.buttonClearOnClick(
                new ActionListener() {

            @Override
            public void actionPerformed(
                    ActionEvent e) {

                view.clearField();
            }
        });
    }

    // METHOD POLYMORPHISM
    private void prosesOperasi(
            OperasiMatematika operasi) {

        try {

            double angka1 =
                    view.getAngka1();

            double angka2 =
                    view.getAngka2();

            double hasil =
                    operasi.hitung(
                            angka1,
                            angka2);

            view.setFieldHasil(
                    hasil);

            String data =
                    angka1 + " = " +
                    angka2 + " = " +
                    hasil;

            view.tambahRiwayat(data);
        }

        catch(NumberFormatException ex) {

            view.setFieldHasilError(
                    "Input harus angka!");
        }

        catch(ArithmeticException ex) {

            view.setFieldHasilError(
                    ex.getMessage());
        }
    }
}