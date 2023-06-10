package ch04_JavaOperators.jo01_ArithmeticOperators;

public class C02_IncrementDecrementKendiNotum {

    public static void main(String[] args) {

        int number = 7;

        //pre increment
        System.out.println(++number); //8

        System.out.println("number = " + number); //8


        //post increment
        System.out.println(number++); //Ekranda 8, hafizada 9


        System.out.println("number = " + number); //9  post increment sonrasi deger  guncellendi

        System.out.println(number++ + ++number); //20  (9+11)

        System.out.println("number = " + number); //number = 11

        System.out.println(number++ + number++); //23  (11+12)










    }
}
