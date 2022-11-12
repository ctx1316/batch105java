package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ondalıklı bir sayi giriniz");
        double ondalikliSayi= scan.nextDouble();

        System.out.println("Lutfen bir tam sayi giriniz");
        int tamSayi= scan.nextInt();

        System.out.println("Girilen Sayıların toplami : " + (ondalikliSayi+ tamSayi));
        System.out.println("Girilen Sayıların toplami : " + (ondalikliSayi*tamSayi));
    }
}
