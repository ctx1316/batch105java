package ders08_ternary_switch;

public class C02_Ternary {
    public static void main(String[] args) {
        String str1 = "Ali";
        String str2 = "ali";

        // verilen iki metin birbiri ile aynı ise "Metinler aynı" farkli ise "Metinler fakli" yazdirin

        if(str1.equals(str2)){
            System.out.println("Metinler aynı");
        }else{
            System.out.println("Metinler fakli");
        }
        System.out.println(str1.equals(str2) ? "Metinler aynı" : "Metinler fakli");
    }
}
