package ch05_ifStatement_TernaryOperator.tasks05;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        //Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore ekrana yazdiriniz
        //0 - 4 => bebek
        //5 - 12 => cocuk
        //13 - 20 => genc
        //21 - 30 => yetiskin
        //Tanimlanmamis evre


        Scanner input = new Scanner (System.in);
        System.out.print("Lütfen bir deger giriniz: ");
        int age = input.nextInt();

        if (age >= 0 && age <= 4) {
            System.out.println("bebek");
        } else if (age >= 5 && age <=12) {
            System.out.println("cocuk");}
        else if (age >= 13 && age <=20) {
            System.out.println("genc");
        } else if (age >= 21 && age <=30) {
            System.out.println("yetiskin");}
        else {
            System.out.println("tanimlanmamis evre");}



        }
}
