package ders11_stringManipulations;

public class C02_replace {
    public static void main(String[] args) {
        String str = "Java candir";

        System.out.println(str.replace('a', 'A'));
        System.out.println(str.replace(' ', '_'));
        System.out.println(str.replace("candir","cok guzeldir"));//Java cok guzeldir
        //Stringdeki tum a'lari silin
        System.out.println(str.replace("a",""));//Jv cndir

        //Java yerine Hava, candir yerine cok guzeldir yazdiralim

        System.out.println(str.replace("Java","Hava")
                .replace("candir","cok guzel"));//Hava cok guzel

        //sadece 1.a'yi A yapin
        System.out.println(str.replaceFirst("a","A"));
        System.out.println(str.replaceFirst("","_"));
    }
}
