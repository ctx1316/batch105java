package ders11_stringManipulations;

public class C07_Soru {
    public static void main(String[] args) {
        //Soru 5 : Kullanicidan isim ve soyismini ayri ayri alin.
        //- ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
        //- soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
        //harflerle yazdirin.

        String isim = "Mehmet";
        String soyisim="Haruntan";
        String yeniIsimSoyisim;

        if(isim.length()>soyisim.length()){
            //isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
            System.out.println(yeniIsimSoyisim = isim.substring(0, 1).toUpperCase() +
                    isim.substring(1).toLowerCase() +
                    " " +
                    soyisim.substring(0, 1).toUpperCase() +
                    soyisim.substring(1).toLowerCase());

        }else{
            //ismi ilk harf buyuk digerleri kucuk, soyismi buyuk harflerle yazdirin
            System.out.println(yeniIsimSoyisim = isim.substring(0, 1).toUpperCase() +
                    isim.substring(1).toUpperCase() +
                    " " +
                    soyisim.substring(1).toUpperCase());

        }
    }
}
