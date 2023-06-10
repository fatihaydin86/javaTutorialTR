package ch06_SwitchStatement;

import java.util.Scanner;

public class C04_SwitchCase3 {

    public static void main(String[] args) {

        // Girilen ay numarasına göre kaç gün çektiğini print eden code create ediniz...
        //break in ozelligini kullanin
        //29 subat icin sartlarini hatirlayiniz

        Scanner input = new Scanner(System.in);

        System.out.print("Ay numarasi giriniz: ");

        int ayNo = input.nextInt();

switch ( ayNo ) {
    default:
        System.out.println("1 ile 12 arasi bir ay numarasi giriniz");
        break;

        case 1:
            System.out.println("Girdiginiz ayda 31 gun vardir ");
            break;

            case 3:
                System.out.println("Girdiginiz ayda 31 gun vardir ");
                break;

            case 5:
                System.out.println("Girdiginiz ayda 31 gun vardir ");
                break;

            case 7:
                System.out.println("Girdiginiz ayda 31 gun vardir ");
                break;

            case 8:
                System.out.println("Girdiginiz ayda 31 gun vardir ");
                break;


            case 10:
                System.out.println("Girdiginiz ayda 31 gun vardir ");
                break;



            case 12:
                System.out.println("Girdiginiz ayda 31 gun vardir ");
                break;



        case 4:
            System.out.println("Girdiginiz ayda 30 gun vardir ");
            break;

            case 6:
                System.out.println("Girdiginiz ayda 30 gun vardir ");
                break;

            case 9:
                System.out.println("Girdiginiz ayda 30 gun vardir ");
                break;

        case 11:
            System.out.println("Girdiginiz ayda 30 gun vardir ");
            break;




    /*switch (ay) {
        case 1, 3, 5, 7, 8, 10, 12 -> System.out.println(ay + " 31 ceken aylardandir");
        case 4, 6, 9, 11 -> System.out.println(ay + " 30 ceken aylardandir");
        case 2 -> {
            System.out.print("Please enter a year: ");
            int year = sc.nextInt();
            Object subat = (year % 4 == 0) ? ay + " 29 ceker" : ay + " 28 ceker";
            System.out.println(subat);
        }
        default -> System.out.println("tekrar dene");  */




}




    }
}
