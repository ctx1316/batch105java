package ders04_matematikselIslemler_incrementDecrement;

public class C06_Pre_Post_Increment {
    public static void main(String[] args) {

        int a= 10;
        //a variable'nin degerini yazdirip sonra a'nin degerini bir artirin
        // avariable'nin degerini bir artirip, sonra yazdirin

        System.out.println("a'nin degeri : " + a);//10
        a++;
        // a artik 11

        int b= 10;
        // b variable'nin degerini bir artirip, sonra yazdirin

        b++;
        System.out.println("b'nin degeri : " + b);

        int c= 10;
        //c variable'nin degerini yazdirip sonra c'nin degerini bir artirin
        System.out.println("c'nin degeri : " + c++);

        int d= 10;
        // d variable'nin degerini bir artirip, sonra yazdirin
        System.out.println("d'nin degeri : " + ++d);

        /*
        c++ veya ++d 'yi yazdirma veyaa atama isleminde kullanirsaniz
        c++ 'e post increment denir o satir icin once islemi yapar sonra artirmayi yapar
        ++d 'ye ise pre increment denir, once artirma yapip sonra islemi yapar

        islemin oldugu satirin bir alt satirina gecildiginde c' de d'de bir artmistir
         */

    }
}
