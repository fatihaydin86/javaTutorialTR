package ch07_StringManipulations;

import java.util.Scanner;

public class C03_Contains {

    public static void main(String[] args) {

        /*
        String icerisinde istenen string'in varligini kontrol eder. Boolean cinsinden return eder

         */

        String str = "java ile gunler";
        System.out.println("str = " + str);

       // System.out.println("str.contains('java') = " + str.contains('j'));

        // CTE incompatible types: char cannot be converted to java.lang.CharSequence
        // parametre string olmali


        System.out.println("str.contains(\"java\") = " + str.contains("java"));

        System.out.println("str.contains(\"Java\") = " + str.contains("Java"));  // case sensitive

        System.out.println("str.contains(\" \") = " + str.contains(" ")); // true. Bosluk iceriyor

        System.out.println("str.contains(\"\") = " + str.contains("")); // true. Hiclik iceriyor

        //Hiclik (Empty string): Her bir karakter arasi. n karakterli bir variable'da n-1 adet hiclik vardir
        //Hiclik (Empty string) karakter degildir



        // task-> girilen urunun var olup olmaidgini kontrol eden bir code create ediniz -> ternary kullanınız

        Scanner input = new Scanner(System.in);

        System.out.println("urun ismi giriniz");
        String urun = input.nextLine();

        System.out.println("aradiginiz urunu giriniz");
        String araanUrun = input.nextLine();

        System.out.println(urun.contains(araanUrun) ? "aradiginiz urun vardir" : "aradiginiz urun yoktur");




        //TASK giirlen sifrenin dogru ise erisim izni verin yanlis ise vermeyin
        // ternary ile switch ile if ile yapiniz
        //bug i bulunuz
        //contains methodu sifre kontrol islemlerinde KULLANILMAMALI


        String password = "xyz";

        System.out.println("sifre giriniz");

        String sifre = input.nextLine();

        System.out.println((sifre.equals(password)) ? "sifre dogru" : "sifre yanlis");

        switch (sifre) {
            case "xyz":
                System.out.println("you can log in via switch case");
                break;
            default:
                System.out.println("you entered a wrong password");
                break;




        }




    }
}
