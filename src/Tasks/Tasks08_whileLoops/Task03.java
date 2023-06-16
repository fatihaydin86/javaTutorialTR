package ch08_Loops.L02_WhileLoop.Tasks08_whileLoops;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		/*

        task-> girilen  tamsayı için carpim tablosunu print eden code create ediniz.

		 Ornek input = 13
		 13x1=13 13x2=26  . . .. .  . 13x10=130
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("bir tamsayi giriniz");

		int sayi = input.nextInt();

		System.out.println();

		System.out.println("for cozumu");

		System.out.println();

		for (int i = 1; i <= 10 ; i++) {
			 // String s = (sayi * i) + "= ";

			System.out.print(sayi + "*" + i + "=" + sayi*i + " ");

		}


		System.out.println("\n");

		System.out.println("while cozumu");

		System.out.println();

		int i = 1;

		while (i<= 10) {
			System.out.print(sayi + "*" + i + "=" + sayi*i + " ");
			i++;
		}





	}

}
