package ch08_Loops.L01_ForLoop;

import java.util.Scanner;

public class C04_forLoop {

    public static void main(String[] args) {


         /*
       Interview Question
               Girilen  100’den kucuk bir tamsayi için
               1’den baslayarak girilen sayiya kadar tum sayilari print eden ama;
           1  - Sayi 3’un kati ise sayi yerine "Java" yazdirin.
           2  - Sayi 5’in kati ise sayi yerine "CAN'dır" yazdirin.
           3  - Sayi hem 3’un hem 5’in kati ise sayi yerine "JavaCAN" print eden code create ediniz
*/


        Scanner input = new Scanner(System.in);
        System.out.println("100'den kucuk bir tamsayi giriniz");
        int sayi = input.nextInt();

        if (sayi>=100) {
            System.out.println("100'den kucuk sayi giriniz");
        }

       else if (sayi<0) {
            System.out.println("0'dan buyuk sayi giriniz");
        }

        else {

        for (int i = 1; i <= sayi ; i++) {



            if (i%15==0) { //if (i%3==0 && i%5==0) {System.out.println("JavaCAN");}
                System.out.println("JavaCAN");
            }
            else if (i%3==0) {
                System.out.println("Java");
            }

            else if (i%5==0) {
                System.out.println("CAN'dir");
            }

            else {
                System.out.println("bu sayi ne 3'un ne 5'in kati"+ " " +i);
            }

        }

        }







    }
}
