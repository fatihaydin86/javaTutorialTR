package ch07_StringManipulations;

public class C08_equals_equalsIgnoreCase {

    public static void main(String[] args) {

        /* equals()
         * 2 String metnin birbirine esit olup olmadigina bakar. büyük küçük harf farkı vardır. Sonuc boolean dir.
         *
         * equalsIgnorecase()
         * equals() ile ayni islevi gorur, tek farki buyuk kucuk harfe duyarliligi yoktur. Sonuc boolean dir.
         */
/**
 * str.toLowerCase() verilen String'in tamamini kucuk harfe cevirir
 * str.toUpperCase() verilen String'in tamamini buyuk harfe cevirir
 */




// Bu kisimda replace ve replaceAll yapildi


 // regex karakterler sadece replaceAll da kullanıliyor

        String str1 = "Merhaba";
        String str2 = "merhaba";


        System.out.println(str1.equals(str2));  // false
        System.out.println(str2.equals(str1)); //false

        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str2.equalsIgnoreCase(str1));


        str2 = "Merhaba"; //str'nin degeri update edildi. yeniden atama yapildi

      System.out.println(str1.equals(str2)); //true


        String s1 = "ahmet";
        String s2 = "ahmet";

        String s3 = new String ("zeynep");  // new keyword'u kullanilirsa, degerler ayni olsa bile reference degisir
        String s4 = new String ("zeynep");

        System.out.println(s1 == s2);   // true
        System.out.println(s1.equals(s2)); // true
        System.out.println(s3 == s4);   // false
        System.out.println(s3.equals(s4));  // true










    }
}
