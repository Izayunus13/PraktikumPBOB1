package jdbc.program;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import jdbc.model.mahasiswa;
import jdbc.service.MySQLMahasiswaService;

public class GUIUtama extends JFrame {

    private final MySQLMahasiswaService service = new MySQLMahasiswaService();

    private final JTextField txtId = new JTextField();
    private final JTextField txtNama = new JTextField();
    private final JTextArea areaData = new JTextArea();

    public GUIUtama() {
        setTitle("Kelola Data Mahasiswa");
        setSize(500, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buatTampilan();
        tampilkanData();
    }

    private void buatTampilan() {
        setLayout(new BorderLayout(10, 10));

        JPanel panelInput = new JPanel(new GridLayout(0, 2, 8, 8));

        panelInput.add(new JLabel("ID:"));
        panelInput.add(txtId);

        panelInput.add(new JLabel("Nama:"));
        panelInput.add(txtNama);

        JButton btnTambah = new JButton("Tambahkan");
        btnTambah.addActionListener(e -> tambahData());
        panelInput.add(btnTambah);

        JButton btnEdit = new JButton("Edit");
        btnEdit.addActionListener(e -> editData());
        panelInput.add(btnEdit);

        JButton btnHapus = new JButton("Hapus");
        btnHapus.addActionListener(e -> hapusData());
        panelInput.add(btnHapus);

        JButton btnAmbilData = new JButton("Ambil Semua Data");
        btnAmbilData.addActionListener(e -> tampilkanData());
        panelInput.add(btnAmbilData);

        add(panelInput, BorderLayout.NORTH);

        areaData.setEditable(false);
        add(new JScrollPane(areaData), BorderLayout.CENTER);
    }

    private void tampilkanData() {
        areaData.setText("");

        List<mahasiswa> daftarMahasiswa = service.getAll();

        if (daftarMahasiswa.isEmpty()) {
            areaData.setText("Belum ada data mahasiswa.");
            return;
        }

        for (mahasiswa mhs : daftarMahasiswa) {
            areaData.append(
                    "ID: " + mhs.getId()
                    + " | Nama: " + mhs.getNama()
                    + "\n"
            );
        }
    }

    private void tambahData() {
        try {
            int id = Integer.parseInt(txtId.getText().trim());
            String nama = txtNama.getText().trim();

            if (nama.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Nama belum diisi.");
                return;
            }

            service.insert(new mahasiswa(id, nama));

            JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan.");
            kosongkanInput();
            tampilkanData();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID harus berupa angka.");
        }
    }

    private void editData() {
        try {
            int id = Integer.parseInt(txtId.getText().trim());
            String nama = txtNama.getText().trim();

            if (nama.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Nama baru belum diisi.");
                return;
            }

            service.update(new mahasiswa(id, nama));

            JOptionPane.showMessageDialog(this, "Data berhasil diubah.");
            kosongkanInput();
            tampilkanData();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID harus berupa angka.");
        }
    }

    private void hapusData() {
        try {
            int id = Integer.parseInt(txtId.getText().trim());

            int pilih = JOptionPane.showConfirmDialog(
                    this,
                    "Yakin mau hapus data ID " + id + "?",
                    "Konfirmasi Hapus",
                    JOptionPane.YES_NO_OPTION
            );

            if (pilih == JOptionPane.YES_OPTION) {
                service.delete(id);

                JOptionPane.showMessageDialog(this, "Data berhasil dihapus.");
                kosongkanInput();
                tampilkanData();
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Isi ID terlebih dahulu.");
        }
    }

    private void kosongkanInput() {
        txtId.setText("");
        txtNama.setText("");
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new GUIUtama().setVisible(true);
        });
    }
}