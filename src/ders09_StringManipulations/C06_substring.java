package ders09_StringManipulations;

public class C06_substring {
    public static void main(String[] args) {
        String str= "Java ogren, isi kap";
        System.out.println(str.substring(5));//ogren, isi kap

        System.out.println(str.substring(0));//Java ogren, isi kap

        System.out.println(str.length());//19

        // son karakteri string olarak kaydedin

       String sonHarf;//=""+ str.charAt(str.length()-1); bu şekilde olabilecegi gibi

       sonHarf=str.substring(str.length()-1);// bu sekilde daha guzel olur
        System.out.println(sonHarf);

        // son indexdeki karakteri upper case olarak yazdirin

        System.out.println(str.substring(str.length()-1).toUpperCase());

        // son 3 harfi buyuk harf olarak yazdirin

        System.out.println(str.substring(str.length()-3).toUpperCase());



    }
}
