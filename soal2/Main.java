package soal2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih jenis hewan yang ingin diinputkan:");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); 

        if (pilihan == 1) {
            System.out.print("Nama hewan peliharaan: ");
            String nama = scanner.nextLine();
            System.out.print("Ras: ");
            String ras = scanner.nextLine();
            System.out.print("Warna Bulu: ");
            String warnaBulu = scanner.nextLine();

            Kucing kucing = new Kucing(nama, ras, warnaBulu);

            System.out.println("\nDetail Hewan Peliharaan:");
            kucing.displayDetailKucing();

        } else if (pilihan == 2) {
            System.out.print("Nama hewan peliharaan: ");
            String nama = scanner.nextLine();
            System.out.print("Ras: ");
            String ras = scanner.nextLine();
            System.out.print("Warna Bulu: ");
            String warnaBulu = scanner.nextLine();
            System.out.print("kemampuan : ");
            String kemampuanInput = scanner.nextLine();
            String[] kemampuan = kemampuanInput.split(",\\s*");

            Anjing anjing = new Anjing(nama, ras, warnaBulu, kemampuan);

            System.out.println("\nDetail Hewan Peliharaan:");
            anjing.displayDetailAnjing();

        } else {
            System.out.println("Pilihan tidak valid!");
        }

        scanner.close();
    }
}
