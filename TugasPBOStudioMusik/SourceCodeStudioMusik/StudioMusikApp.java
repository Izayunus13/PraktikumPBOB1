public class StudioMusikApp {
    public static void main(String[] args) {
        try {
            Admin admin = new Admin(1, "Raka", "081234567890");
            Operator operator = new Operator(2, "Dina", "082345678901");
            Pelanggan pelanggan = new Pelanggan(101, "Adit", "081122334455", "adit@mail.com");

            Studio studio = new Studio(201, "Studio A", 6, 50000, true);
            Jadwal jadwal = new Jadwal(301, "2026-04-01", "19:00", "21:00");

            Reservasi reservasi = new Reservasi(401, "2026-03-30", 2, "Menunggu", pelanggan, studio, jadwal);

            LayananTambahan layanan1 = new LayananTambahan(501, "Sewa Drum Tambahan", 30000);
            LayananTambahan layanan2 = new LayananTambahan(502, "Rekaman Sederhana", 50000);

            reservasi.tambahLayananTambahan(layanan1);
            reservasi.tambahLayananTambahan(layanan2);

            admin.login();
            admin.tampilkanPeran();
            admin.kelolaReservasi();

            reservasi.konfirmasiReservasi("Datang 15 menit sebelum sesi dimulai.");
            reservasi.cetakDetail();

            Pembayaran pembayaran = new Pembayaran(601, "Transfer", 200000, "Belum Lunas");
            pembayaran.prosesPembayaran(reservasi.hitungTotal());
            pembayaran.cetakDetail();

            reservasi.setPembayaran(pembayaran);

            operator.login();
            operator.tampilkanPeran();
            operator.siapkanStudio();
            operator.cekPeralatan();

            SesiStudio sesi = new SesiStudio(701, reservasi, operator, "Semua alat siap dipakai.");
            sesi.mulaiSesi();
            sesi.akhiriSesi();

            admin.logout();
            operator.logout();

        } catch (JadwalBentrokException e) {
            System.out.println("Terjadi error reservasi: " + e.getMessage());
        } catch (PembayaranTidakValidException e) {
            System.out.println("Terjadi error pembayaran: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Terjadi error umum: " + e.getMessage());
        }
    }
}