package ders04_matematikselIslemler_incrementDecrement;

public class C05_IncrementDecrement {

    public static void main(String[] args) {

        int sayi= 10;
        // bu syiyi 3 arttiralim ve yazdiralim

        sayi= sayi+3;
        System.out.println(sayi);

        sayi+=3;
        System.out.println(sayi);
        System.out.println();
        System.out.println();

        int s= 10;
        // bu sayiyi bir artiralim

        s=s+1;
        System.out.println(s);//11
        s+=1;
        System.out.println(s);//12
        s++;
        System.out.println(s);//13
        ++s;
        System.out.println(s);//14
        System.out.println();
        System.out.println();

        int t=10;
        // bu sayiyi bir artiralim
        System.out.println(t);
        t=t-1;//9
        System.out.println(t);
        t-=1;//8
        System.out.println(t);
        t--;//7
        System.out.println(t);
        --t;//6
        System.out.println(t);

    }
}
