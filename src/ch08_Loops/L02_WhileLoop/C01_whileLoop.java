package ch08_Loops.L02_WhileLoop;

import java.util.Scanner;

public class C01_whileLoop {

    public static void main(String[] args) {



        // task01-> 11 den 20'ye kadar olan tamasayıları print eden code create ediniz...


        System.out.println("******* for ile cozum ***************");

        for (int i = 11; i < 20 ; i++) {
            System.out.print(i + " ");

        }

        System.out.println();

        System.out.println("******* while ile cozum ***************");

        int sayi = 11;

        while (sayi < 20) { System.out.print(sayi + " ");
            sayi++;

        }

        System.out.println();

//task02-> 7 kere javaCAN print eden code create ediniz...


        int count = 1;

        while (count < 8) { System.out.println(count + "." + "javaCAN");

            count++;
        }

        System.out.println();

// task03-> 2 basamaklı tek sayıları yanyana print eden code create ediniz

        int count2 = 11;

                while (count2 < 100 && count2%2==1) { System.out.println(count2);

                    count2+=2;
                }



        System.out.println();

        int count3 = 11;

        while (count3 < 100 ) { if (count3%2==1) { System.out.println(count3);


        }
            count3++;

        }

        System.out.println();

        // task04-> girilen metni while loop ile  tersden print eden code create ediniz

       /*  Scanner input = new Scanner (System.in);
        System.out.println("bir metin giriniz");

        String metin = input.nextLine();
        int length = input.nextLine().length();
        int index = length - 1;

        while (index >= 0) {
            System.out.println(metin.charAt(index));

            index--

        }


        for (int i = metin.length()-1; i >=0 ; i--) {

            System.out.println(metin.charAt());

        }

*/




// task05: girilen tamsayiya kadar tamsayilarin toplamini print eden code create ediniz


        Scanner input = new Scanner (System.in);
        System.out.println("bir sayi giriniz");

        int sayi3 = input.nextInt();
        int total = 0;

        while (sayi3 > 0) { total += sayi3;

            sayi3--;
        }











// task06: girilen tamsayinin faktoriyelini print eden code create ediniz

/*
        System.out.println("bir sayi giriniz");

        int sayi4 = input.nextInt();
        int factorial = 1;

        while (sayi4 > 0) { factorial *= sayi4;
            sayi4--;

        }

*/






        }


}
