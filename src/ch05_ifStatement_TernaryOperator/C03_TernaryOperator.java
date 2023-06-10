package ch05_ifStatement_TernaryOperator;

public class C03_TernaryOperator {
    public static void main(String[] args) {


//Example 1: Bir sayinin pozitif olup olmadigini ekrana yazdiran kodu yaziniz

        int a = 3;

        if (a>0) {
            System.out.println("sayi pozitif");

        } else {
            System.out.println("sayi negatif");
        }
//Example 3: Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz
//           Pozitif sayilarin ve sifirin mutlak degeri kendileridir.
//           Negatif sayilarin mutlak degeri -1 ile carpilmis halleridir.

    int d = -1;

    int abs = d>0 ? d : -1*d;

    System.out.println(abs);


// TASK01 -> girilen bir tamsayının tek-çift olmasını kontrol eden code create ediniz.

} }

