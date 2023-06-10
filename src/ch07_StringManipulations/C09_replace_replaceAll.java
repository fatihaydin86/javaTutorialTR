package ch07_StringManipulations;

import java.util.Scanner;

public class C09_replace_replaceAll {

    public static void main(String[] args) {

        /** replace()
         * Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter ya da metinle degistirilmesini
         * (update -set) saglar. Sonuc String'dir..
         *
         */

        String str = "ezberlemek beyne ihanettir 12356 ^#^%$ () :";

        // replaceAll() method u replace() methoduna benzer ama 2 fark vardır
//1-replace() methodu char kabul eder ama replaceAll kabul etmez
//2-replaceAll() method u regex kullanımına izin verir (Regular Expressions)


//(Regular Expressions)
//   \\s bosluk (
//   \\S bosluk disindaki tum karakterler
//   \\w harfler ve rakamlar (a z A Z, 0 9)
//   \\W harfler ve rakamlar disindaki tum karakterler
//   \\d rakamlar 0 9
//   \\D rakamlar disindaki tum karakterler






        System.out.println("str.replace('e', '$') = " + str.replace('e', '$'));

        System.out.println("str.replace(\"tir\", \"*\") = " + str.replace("tir", "*"));

        System.out.println("str.replaceFirst(\"e\", \"*\") = " + str.replaceFirst("e", "*"));


        System.out.println(str.replaceAll("\\w", "*"));
        System.out.println(str.replaceAll("\\W", "*"));
        System.out.println(str.replaceAll("\\s", "*"));
        System.out.println(str.replaceAll("\\S", "*"));
        System.out.println(str.replaceAll("\\d", "*"));
        System.out.println(str.replaceAll("\\D", "*"));




        //task  Girilen ismini, soyismini ve 16 haneli kredi karti no bilgilerini aşağıdaki
// formatta print eden code create ediniz.

// isim-soyisim : M***** B*******
// kart no : **** **** **** 1234

        /* Scanner input = new Scanner
        String isimSoyisim = input.nextLine();

        System.out.println("isim soyisim giriniz");

        isimSoyisim.replace() */

        String isim = "Meryem";
        String soyisim = "Hanim";
        String kartNo = "1234567891234567";

        String yeniIsimCiktisi = isim.charAt(0) + isim.substring(1).replaceAll("\\w", "*");

        System.out.println("yeniIsimCiktisi = " + yeniIsimCiktisi);

        String yeniSoyisimCiktisi = soyisim.charAt(0) + soyisim.substring(1).replaceAll("\\w", "*");

        System.out.println("yeniSoyisimCiktisi = " + yeniSoyisimCiktisi);


        String yeniKartNoCiktisi = "**** **** **** " + kartNo.substring(12);
        System.out.println("yeniKartNoCiktisi = " + yeniKartNoCiktisi);

        String yeniKartNoRegex = kartNo.substring(0, 12).replaceAll("[0-9]", "*") + kartNo.substring(12);
        // "[0-9]" yerine "\\w" de kullanilabilir

        System.out.println("yeniKartNoRegex = " + yeniKartNoRegex);








    }
}
