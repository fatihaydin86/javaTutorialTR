package ch08_Loops.L01_ForLoop;

public class C03_nested_forLoop {

    public static void main(String[] args) {

        /*
eger bir döngünün baody'sinde başka  bir döngü bulunuyorsa bu tür döngülere nested-loop->
içiçe döngü denir
İç döngü dış döngünün her adımda tekrar çalışır.
içiçe döngülerde en içteki döngü en önce çalışır..
 */



// task: kat daire ornegi ile nested for loop yapiniz. Kat sayisi:10, her katta 4 daire

        int kat;
        for (kat = 1; kat <= 10; kat++) {
            System.out.println("kat no: " + kat);

            int daire;

            for (daire = 1; daire <= 4 ; daire++) {
                System.out.println("daire no: " + daire);

            }

        }










    }
}
