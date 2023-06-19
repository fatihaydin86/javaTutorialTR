package ch11_Debugger;

import java.util.Scanner;

import static ch10_MethodCreation.C05_CRUD.cikis;

public class C02_Debugger {
    //to do: buradaki methodlari ayri bir class'a alin, switch case'leri ayri bir class'a alin ve buradan run edin

    static Scanner input = new Scanner(System.in);
    static String password = "1234a.";
    static double bakiye = 1000.25;
    static int count = 2; //kullanici yanlis girme hakki icin create edildi


    public static void main(String[] args) throws InterruptedException {

        //basit bir atm programi yaziniz
        // switch case, method creation (bakiye sorgulama, para yatira, para cekme ve cikis) ve diger konulari kullanarak yaziniz
        //hepsini ayni classta yapacagiz (normalde prensiplere aykiri)
        //su anda sadece tekli kullanici icin yapiyoruz

        sifreKontrol();


    }

    private static void sifreKontrol() throws InterruptedException {

        System.out.println(" **************************   ");
        System.out.println(" ****** Bankamiza hosgeldiniz ******  ");
        System.out.println("hosgeldiniz sifrenizi giriniz");

        String sifre = input.nextLine();

        while (count > 0) {
            if (sifre.equals(password)) {
                Thread.sleep(2000);
                System.out.println("*");
                Thread.sleep(2000);
                System.out.println("**");
                Thread.sleep(2000);
                System.out.println("***");

                System.out.println("sifre dogrulama basarili");

                anaMenu(); //sifre dogru ise ana menuye yonlendir
                break;
            } else {
                System.out.println("sifre eslesmedi tekrar dene");
                sifre = input.nextLine();
                count--;

                if (count == 0) {
                    System.out.println("kart bloke oldu");
                    break;
                     }



            }

        }


    }

    private static void anaMenu() {

        System.out.println("bakiye sorgulama icin 1 \npara yatirma icin 2 \npara cekme icin 3 \ncikis icin 4e basiniz");

        int secim = input.nextInt();

        switch (secim) {

            case 1:
               bakiyeSorgula();
                anaMenu();
                break;

            case 2:
              paraYatir();
                anaMenu();
                break;

            case 3:
             paraCekme();
                anaMenu();
                break;

            case 4:
                cikis();
                break;

            default:
                System.out.println("hatali secim yaptiniz tekrar deneyin");
                anaMenu();
                break;


        }


    }

    private static void paraCekme() {
        System.out.println("guncel bakiyeniz = " + bakiye);
        System.out.println("ne kadar cekmek istersin?");
        double cekMiktar = input.nextDouble();
        System.out.println("o kadar para elimizde yok");

        if (cekMiktar > bakiye) {
            System.out.println("bakiyen yetersiz");
        } else {
            System.out.println("cekmek istedigin Miktar = " + cekMiktar);
            System.out.println("bu tutari onayliyor musunuz?");
            //task: kullanicidan veri alip onaylarsa devam ettirin, onaylamazsa tekrar menuye yonlendirin
            // bos kodu, kullanicidan veri alarak

            bakiye -= cekMiktar;
            System.out.println("para cekme isleminden sonraki guncel bakiye = " + bakiye);
        }

    }

    private static void paraYatir() {
        System.out.println("guncel bakiyeniz = " + bakiye);
        System.out.println("ne kadar yatirmak istersin?");
        double yatirMiktar = input.nextDouble();
        bakiye += yatirMiktar;
        System.out.println("para yatirma isleminden sonra guncel bakiye = " + bakiye);




    }

    private static void bakiyeSorgula() {
        System.out.println("guncel bakiyeniz = " + bakiye);
    }


}
