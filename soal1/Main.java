package soal1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.print("Nama hewan peliharaan : ");
        String nama = scanner.nextLine();
        System.out.print("Ras : ");
        String ras = scanner.nextLine();
    	
    	HewanPeliharaan hewan1 = new HewanPeliharaan(nama, ras);
    	
    	hewan1.display();

        scanner.close();
    	
    }
}

