package ders10_stringManipulations;

public class C02_contains {
    public static void main(String[] args) {
        String str= "Java ile kodlama cok zevkli";

        System.out.println(str.contains("cok"));
        System.out.println(str.contains("odla"));
        System.out.println(str.contains("a"));
        //System.out.println(str.contains('s'));  parametre olarak kabul etmez
        System.out.println(str.contains("java"));//false
        String str2= "Java";
        System.out.println(str.contains(str2));//true
        String str3 ="234 Ali Can ";
        System.out.println(str3.contains("3"));

        // CharSequence : char dizisi

    }
}
