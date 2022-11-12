package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        // Kullanicidan ismini alip, buyuk harflerle yazdirin

        // 1.adim scan objesini olusturma
        Scanner scan= new Scanner(System.in);

        // 2. adim : kullaniciya ne istediğimizi yazdirma
        System.out.println("Lufen Adinizi Giriniz : ");

        // 3.adim : Kullanicidan bilginin turune uygun bir variable olusturup scanner
        //          methodlarindan uygun olanini kullanarak alinan degeri
        String kullaniciAdi=scan.next();
        System.out.println(kullaniciAdi.toUpperCase());

    }
}
