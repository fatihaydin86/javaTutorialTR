package ch08_Loops.Tasks08_forLoop;

import java.util.Scanner;

public class Odev06 {
    public static void main(String[] args) {

    /*  Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
         hesaplayan kodu yazınız.

         Örnek Ekran Çıktısı
        Girilen sayı=4
        Kareler toplamı=30

     */

        Scanner input = new Scanner (System.in);
        System.out.println("1'den buyuk bir tamsayi giriniz");

        int sayi = input.nextInt();

        int toplam = 0;

        if (sayi<=1) System.out.println("Lutfen 1'den buyuk bir tamsayi giriniz");

        else for (int i = 1; i <= sayi ; i++) {

            toplam+= i*i;



        }

        System.out.println(toplam);

    }
}
