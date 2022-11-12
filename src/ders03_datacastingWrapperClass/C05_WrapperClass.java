package ders03_datacastingWrapperClass;

import java.util.OptionalInt;

public class C05_WrapperClass {
    public static void main(String[] args) {

        int sayi = 10;
        String str = "Java cok guzel";
        /* primitive data tuleri sadece deger barindirirlar, hazir methodlari yoktur
        javaya yapılan talepler sonucunda java primitive data turleri ile bazi methodlarin kullanilabilmesi
        icin Wrapper classlar oluşturmuştur

        Wrapper class'lar primitive data turlerindeki degerleri alirlar
        ancak method'lari da vardir
         */
        char krk= 'b';
        Character krkWrapper = 'c';
        System.out.println(Character.isLetter('5'));// false
        System.out.println(Character.isDigit('7'));// true

        String str1= "123";
        String str2= "12";

        System.out.println(str1 + str2);
        System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2));//135

        //Integer.parseInt(str) icine yazilan str rakamlardan olusuyorsa str'i int' a cevirir
        // ancak bir karakter bile rakam degilse hata verir

        System.out.println(Integer.MAX_VALUE);//2147483647
        System.out.println(Short.MIN_VALUE);//-32768


    }
}
