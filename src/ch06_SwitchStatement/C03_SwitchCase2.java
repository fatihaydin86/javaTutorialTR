package ch06_SwitchStatement;

import java.util.Scanner;

public class C03_SwitchCase2 {

    public static void main(String[] args) {

        // TASK -> kullanıcının girdiği yılın ay sırasına göre ayın ismini print eden code create ediniz

        Scanner input = new Scanner(System.in);
        System.out.println("ay numarasi gir");
        int ayNo = input.nextInt();

        switch (ayNo) {
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Subat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayis");
                break;
            case 6:
                System.out.println("Haziran");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Agustos");
                break;
            case 9:
                System.out.println("Eylul");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("Kasim");
                break;
            case 12:
                System.out.println("Aralik");
                break;
            default:
                System.out.println("0 12 arasi bir ay numarasi girmelisin");







        }






    }
}
