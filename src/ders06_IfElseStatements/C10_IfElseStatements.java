package ders06_IfElseStatements;

import java.util.Scanner;

public class C10_IfElseStatements {
    public static void main(String[] args) {
        // Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri ,
        // Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak
        // “Emekli olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz");
        char cinsiyet=scan.next().charAt(0);
        System.out.println("Lutfen yasinizi giriniz");
        int yas= scan.nextInt();

        if (cinsiyet=='E'|| cinsiyet=='e' && yas>=65){
            System.out.println("emekli olabilirsin");
        } else if (cinsiyet=='E'|| cinsiyet=='e' && yas<65 && yas>15) {
            System.out.println("Emekli olmak icin daha " + (65-yas) + " sene calismalisin");
        } else if (cinsiyet=='K'|| cinsiyet=='k' && yas>=60) {
            System.out.println("Emekli olabilirsin");
        } else if (cinsiyet=='K'|| cinsiyet=='k' && yas<60 && yas>15) {
            System.out.println("Emekli olmak icin daha " + (60-yas) + " sene calismalisin");
        }else{
            System.out.println("gecersiz giris");
        }
    }
}
