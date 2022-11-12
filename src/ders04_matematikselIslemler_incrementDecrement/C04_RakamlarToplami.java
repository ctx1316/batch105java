package ders04_matematikselIslemler_incrementDecrement;

public class C04_RakamlarToplami {
    public static void main(String[] args) {
        //kullanicidan girdigi 4 basamakli bir sayinn
        // rakamlar toplamini veren bir kod yaziniz

        int input= 1543;

        int birlerBasamagi= 0;
        int rakamlarToplami= 0;


        // birler basamgini al
        birlerBasamagi = input % 10;// 3
        // birler basamagini rakamlar toplamina ekle
        rakamlarToplami= rakamlarToplami + birlerBasamagi;// 3
        // birler basamagindan kurtul
        input = input/10;


        birlerBasamagi = input % 10;// 3

        rakamlarToplami= rakamlarToplami + birlerBasamagi;// 3

        input = input/10;


        birlerBasamagi = input % 10;// 3

        rakamlarToplami= rakamlarToplami + birlerBasamagi;// 3

        input = input/10;

        birlerBasamagi = input % 10;// 3

        rakamlarToplami= rakamlarToplami + birlerBasamagi;// 3

        input = input/10;
        System.out.println("verilen sayinin rakamlar toplami : " + rakamlarToplami);

    }
}
