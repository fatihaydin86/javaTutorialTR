package ch06_SwitchStatement;

import java.util.Scanner;

public class C01_SwitchCase {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("rakam gir");

        int rakam = input.nextInt();


        if ( rakam == 0 ) {
            System.out.println("sifir");

        }     else if (rakam == 1) {
            System.out.println("bir");

        } else if (rakam == 2) {
            System.out.println( "iki");

        } else System.out.println(" 0 ile 2 arasinda bir rakam girmelisin");




//switch ile
        System.out.println("switch ile kodlar");
switch (rakam) {case 0:
        System.out.println("sifir");
        break;
        case 1:
        System.out.println("bir");
        break;
        case 2:
            System.out.println( "iki");
            break;
            default:
        System.out.println(" 0 ile 2 arasinda bir rakam girmelisin");

        }

        //switch ornegi basic olarak
        System.out.println("ana menu icin A \nurun gostermek icin B \nurun eklemek icin C \ncikis icin Q'ye basiniz");
String islem = input. //input ile Scanner class'ina ulasildi
        next().//next metodu ile kullanicidan veri alindi
        toUpperCase(); //kullanicinin girdigi harf buyuk harfe cevrildi

        switch (islem) {
            case "A":
                System.out.println("ana menuye hosgeldin");
                break;
            case "B":
                System.out.println("hangi urunleri gormek istersin");
                break;
            case "C":
                System.out.println( "hangi urunleri eklemek istersin");
                break;
            case "Q":
                System.out.println( "cikis isleminiz yapiliyor");
                break;
            default:
                System.out.println(" A, B, C veya Q girmelisin");
                break;
        }






    }
}