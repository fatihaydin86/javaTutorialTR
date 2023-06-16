package ch09_Break_Continue;

import java.util.Scanner;

public class C07_Task {

    public static void main(String[] args) {



        // task: girilen bir ifadedeki c karakterine kadar a karakter sayisini print eden code create ediniz


        Scanner input = new Scanner(System.in);

        System.out.println("bir ifade giriniz");

        String ifade = input.nextLine();

        int count = 0;


        for (int i = 0; i < ifade.length() ; i++) {
            if (ifade.charAt(i) == 'a') { count++;
            }

            if (ifade.charAt(i) == 'c') { break;}
        }

        System.out.println("a karakter sayisi= " + count);









    }
}
