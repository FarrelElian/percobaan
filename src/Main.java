import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nama:");
        String nama = scanner.nextLine();

        System.out.println("Masukkan jenis kelamin (P/L):");
        String genderIn = scanner.nextLine();
        String gender = genderIn.equalsIgnoreCase("P") ? "perempuan" : "laki-laki";

        System.out.println("Masukkan tanggal lahir (YYYY-MM-DD):");
        String tanggalLahirString = scanner.nextLine();
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirString);

        // Menghitung umur
        LocalDate tanggalSekarang = LocalDate.now();
        Period period = Period.between(tanggalLahir, tanggalSekarang);
        int umur = period.getYears();

        System.out.println("\nData diri:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + gender);
        System.out.println("Umur: " + umur + " tahun");
    }
}

