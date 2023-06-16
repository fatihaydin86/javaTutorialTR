package ch10_MethodCreation;

import java.util.Scanner;

public class C03_MethodCreation {

    public static void main(String[] args) {


        // task-> girilen tam sayının rakamları toplamını print eden METHOD create ediniz

        Scanner input = new Scanner(System.in);
        System.out.println("bir tamsayi gir");
        int sayi = input.nextInt();

        System.out.println("rakamlarToplami(sayi) = " + rakamlarToplami(sayi)); //method call edildi

    }

    public static int rakamlarToplami(int x) {

        int rakamlarToplami = 0;

        while (x > 0) { // x 0'dan buyuk oldugu muddetce calis

            rakamlarToplami += x % 10; //sayinin son basamagi

            x /= 10; //her dongude 10'a bolunecek ve bir onceki basamak atilmis olacak int sayesinde


        }
        return rakamlarToplami;
    }


}
