package ch08_Loops.Tasks08_forLoop;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*
        girilen iki sayı arasındaki çift sayıları yanyana  print eden code create ediniz..
         */


        Scanner input = new Scanner (System.in);

        System.out.println("iki tamsayi giriniz");

        int sayi = input.nextInt();
        int sayi2 = input.nextInt();

        if (sayi<=sayi2) {
            for (int i = sayi+1; i < sayi2; i++) { if (i%2==0) {
                System.out.print(i+" ");
            }

            }


        }

        if (sayi2<=sayi) {
            for (int i = sayi2+1; i < sayi; i++) { if (i%2==0) {
                System.out.print(i+" ");
            }

            }

        }








    }

}






















