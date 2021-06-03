package app;

import java.util.Scanner;

public class Balok {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Panjang : ");

        int panjang = input.nextInt();

        System.out.println("Masukkan Lebar : ");

        int lebar = input.nextInt();

        System.out.println("Masukkan Tinggi : ");

        int tinggi = input.nextInt();

        int luas = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi );

        int volume = panjang * lebar * tinggi;

        System.out.println("Luas adalah : " + luas);
        System.out.println("Volumeny adalah : " + volume);
    }
}