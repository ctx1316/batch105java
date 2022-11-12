package ders09_StringManipulations;

public class C01_toUpperCase {
    public static void main(String[] args) {
        String str= "Java Mutluluktur";
        System.out.println(str.toUpperCase());//JAVA MUTLULUKTUR

        str= str.toUpperCase();

        System.out.println(str);//JAVA MUTLULUKTUR

        str= "ince mehmet";
        str=str.toUpperCase();
        System.out.println(str);//INCE MEHMET

        str=str.toLowerCase();
        System.out.println(str);

        
    }
}
