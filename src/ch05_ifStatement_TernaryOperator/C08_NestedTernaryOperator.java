package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C08_NestedTernaryOperator {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("urun miktarini gir");
        int urunMiktar = input.nextInt();

        System.out.println("urun birim fiyatini gir");
        int urunFiyat = input.nextInt();

        double fatura = urunMiktar > 100 ? (urunFiyat*urunMiktar*0.67) : (urunFiyat*urunMiktar);

        System.out.println("fatura = " + fatura);


    }
}
