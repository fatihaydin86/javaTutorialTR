package ch04_JavaOperators.jo01_ArithmeticOperators;

import java.util.Scanner;

public class C03_RakamlarToplamiTaskKendiNotum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("3 basamakli sayi gir");

                int sayi = input.nextInt(); //user in girdigi deger atandi

        int birlerBasamagi = sayi % 10; //sayiinin 10 a bolumunden kalan birler basamagi atandi

        sayi /=10; //sayinin birler basamagi atildi

        int onlarBasamagi = sayi % 10; //iki basamaga dusen sayinin birler basamagi alindi (ilk sayinin onlar basamagi)

        int yuzlerBasamagi = sayi / 10; //sayinin yuzler basamagi alindi

        int toplam = birlerBasamagi+onlarBasamagi+yuzlerBasamagi;

        System.out.println("toplam = " + toplam);



    }
}
