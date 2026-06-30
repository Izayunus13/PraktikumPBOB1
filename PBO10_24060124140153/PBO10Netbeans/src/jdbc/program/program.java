package program;

import jdbc.model.mahasiswa;
import jdbc.service.MySQLMahasiswaService;

public class program {

    public static void main(String[] args) {

        MySQLMahasiswaService service = new MySQLMahasiswaService();

        mahasiswa m1 = new mahasiswa(1, "Budi");
        service.insert(m1);

        service.tampilData();

        mahasiswa m2 = new mahasiswa(1, "Andi");
        service.update(m2);

        service.tampilData();

        service.delete(1);

        service.tampilData();
    }
}