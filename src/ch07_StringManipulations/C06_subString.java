package ch07_StringManipulations;

import java.util.Scanner;

public class C06_subString {

    public static void main(String[] args) {

/*
substring()
Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder

substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
indexi'e kadar parçayı return eder
baslangic indexi ==> inclusive/dahil
bitis indexi ==> eclusive/haric
 */


        String str = "calistikca daha cok sey bilmedigimi farkediyorum";
        System.out.println(str.substring(0, 5));
        // ilk girilen parametre dahildir, ikinci parametre dahil edilmez


        //TASK str datasinin son 12 karakterini print ediniz ("farkediyorum")

        System.out.println(str.substring(str.length() - 12));



        //TASK str datasinin ilk 10 karakterini print ediniz


        System.out.println(str.substring(0, 10));

        //TASK str datasinin sadece ilk karakterini print ediniz

        System.out.println(str.substring(0, 1));
        System.out.println(str.charAt(0));


        // TASK girilen 4 harfli kelimeyi tersten yan yana print eden code create ediniz

        Scanner input = new Scanner(System.in);
        System.out.println("4 harfli bir kelime gir");
        String str5 = input.nextLine();

        if(str5.length() != 4) {
            System.out.println("yanlis kelime girdin");
        } else {
            System.out.print(str5.substring(str.length() -1)); //son karakter alindi
            System.out.print(str5.substring(str.length() -2)); //sondan 2. karakter alindi
            System.out.print(str5.substring(str.length() - 3, str.length() - 2)); //sondan 3. karakter alindi
            System.out.print(str5.substring(str.length() - 4, str.length() - 3)); //sondan 4. karakter alindi

        }


       // String str2 = "abcd";
       //  System.out.println(str2.charAt(3) + str2.charAt(2) + str2.charAt(1) + str2.charAt(0));


    }
}
