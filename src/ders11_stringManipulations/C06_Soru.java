package ders11_stringManipulations;

public class C06_Soru {
    public static void main(String[] args) {
        //Soru 1 : Kullanicidan bir cumle alin
        //- cumlede ev geciyorsa, "home home sweet home" yazdirin
        //- cumlede is geciyorsa, "calismak guzeldir"
        //- ikisini de iceriyorsa "Hem ev lazim hem is"
        //- hicbirini icermiyorsa "cok calisman lazim" yazdirin

        String cumle = "Ofise geldim, isler birikmis";

        String cumlecopy=cumle.toLowerCase();

        if(cumlecopy.contains("ev") && cumlecopy.contains("is")){
            System.out.println("Hem ev lazim hem is");
        } else if (cumlecopy.contains("ev")){
            System.out.println("home home sweet home");
        } else if (cumlecopy.contains("is")){
            System.out.println("calismak guzeldir");
        }else {
            System.out.println("cok calisman lazim");

        }
    }
}
