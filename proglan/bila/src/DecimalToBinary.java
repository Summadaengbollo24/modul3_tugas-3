import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan bilangan desimal: ");
        int decimal = scanner.nextInt();

        // Mengonversi desimal ke biner
        String binary = Integer.toBinaryString(decimal);

        // Menampilkan hasil
        System.out.println("Bilangan biner: " + binary);

        scanner.close();
    }
}
