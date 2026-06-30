package view;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class KalkulatorView extends JFrame {

    // FIELD INPUT
    private JTextField fieldAngka1;
    private JTextField fieldAngka2;
    private JTextField fieldHasil;

    // BUTTON
    private JButton btnTambah;
    private JButton btnKurang;
    private JButton btnKali;
    private JButton btnBagi;
    private JButton btnClear;

    // RIWAYAT
    private JTextArea areaRiwayat;

    public KalkulatorView() {

        // TITLE
        setTitle("Kalkulator PBO");

        // SIZE
        setSize(600, 500);

        // CLOSE PROGRAM
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // TENGAH LAYAR
        setLocationRelativeTo(null);

        // LAYOUT UTAMA
        setLayout(new BorderLayout(10, 10));

        // =========================
        // PANEL INPUT
        // =========================
        JPanel panelInput = new JPanel();

        panelInput.setLayout(
                new GridLayout(3, 2, 10, 10));

        panelInput.setBorder(
                BorderFactory.createTitledBorder(
                        "Input Data"));

        // ANGKA 1
        JLabel labelAngka1 =
                new JLabel("Angka 1");

        fieldAngka1 =
                new JTextField();

        panelInput.add(labelAngka1);
        panelInput.add(fieldAngka1);

        // ANGKA 2
        JLabel labelAngka2 =
                new JLabel("Angka 2");

        fieldAngka2 =
                new JTextField();

        panelInput.add(labelAngka2);
        panelInput.add(fieldAngka2);

        // HASIL
        JLabel labelHasil =
                new JLabel("Hasil");

        fieldHasil =
                new JTextField();

        fieldHasil.setEditable(false);

        panelInput.add(labelHasil);
        panelInput.add(fieldHasil);

        // =========================
        // PANEL BUTTON
        // =========================
        JPanel panelButton = new JPanel();

        panelButton.setLayout(
                new GridLayout(1, 5, 10, 10));

        panelButton.setBorder(
                BorderFactory.createTitledBorder(
                        "Operasi"));

        btnTambah =
                new JButton("+");

        btnKurang =
                new JButton("-");

        btnKali =
                new JButton("x");

        btnBagi =
                new JButton("/");

        btnClear =
                new JButton("CLEAR");

        panelButton.add(btnTambah);
        panelButton.add(btnKurang);
        panelButton.add(btnKali);
        panelButton.add(btnBagi);
        panelButton.add(btnClear);

        // =========================
        // PANEL RIWAYAT
        // =========================
        JPanel panelRiwayat = new JPanel();

        panelRiwayat.setLayout(
                new BorderLayout());

        panelRiwayat.setBorder(
                BorderFactory.createTitledBorder(
                        "Riwayat Perhitungan"));

        areaRiwayat =
                new JTextArea();

        areaRiwayat.setEditable(false);

        JScrollPane scrollPane =
                new JScrollPane(areaRiwayat);

        panelRiwayat.add(scrollPane);

        // =========================
        // TAMBAH KE FRAME
        // =========================
        add(panelInput, BorderLayout.NORTH);

        add(panelButton, BorderLayout.CENTER);

        add(panelRiwayat, BorderLayout.SOUTH);

        // TAMPILKAN
        setVisible(true);
    }

    // =========================
    // GET INPUT
    // =========================

    public double getAngka1() {

        return Double.parseDouble(
                fieldAngka1.getText());
    }

    public double getAngka2() {

        return Double.parseDouble(
                fieldAngka2.getText());
    }

    // =========================
    // SET HASIL
    // =========================

    public void setFieldHasil(
            double hasil) {

        fieldHasil.setText(
                String.valueOf(hasil));
    }

    public void setFieldHasilError(
            String pesan) {

        fieldHasil.setText(pesan);
    }

    // =========================
    // RIWAYAT
    // =========================

    public void tambahRiwayat(
            String data) {

        areaRiwayat.append(
                data + "\n");
    }

    // =========================
    // CLEAR
    // =========================

    public void clearField() {

        fieldAngka1.setText("");
        fieldAngka2.setText("");
        fieldHasil.setText("");
    }

    // =========================
    // ACTION LISTENER
    // =========================

    public void buttonTambahOnClick(
            ActionListener actionListener) {

        btnTambah.addActionListener(
                actionListener);
    }

    public void buttonKurangOnClick(
            ActionListener actionListener) {

        btnKurang.addActionListener(
                actionListener);
    }

    public void buttonKaliOnClick(
            ActionListener actionListener) {

        btnKali.addActionListener(
                actionListener);
    }

    public void buttonBagiOnClick(
            ActionListener actionListener) {

        btnBagi.addActionListener(
                actionListener);
    }

    public void buttonClearOnClick(
            ActionListener actionListener) {

        btnClear.addActionListener(
                actionListener);
    }
}