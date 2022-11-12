package ders10_stringManipulations;

public class C07_Soru {
    public static void main(String[] args) {
        /*
         kullanicidan bir cumle ve bir metin alin
        1- cumle metni icermiyor
        2- cumle metni sadece 1 kere iceriyor
        3- cumle metni birden fazla iceriyor
        seceneklerinden uygun olani yazdirin
        */

        String cumle= "Java cok guzeldir cok";
        String metin= "cok";

        if(!cumle.contains(metin)){
            System.out.println("cumle metni icermiyor");
        }else {
            int ilkindex= cumle.indexOf(metin);// 5
            int ikinciindex=cumle.indexOf(metin,ilkindex+1);// ya -1 olacak ya da bir index
            if(ikinciindex==-1){
                System.out.println("cumle metni sadece 1 kere iceriyor");
            }else{
                System.out.println("cumle metni birden fazla iceriyor");
            }

        }
    }
}
