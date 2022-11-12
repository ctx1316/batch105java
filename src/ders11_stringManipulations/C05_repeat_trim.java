package ders11_stringManipulations;

public class C05_repeat_trim {
    public static void main(String[] args) {
        String str="Java guzeldir";

        System.out.println(str.repeat(4));//Java guzeldirJava guzeldirJava guzeldirJava guzeldir

        str=" Java guzeldir";

        System.out.println(str.length());//14

        str= str.trim();

        System.out.println(str);// Java guzeldir
        System.out.println(str.length());//13
    }
}
