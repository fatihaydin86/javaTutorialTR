package ch08_Loops.Tasks08_forLoop;

public class Odev04 {

    public static void main(String[] args) {



//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15


        int n = 6;

        for (int i = 1; i <= 5 ; i++) {

            for (int j = 1; j <= i ; j++) {

                System.out.print(i + " ");




            }

            System.out.println();
        }



    }
}
