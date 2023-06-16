package ch09_Break_Continue;

import java.util.Scanner;

public class C03_AsalKontrol {

    public static void main(String[] args) {


//task-> girilen tamsayının asal olmasını kontrol eden code create ediniz

        Scanner input = new Scanner(System.in);
        System.out.println("bir tamsayi giriniz");

        int sayi = input.nextInt();

        boolean asalMi = true;


        // i degerlerini bolen icin kullanacagiz

        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                System.out.println(sayi + "sayisi asal degil");
                asalMi = false;
                break;
            }



        }

if (asalMi && sayi!=1) { System.out.println(sayi + "sayisi asaldir"); }

else System.out.println("asal degil");







    }
}
