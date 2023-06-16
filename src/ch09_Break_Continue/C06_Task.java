package ch09_Break_Continue;

import java.util.Arrays;
import java.util.Scanner;

public class C06_Task {

    public static void main(String[] args) {

        // Task-> girilen 7 tamsayının 10 ile 20 arasındakileri hariç toplamını print eden code create ediniz.

        Scanner input = new Scanner(System.in);

        System.out.println("7 adet sayi gir");

        int num = input.nextInt();

        int sum = 0; // bu, sayilarin toplamini kaydetmek icin create edildi
        int count = 0; // bu, 7 sayi alabilmek icin create edildi



        while (count < 7) {

            count++;

            if (num >= 10 && num <= 20) // sayi 10 ile 20 arasindaysa
            continue;

            count++;


        }



        sum += num;



        System.out.println("girilen 7 tamsayinin 10 ile 20 arasindakiler haric toplami= " + sum);



    }
}
