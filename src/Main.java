import java.util.Scanner;
class Tidur{
    static public void tidur() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Terjadi kesalahan saat menunggu.");
        }
    }
}

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String[][] anggota = {
            {"Adam Wahyu H", "202359201009"},
            {"Plorentina Fidelis P", "202359201005"},
            {"Nathan Alvino F", "20235920100"}
    };

    public  static void main(String[] args){
        while (true){
            System.out.println(Ui.garisDua);
            System.out.println("Selamat Datang di Tugas Kelompok 1 ke 2");
            System.out.println("============   Menu  ===============");
            System.out.println("1. Konversi Angka ke Huruf");
            System.out.println("2. Positif Negatif Nol ");
            System.out.println("3. Genap atau Ganjil ");
            System.out.println("3. Konversi Angka ke Huruf (Switch Method)");
            System.out.println(Ui.garis);
            System.out.println("Ketik \"daftar\" untuk melihat daftar anggota.");
            System.out.println("Ketik \"info\" untuk link Repo Github.");
            System.out.println("Ketik \"exit\" untuk keluar.");
            System.out.print(": ");
            String optIn = scanner.nextLine();

            if (optIn.equalsIgnoreCase("exit")) {
                System.out.println("Bye!");
                scanner.close();
                break;
            }
            else if (optIn.equalsIgnoreCase("daftar")) {
                int no = 1;
                System.out.println(Ui.garis);
                System.out.print("========== Nama Nama Anggota ============\n");
                for (int y = 0; y < anggota.length; y -= -1) {
                    System.out.print(no +". ");
                    for (int z = 0; z < anggota[y].length; z -= -1) {
                        System.out.print( anggota[y][z] + " ");
                    }
                    System.out.println();
                    no++;
                }
                Tidur.tidur();
                continue;
            } else if (optIn.equalsIgnoreCase("info")) {
                System.out.println(Ui.garis);
                System.out.print("Tugas sudah saya Upload di: \nhttps://github.com/adamwahyuh/tugas-kelompok-1-java-ke2\n");
                System.out.println(Ui.garis);
                System.out.println("Kembali ke Main Menu...");
                Tidur.tidur();
                continue;
            }

            if (optIn.equals("1") || optIn.equalsIgnoreCase("a"))  {
                AngkaKeHuruf.main(null);
            }
            else if (optIn.equals("2") || optIn.equalsIgnoreCase("b")){
                PositifNegatifNol.main(null);
            }else if (optIn.equals("3") || optIn.equalsIgnoreCase("c")){
                GenapAtauGanjil.main(null);
            }else if (optIn.equals("4") || optIn.equalsIgnoreCase("d")){
                KonversiAngkaKeHuruf.main(null);
            }
            else {
                System.out.println("Ngarang aja, itu ada di menu pilih!");
                Tidur.tidur();
            }
        }
    }
}
class Ui{
    static String garis ="-----------------------------------";
    static String garisDua ="====================================";
}

class AngkaKeHuruf{
    public  static void main(String[] args){
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukan angka anda\n: ");
            String inputStr= scanner.nextLine();
            if (inputStr.equalsIgnoreCase("exit")){
                System.out.println("Kembali ke Main Menu...");
                Tidur.tidur();
                break;
            }

            try { // Mengecek apakah input adalah angka (bisa desimal atau bulat)
                double nilai = Double.parseDouble(inputStr);

                if (nilai >= 85 && nilai <= 100) {
                    System.out.println("Nilai huruf: A");
                    Tidur.tidur();
                } else if (nilai >= 70 && nilai <= 84) {
                    System.out.println("Nilai huruf: B");
                    Tidur.tidur();
                } else if (nilai >= 60 && nilai < 70) {
                    System.out.println("Nilai huruf: C");
                    Tidur.tidur();
                } else if (nilai >= 50 && nilai < 60) {
                    System.out.println("Nilai huruf: D");
                    Tidur.tidur();
                } else if (nilai < 50 && nilai >= 0) {
                    System.out.println("Nilai huruf: E");
                    Tidur.tidur();
                } else {
                    System.out.println("Nilai di luar batas! Masukkan nilai antara 0 - 100.");
                    Tidur.tidur();
                }
            } catch (NumberFormatException e) {
                System.out.println("Input bukan angka! Silakan masukkan angka yang valid.");
                Tidur.tidur();
            }
        }
    }
}
class PositifNegatifNol{
    public  static void main(String[] args){
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukan angka anda\n: ");
            String inputStr= scanner.nextLine();
            if (inputStr.equalsIgnoreCase("exit")){
                System.out.println("Kembali ke Main Menu...");
                Tidur.tidur();
                break;
            }
            try {
                double number = Double.parseDouble(inputStr);
                if (number > 0) {
                    System.out.println("Bilangan Positif");
                    Tidur.tidur(); // Buat Delay .. Jangan Dihapus biar bagus .. Budayakan Sabar :) .. Anjayy
                } else if (number < 0) {
                    System.out.println("Bilangan Negatif");
                    Tidur.tidur();
                } else {
                    System.out.println("Bilangan Nol");
                    Tidur.tidur();
                }
            } catch (NumberFormatException e) {
                System.out.println("Input bukan angka!");
                Tidur.tidur();
            }

        }

    }
}
class GenapAtauGanjil{
    static Scanner scan = new Scanner(System.in);
    public  static void main(String[] args){
        System.out.println(Ui.garisDua);
        System.out.println("Genap atau Ganjil");
        System.out.println(Ui.garisDua);

        while (true) {
            System.out.print("Masukan angka anda\n: ");
            String inputStr= scan.nextLine();
            if (inputStr.equalsIgnoreCase("exit")){
                System.out.println("Kembali ke Main Menu...");
                Tidur.tidur();
                break;
            }
            try {
                int input = Integer.parseInt(inputStr);
                int cekAngka = input % 2;
                String hasil = (cekAngka == 1) ? "Ganjil" : "Genap";
                System.out.println("Angka anda adalah angka " + hasil);
            } catch (NumberFormatException e) {
                System.out.println("Salah");
            }
        }
    }

}
class KonversiAngkaKeHuruf{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println(Ui.garisDua);
        System.out.println("Angka ke Huruf (Switch Methode)");
        System.out.println(Ui.garisDua);

        while (true) {
            System.out.print("Masukan angka anda\n: ");
            String inputStr= scan.nextLine();
            if (inputStr.equalsIgnoreCase("exit")){
                System.out.println("Kembali ke Main Menu...");
                Tidur.tidur();
                break;
            }
            try {
                int input = Integer.parseInt(inputStr);
                switch (input /10){
                    case 10: case 9: case 8:
                        if(input >= 85 ){
                            System.out.println("Nilai A");
                        }
                        else {
                            System.out.println("Nilai B");
                        }
                        break;
                    case 7:
                        System.out.println("Nilai B");
                        break;
                    case 6:
                        System.out.println("Nilai C");
                        break;
                    case 5:
                        System.out.println("Nilai D");
                        break;
                    default:
                        System.out.println("Nilai E");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Masukan Angka / Bilangan Bulat!");
            }
        }
    }
}