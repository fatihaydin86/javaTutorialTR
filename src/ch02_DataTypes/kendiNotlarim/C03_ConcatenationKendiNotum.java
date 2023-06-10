package ch02_DataTypes.kendiNotlarim;

public class C03_ConcatenationKendiNotum {

    public static void main(String[] args) {


        char ch = 'A';
        char ch2 = 'C';

        System.out.println(ch + ch2);//132  iki harfin ASCII degerlerinin toplami

        System.out.println('A' + 'C'); //132


        System.out.println("A" + "B"); //AB CIFT TIRNAK STRING OLDUGU ICIN JAVA BU IKI IFADEYI CONCAT EDER (BIRLESTIRIR)

        String name = "Zeynep hanim";

        String lastName = "Fitnat";


        int a = 7;
        int b = 11;

        System.out.println(name + lastName + a+b); // Zeynep hanimFitnat711
        //stringden sonrasini, tamsayi olsa bile concat eder

        System.out.println(a + name + lastName + b); //7Zeynep hanimFitnat

        System.out.println(a+b + name + lastName); //18Zeynep hanimFitnat

        //baslangic int degerler oldugu icin java once bunlari toplama islemine alir. string gordukten sonrakileri concat eder

        System.out.println(name + lastName + (a+b)); //Zeynep hanimFitnat18

        System.out.println(name + (a - b) + (a-b)); //Zeynep hanim-4-4

        System.out.println(name + ( (a-b) + (a-b) )); //Zeynep hanim-8

        char num = '1';

        System.out.println(name + num); //Zeynep hanim1

        System.out.println(a+num+name); //56Zeynep hanim
        //'1'in ASCII degeri 49. yukarida 7+49=56 islem sonucu alindi
        //int+char olursa sonuc toplama islemine gore deger alinir, char'in ASCII degeriyle

        System.out.println(name+(num+b)); //Zeynep hanim60

        System.out.println(a+name+num); //7Zeynep hanim1









    }
}
