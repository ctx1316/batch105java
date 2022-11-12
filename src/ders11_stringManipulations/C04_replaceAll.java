package ders11_stringManipulations;

public class C04_replaceAll {
    public static void main(String[] args) {
        // Kullanicinin girdigi metinde
        // harf disinda kalan tum karakterleri temizleyen bir kod yazin
        // NOT : space silinmemeli

        String input= "Ja5+va cok 1*guzel";

        System.out.println(input = input.replaceAll("\\d", ""));//Ja+va cok *guzel

        System.out.println(input = input.replaceAll(" ", "5"));//Ja+va5cok5*guzel

        System.out.println(input = input.replaceAll("\\W", ""));//Java5cok5guzel

        System.out.println(input = input.replaceAll("5", " "));// Java cok guzel

    }
}
