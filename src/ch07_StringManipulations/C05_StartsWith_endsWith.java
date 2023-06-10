package ch07_StringManipulations;

import java.util.Scanner;

public class C05_StartsWith_endsWith {

    public static void main(String[] args) {

        /**
         * startsWith()
         *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         *  String'in basladigi characteri dogrular
         * endsWith()
         * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         */


        String city = "Istanbul";

        //startsWith()
        System.out.println(city.startsWith("i")); // False. Case sensitive
        System.out.println(city.startsWith("I"));
        System.out.println(city.startsWith("Ist"));

        System.out.println(city.startsWith("t", 3)); // false
        System.out.println(city.startsWith("tan", 2)); // true
        // 2. parametre index'i temsil eder. O index'in girilen dizi ile baslayip baslamadigi kontrol edilir


        //endsWith()
        System.out.println(city.endsWith("l")); //true
        System.out.println(city.endsWith("u")); //false
        System.out.println(city.endsWith("tanbul")); //true
        System.out.println(city.endsWith("L")); //false


        // iki string arasinda kontrol etme
        String str= "asd";
        System.out.println(city.endsWith(str)); //false

        String str2 = "bul";
        System.out.println(city.endsWith(str2)); //true



        //Task -> girilen e-mail hesabının  @gmail.com ile bitmiyorsa "lütfen gmail hesabı giriniz"
        // @gmail.com ile  bitiyorsa "hesabınız onaylandı" aksi durumda "geçerli hesap giriniz
        // print edn code creae ediniz.

        //note contains ile yaparsaniz true olur iceren herhangi bir karater girse true olur
        //bunu endsWith() ile yapiniz

String mailSonu = "@gmail.com";
        Scanner input = new Scanner(System.in);
        System.out.println("gmail'ini gir");
        String gmail = input.nextLine();

        if(gmail.endsWith(mailSonu)) {
            System.out.println("hesabiniz onaylandi");

        } else {
            System.out.println("gecerli hesap giriniz");

        }


    }
}
