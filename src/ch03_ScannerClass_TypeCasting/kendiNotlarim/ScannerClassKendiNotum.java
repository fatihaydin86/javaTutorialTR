package ch03_ScannerClass_TypeCasting.kendiNotlarim;

import java.util.Scanner;

public class ScannerClassKendiNotum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //1. adim

       //stem.out.println("sifreni gir");//2. adim

       //ring sifre = input.nextLine(); //3. adim

       //stem.out.println(sifre.replaceAll( "\\d", "*")        );
       // \\d regex ifadesi rakamlari simgeler. digit demek


//Task // Kullanicinin girdigi degere gore kare alani ve cevresini hesaplayan bir code create ediniz

       //trick soru Scanner objesi create etmeli miyiz?
       // edebiliriz fakat gereksiz bellekte yer isgali olur


       //stem.out.println("karenin kenarini gir"); //kullaniciya kenar girme komutu verildi

       //t kenar = input.nextInt(); //kullanicinin girdigi integer deger kenar variable'ina atama yapildi

       //t alan = kenar*kenar; //kenari carparak alan variable'ina atandi

       //t cevre = kenar*4; //kenari 4 ile carparak cevre variable'ina atandi

       //stem.out.println("alan = " + alan);

       //stem.out.println("cevre = " + cevre);

//task kullanicidan ismini alip ilk harfini yazdirin

        System.out.println("ismini gir");
        String name = input.nextLine(); //ismin tamamini alip name variable atandi
        System.out.println("name = " + name);


        char ilkHarf = name.charAt(0); //kullanicinin girdigi ismin ilk harfi char variable¡ina atandi
        System.out.println("ilkHarf = " + ilkHarf);

        System.out.println("name.length() = " + name.length()); //kac tane harften olustugu yazdirildi

        //task: ismin son harfini yazdirin

        char sonHarf = name.charAt(name.length() - 1); //ismin son harfinin atamasi yapildi
        System.out.println("sonHarf = " + sonHarf);




    }
}
