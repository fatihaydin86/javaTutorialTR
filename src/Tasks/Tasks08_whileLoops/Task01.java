package ch08_Loops.L02_WhileLoop.Tasks08_whileLoops;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
/*
Task-> girilen sayıların toplamı 333 gectiğinde girilen sayı adedini ve toplamını print eden code create ediniz.
 */

    Scanner input = new Scanner (System.in);


    int count = 0;

    int toplam = 0;

    while (toplam <= 0 && count<= 0) {

        System.out.println("sayi giriniz");

        count++;

        int sayi = input.nextInt();

        toplam+= sayi;

     //   if (toplam <= 333) count++;

        if (toplam > 333)  break;





    }


        System.out.println("sayi adedi= " + count);

        System.out.println("toplam= " + toplam);





   // while (toplam<= 333) { toplam+= sayi; };











    }
}
