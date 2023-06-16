package ch10_MethodCreation;

import java.util.Scanner;

public class C06_RecursiveMethod {

    public static void main(String[] args) {

 /*
Recursive  call edildiğinde run time'da programa ekstradan yük getiren bir yapıdadır
çünkü bir fonksiyon kendi kendini çağırdığında her çağırmada yığında (stack) bir işlem gerçekleşir ve bir bellek
 konumu oluşur.
Bu yüzden özyineleme ile yapılan hesaplamalar daha yavaş ve verimsizdir.
Peki özyinelemeyi neden kullanıyoruz?
Bazı karmaşık çözülmesi güç problemlerde döngülere göre daha kısa ve anlaşılır olduğu için.
 */

        //Task kullanicidan aldiginiz sayinin faktoriel ini hesaplayan method create ediniz


        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi gir");
        int sayi = input.nextInt();


        System.out.println("factorial(sayi) = " + factorial(sayi));


    }


    public static int factorial (int sayi) {

        if (sayi>=1) {
            return sayi * factorial(sayi -1);

            // 5*4!=5*4*3!=5*4*3*2!

        } else return 1; // sifirin factorial'i 1 oldugu icin

        /*
        loop ile cozumun

        .....

         */

        }








}
