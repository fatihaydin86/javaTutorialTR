package ch07_StringManipulations.tasks07;

public class _16_String_methods12 {

    public static void main(String[] args) {

        /*  Florida kelimesinden bir String oluşturun.
            Florida kelimesinin içindeki, sadece  'o'  harfinin bulunduğu indexini yazdırın.  */

        //Kodu aşağıya yazınız.

        String str = "Florida";
        System.out.println("str.charAt(2) = " + str.charAt(2));
        System.out.println("str.indexOf(\"o\") = " + str.indexOf("o"));
        System.out.println("str.indexOf('o') = " + str.indexOf('o')); // char cinsinden de yazilabilir


    }
}
