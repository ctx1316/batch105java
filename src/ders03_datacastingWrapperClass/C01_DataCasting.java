package ders03_datacastingWrapperClass;

public class C01_DataCasting {
    public static void main(String[] args) {

        // Bazı data türleri asla birbirine cast edilemez
        /* String str= 20;

        boolean mutluMu= "true";

        int a = true;*/

     double s=  20;

     int sayi= 15;

     long ln= sayi;  // eşitliğin sol tarafı long sağ tarafı yani deger int
        //java itiraz etmedi

        /* dar data turundeki bir degeri
        genis data turundeki variable'a atama yaparsaniz
        java bunu otomatik yapar
         */
        short sh= 23;
        int a= sh;

        long lng = sh;

        float fl= lng;

        /* ama tersini yapmak isterseniz
        yani buyuk data turundeki bir degeri
        kucuk data turundeki variable'a atamak isterseniz java kabul etmez
         */

        double dbl= 20;

       // a= dbl;

       // short abc= dbl;


    }
}
