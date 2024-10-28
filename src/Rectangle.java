import java.util.Scanner;

/**
 * Kelas Rectangle menghitung luas dan keliling dari persegi panjang
 * berdasarkan input dari pengguna.
 */
public class Rectangle {

    /**
     * Metode utama untuk menghitung luas dan keliling persegi panjang.
     * @param args argumen dari command line (tidak dipakai dalam aplikasi ini)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mengambil input panjang dari pengguna
        System.out.print("Masukkan panjang: ");
        double length = scanner.nextDouble();

        // Mengambil input lebar dari pengguna
        System.out.print("Masukkan lebar: ");
        double width = scanner.nextDouble();

        // Menghitung luas dan kliling
        double area = length * width;
        double perimeter = 2 * (length + width);

        // Menampilkan hasil
        System.out.println("Luas: " + area);
        System.out.println("Keliling: " + perimeter);

        // Menutup scanner
        scanner.close();
    }
}
