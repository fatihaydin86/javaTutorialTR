package ch08_Loops.L01_ForLoop;

import java.util.Scanner;

public class C02_forLoop {

    public static void main(String[] args) {

        //task: girilen pozitif sayidan 100'e kadar 4'un kati tamsayilari print eden code create ediniz


        Scanner input = new Scanner(System.in);
        System.out.println("pozitif bir tamsayi giriniz");
        int sayi = input.nextInt();

        if (sayi < 0) {
            System.out.println("pozitif sayi girmelisin");
        } else {

        for (int i = sayi; i < 100 ; i++) { // i sayi'dan baslar, 100'e kadar artarak devam eder
            if (i%4==0) { System.out.print(i+ " ");}


        }
        }

    /*else if (sayi>100) {
            System.out.println("100'den kusuk bir sayi giriniz");
        }
*/




        }
}