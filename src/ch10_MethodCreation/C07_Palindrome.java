package ch10_MethodCreation;

import java.util.Scanner;

public class C07_Palindrome {

    public static void main(String[] args) {

/*
girilen ifadenin polindrome olmasını kontrol eden method create ediniz...
plindrome:her iki yönde okundugunda eşit olan ifadeler
madam , ada ,iki asa, 121
 */

        Scanner input = new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String kelime = input.next();



       /*

        if (ifade.length() % 2 ==1) {

        for (int i = 0; i < ifade.length() -1; i++) {

        }

        }

        */


palindrome (kelime);




    }


    private static void palindrome(String k) {

        String ters = "";  //bos container olusturuldu

        for (int i = k.length() -1 ; i >= 0 ; i--) {
            ters += k.charAt(i); //her bir karakter tersten tek tek atandi
        }

            System.out.println("girdigin kelimenin tersi= " + ters);

            if (ters.equalsIgnoreCase(k)) {
                System.out.println("bu kelime palindromedur");

            } else System.out.println("bu kelime palindrome degildir");


        }




    }





