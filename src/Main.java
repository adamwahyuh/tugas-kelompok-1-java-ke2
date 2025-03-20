import java.util.Scanner;

public class Main {
    public  static void main(String[] args){

    }
}

class AngkaKeHuruf{
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai angka: ");
        if (scanner.hasNextDouble()) { // Mengecek apakah input adalah angka (bisa desimal atau bulat)
            double nilai = scanner.nextDouble();
            scanner.close();

            if (nilai >= 85 && nilai <= 100) {
                System.out.println("Nilai huruf: A");
            } else if (nilai >= 70 && nilai <= 84) {
                System.out.println("Nilai huruf: B");
            } else if (nilai >= 60 && nilai < 70) {
                System.out.println("Nilai huruf: C");
            } else if (nilai >= 50 && nilai < 60) {
                System.out.println("Nilai huruf: D");
            } else if (nilai < 50 && nilai >= 0) {
                System.out.println("Nilai huruf: E");
            } else {
                System.out.println("Nilai di luar batas! Masukkan nilai antara 0 - 100.");
            }
        } else {
            System.out.println("Input bukan angka! Silakan masukkan angka yang valid.");
        }
        scanner.close();
    }
}
class PositifNegatifNol{
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        System.out.print("Masukkan angka: ");
        if (scanner.hasNextDouble()) { // Periksa apakah input adalah angka
            scanner.close(); // Tutup scanner setelah digunakan

            if (number > 0) {
                System.out.println("Bilangan Positif");
            } else if (number < 0) {
                System.out.println("Bilangan Negatif");
            } else {
                System.out.println("Bilangan Nol");
            }
        } else {
            System.out.println("Input bukan angka!");
            scanner.close(); // Tutup scanner sebelum keluar
        }
    }
}
class GenapAtauGanjil{
    public  static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        if (angka % 2 == 0) {
            System.out.println(angka + " adalah bilangan genap.");
        } else {
            System.out.println(angka + " adalah bilangan ganjil.");
        }
    }
    }
}
class KonversiAngkaKeHuruf{
    public static void main(String[] args){

    }
}