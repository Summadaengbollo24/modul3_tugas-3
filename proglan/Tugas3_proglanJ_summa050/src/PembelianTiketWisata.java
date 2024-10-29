import java.util.Scanner;

public class PembelianTiketWisata {

    // Fungsi untuk menghitung harga tiket
    public static double hitungHargaTiket(String jenisTiket, String kategori, String hari) {
        // Harga dasar tiket
        int hargaAwal = 0;

        // Tentukan harga sesuai dengan jenis tiket dan kategori
        if (jenisTiket.equals("reguler")) {
            if (kategori.equals("dewasa")) {
                hargaAwal = 75000;
            } else if (kategori.equals("anak-anak")) {
                hargaAwal = 60000;
            }
        } else if (jenisTiket.equals("terusan")) {
            if (kategori.equals("dewasa")) {
                hargaAwal = 100000;
            } else if (kategori.equals("anak-anak")) {
                hargaAwal = 85000;
            }
        }

        // Jika hari Sabtu atau Minggu, tambahkan 20%
        if (hari.equalsIgnoreCase("Sabtu") || hari.equalsIgnoreCase("Minggu")) {
            hargaAwal *= 1.2;
        }

        return hargaAwal;
    }

    public static void main(String[] args) {
        // Scanner untuk input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan hari (contoh: Senin, Selasa, dst.): ");
        String hari = input.nextLine();

        System.out.print("Masukkan tanggal (dd-mm-yyyy): ");
        String tanggal = input.nextLine();

        System.out.print("Masukkan jenis tiket (reguler/terusan): ");
        String jenisTiket = input.nextLine().toLowerCase();

        System.out.print("Masukkan kategori (dewasa/anak-anak): ");
        String kategori = input.nextLine().toLowerCase();

        // Validasi apakah ada data yang kosong
        if (nama.isEmpty() || hari.isEmpty() || tanggal.isEmpty()) {
            System.out.println("Data harus diisi");
            input.close();
            return;
        }

        // Validasi jenis tiket dan kategori
        if (!jenisTiket.equals("reguler") && !jenisTiket.equals("terusan")) {
            System.out.println("Jenis tiket tidak valid");
            input.close();
            return;
        }

        if (!kategori.equals("dewasa") && !kategori.equals("anak-anak")) {
            System.out.println("Kategori tidak valid");
            input.close();
            return;
        }

        // Hitung harga tiket
        double harga = hitungHargaTiket(jenisTiket, kategori, hari);

        // Tampilkan hasil
        System.out.printf("Harga tiket: %,d IDR%n", (int) harga);

        // Tutup input
        input.close();
    }
}
