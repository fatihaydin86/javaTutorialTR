package ch07_StringManipulations;

import java.util.Scanner;

public class C03_CharAt {

    public static void main(String[] args) {

        /*
        charAt() methodu, parametre int olarak girilen index'teki char degerini return eder.
        index degeri 0'dan baslar
         */

        String city = "Istanbul";
        System.out.println("city.charAt(0) = " + city.charAt(0)); // city.charAt(0) = I

        System.out.println("city.charAt(1) = " + city.charAt(1)); // city.charAt(1) = s

        System.out.println("city.charAt(2) = " + city.charAt(2)); // city.charAt(2) = t

        char cityBirinciIndexElemani = city.charAt(1);
        System.out.println("cityBirinciIndexElemani = " + cityBirinciIndexElemani);

      // task son karakteri atama ile yazdiran kod yaziniz

        System.out.println("city.charAt(city.length()-1) = " + city.charAt(city.length() - 1));

        int sonHarfIndexi = city.length()-1;
        System.out.println("sonHarfIndexi = " + sonHarfIndexi);

        System.out.println("city.charAt(sonHarfIndexi) = " + city.charAt(sonHarfIndexi));


        // task alinan son karakteri uygun bir variable'a atama yaparak yazdirin

        char sonHarf = city.charAt(sonHarfIndexi);
        System.out.println("sonHarf = " + sonHarf);


        // System.out.println("city.charAt(21) = " + city.charAt(21));
        // RTE
        // Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 21



        // Task-> istanbul izmir  girilen kelimenin kelimesinin ortadaki karakteri
        // print eden code create ediniz...

        Scanner input =new Scanner(System.in);
        System.out.println("şehir ismi gir");
        String sehir= input.nextLine();

        if (sehir.length()%2!=0){
            System.out.println(sehir.charAt((sehir.length()) / 2));
        }else System.out.println("girilen sehir isminin orta karakteri yoktur");







    }
}
