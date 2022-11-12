package ders09_StringManipulations;

public class C07_substring {
    public static void main(String[] args) {
        String str= "Java gun gectikce guzellesiyor";


        System.out.println( str.substring(5,8));// gun
        // 5. indexten baslar (8-5) karakter yazdirir
        // 5.index dahil (inclusive) , 8. index haric(exclusive)

        // gectikce yazdirin

        System.out.println(str.substring(9,17));

        System.out.println(str.substring(3,7));// a gu

        String isim ="HUSeyin";
        // verilen ismi ilk harfi buyuk geriye kalanlar kucuk harf olarak kaydedin
        isim=isim.substring(0,1).toUpperCase() +// ilk harfi alip buyuk harf yaptik
                isim.substring(1).toLowerCase();// 1.index ve sonrasini alip kucuk har yaptik

        System.out.println(isim);//Huseyin
        System.out.println(isim.substring(2,5));//sey

        // sadece 3.indexdeki harfi yazdirin
        System.out.println(isim.substring(3,4));// e

        System.out.println("zor sorunun cevabi : " + isim.substring(2,2));//hiclik yazdirir

        //System.out.println(isim.substring(5,2)); //StringIndexOutOfBoundsException
    }
}
