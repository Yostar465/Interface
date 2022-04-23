import Model.Perhitungan;

public class JalananPerhitungan {

    public static void main(String[] args) {
        Perhitungan s = new Perhitungan(5, 8, 0);

        s.PrintJudul();

        int HasilTambah = s.hitungantambah(5, 8);
        System.out.println(HasilTambah);

        int HasilKali = s.hitungankali(5, 8);
        System.out.println(HasilKali);
    }
}

// Tugas kirim ke repo github
// email: aherijanto@mimoapps.xyz
// subjek: TM_NIM_NAMA_KELAS