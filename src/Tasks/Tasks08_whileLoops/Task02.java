package ch08_Loops.L02_WhileLoop.Tasks08_whileLoops;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */

        System.out.println("for loop cozumu\n");

        Scanner input = new Scanner(System.in);
        System.out.println("iki tamsayi giriniz");

        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();



        if (sayi1 < sayi2) {
            for (int i = sayi1 + 1; i < sayi2; i++) {
                System.out.print(i + " ");

            }
        }

        if (sayi2 < sayi1) {
            for (int i = sayi1 - 1; i > sayi2; i--) {
                System.out.print(i + " ");

            }

        }

        System.out.println();


        System.out.println("while loop cozumu\n");

        System.out.println("iki tamsayi giriniz");

        int sayi3 = input.nextInt();
        int sayi4 = input.nextInt();


        int i2 = sayi3 + 1;
        int i3 = sayi3 - 1;
        int i4 = sayi4;


        while (sayi3 < sayi4) {
            System.out.print(i2 + " ");
            i2++;
            if (i2 == i4) break;

        }


        while (sayi3 > sayi4) {
            System.out.print(i3 + " ");
            i3--;
            if (i3 == i4) break;

        }

        System.out.println("\n");

        System.out.println("diger cozum\n");
        System.out.println("iki tamsayi giriniz");

        for (int i5 = (Math.min(sayi1, sayi2)) + 1; i5 < (Math.max(sayi1, sayi2)) ; i5++) {
            System.out.print(i5 + " ");

        }



    }
}
