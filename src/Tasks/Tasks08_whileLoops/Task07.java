package ch08_Loops.L02_WhileLoop.Tasks08_whileLoops;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        // task-> girilen  5 sayının  en büyüğünü print den code create eediniz

    Scanner input = new Scanner(System.in);

    int enBuyukSayi = Integer.MIN_VALUE;
    int count = 1;

    while (count <= 5) {
        System.out.println(count + ". sayiyi girin");

        int sayi = input.nextInt();


        if (sayi > enBuyukSayi) { enBuyukSayi = sayi;}

        count++;

    }


        System.out.println("en buyuk sayi= " + enBuyukSayi);

















    }
}
