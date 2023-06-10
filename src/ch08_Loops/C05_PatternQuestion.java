package ch08_Loops;

public class C05_PatternQuestion {

    public static void main(String[] args) {

         /*
A
A B
A B C
A B C D
A B C D E
A B C D E F
şeklini yazdırınız.  65=A'nın ascıı değeri

*/

//hangi kattaysam, o kata o sayida daire koyacagim

        int harf = 65 ; // ascii degeri kullanilmasi icin create edildi

        for (int i = 1; i <=6; i++) {
            for (int j = 1; j <=i;  j++) {
                System.out.print((char)(harf + (j-1)) + " ");

            }
            System.out.println();  //dummy code: bos kod.isi sadece her icteki donguden sonra alt satira gecirmek


        }












    }
}
