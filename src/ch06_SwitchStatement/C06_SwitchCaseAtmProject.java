package ch06_SwitchStatement;

import java.util.Scanner;

public class C06_SwitchCaseAtmProject {

    //database mantiginca bankada tutulan password create edin
    static String password = "12345"; //kullanicinin bankada kayitli olan sifresi

    public static void main(String[] args) {

         /*
Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme,
 çıkış işlemlerinin yapıldıgı bir
 ATM app. code create ediniz
 */

        Scanner input = new Scanner(System.in);
        System.out.println("******** Java Bank Atm sine hosgeldiniz *******");

        System.out.println("sifrenizi giriniz");
        String sifre = input.nextLine();

        if (sifre.equals(password)) {
            System.out.println("sifreniz eslesti devam edebilirsiniz");

            System.out.println("bakiye sorgulama icin 1 \npara yatirma icin 2 \n" + "paracekme icin 3 \ncikis icin  4 tuslarina basiniz");

            int secim = input.nextInt();
            //baslangic bakiyesi create edildi
            int bakiye = 1000;

            switch (secim) {
                case 1:
                    System.out.println("bakiye = " + bakiye);
                    break;

                case 2:
                    System.out.println("ne kadar yatirmak istersin");
                    int yatirilacakMiktar = input.nextInt();
                    bakiye += yatirilacakMiktar;
                    System.out.println("guncel bakiyeniz = " + bakiye);
                    break;

                case 3:
                    System.out.println("ne kadar cekmek istersin");
                    int cekilacakMiktar = input.nextInt();
                    if (cekilacakMiktar <= bakiye) {//bakiyenin yeterli olma senaryosu
                        bakiye -= cekilacakMiktar;
                        System.out.println("cekilen miktar = "+cekilacakMiktar);
                        System.out.println("guncel bakiyeniz = " + bakiye);

                    } else {
                        System.out.println("bakiyen yetersiz oldugu icin cekme isleminiz basarisiz bakiyeniz = " + bakiye);
                    }
                    break;

                case 4:
                    System.out.println("cikis yapiyorsunuz yine bekleriz");
                    break;

                default:
                    System.out.println("hatali bir secim yaptiniz");
                    break;


            }


        } else System.out.println("hatali sifre girdiniz 2 hakkiniz kaldi");







    }
}
