import java.util.Scanner;

public class App {

public static void main(String[] args) {
    Sampah sampah = new Sampah();

    Scanner scanner = new Scanner(System.in);

    while (true) {
        System.out.println("---Jenis jenis sampah---");
        System.out.println("Masukkan jenis sampah:");
        System.out.println("Masukkan jumlah sampah:");
        System.out.println("Tampilkan sampah");
        System.out.println("Exit");
        int pilih = scanner.nextInt();

        switch (pilih) {
            case 1:
                sampah.masukkanJenisSampah();
                break;

            case 2:
                sampah.masukkanJumlahSampah();
                break;

            case 3:
                sampah.tampilkanSampah();

            case 4:
                running = false;
                System.out.println("Exit");
                break;

            default:
                System.out.println("Tidak ada pilihan tersebut");
            }
        }   
    }
}