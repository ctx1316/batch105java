package ders09_StringManipulations;

public class C04_charAt {
    public static void main(String[] args) {
        String str= "Java Candir";

        System.out.println(str.charAt(0));// ilk harfi verir

        System.out.println(str.charAt(5));// 5. idexdeki char'i verir

        System.out.println(str.charAt(10));// bana sonuncu karakteri yazdirin "r"
        /*
        bir metindeki karakter saysi ile son index arasinda bir fark vardir
        bu metin icin karakter sayisi 11
        son index 10 dur
         */

        System.out.println(str.charAt(11));//StringIndexOutOfBoundsException
    }
}
