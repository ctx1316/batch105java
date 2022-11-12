package ders02_dataTurleri_scanner;

import java.awt.*;
import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {

        // Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).
        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen birinci sayiyi giriniz");
        int sayi1= scan.nextInt();

        System.out.println("Lutfen ikinci sayiyi giriniz");
        int sayi2= scan.nextInt();

        int sayi3;

        sayi3=sayi1;
        sayi1=sayi2;
        sayi2=sayi3;

        System.out.println("Sayi 1'in yeni değeri : " + sayi1);
        System.out.println("Sayi 2'nin yeni değeri : " + sayi2);

    }
}
