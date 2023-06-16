package ch08_Loops.L02_WhileLoop.Tasks08_whileLoops;

public class Task04 {

	public static void main(String[] args) {
		/*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden code create ediniz.

		 */

		System.out.println("for cozumu");

		System.out.println();

		int count = 0;
		for (int i = 1000; i >= 100 ; i--) { if (i%4==0 && i%6==0) {
			System.out.println(i);
			count++ ;

		}

		}

		System.out.println("\n");

		System.out.println(count+" tane sayi vardir");




		System.out.println("\n");

		System.out.println("while cozumu");

		int count2 = 0;
		int i2 = 999;

		while (i2>= 100) { if (i2%4==0 && i2%6==0) {
			System.out.println(i2);
			i2--;
			count2++ ;

		}
			
	}

		System.out.println("\n");

		System.out.println(count2+" tane sayi vardir");



}

}