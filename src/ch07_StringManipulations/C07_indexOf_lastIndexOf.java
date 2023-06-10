package ch07_StringManipulations;

import java.util.Scanner;

public class C07_indexOf_lastIndexOf {

    public static void main(String[] args) {
        /* indexOf()
       * char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
       * Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
        contains den farkı indexini verir, contains ise true false

      */

        String str = "all is well";
        System.out.println(str.indexOf('a')); // 0
        System.out.println(str.indexOf('l')); // 1 (karakterin ilk kullanildigi index)

        System.out.println(str.indexOf('L')); // -1

        System.out.println(str.indexOf("all")); // 0
        System.out.println(str.indexOf("is")); // 4
        System.out.println(str.indexOf("All")); // -1



        /** lastIndexOf()
         *  String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
         *  indexOf un sondan olan hali fakat index numaraları değişmez.
         *  lastIndexOf() Method'u index'i sorulan character'in son gorunumunun index'ini return eder.
         *  indexOf() methodunda birden fazla character'in index'i sorulursa ilk character'in index'i return edilir.
         */

        String name = "Jack Nicholson";
        System.out.println(name.indexOf('o')); // 9
        System.out.println(name.lastIndexOf('o')); // 12

        System.out.println(name.indexOf('h')); // 8
        System.out.println(name.lastIndexOf('h')); // 8

        System.out.println(name.indexOf('n', 8)); // 13



        /*
task
 Girilen cümlenin aşağıdaki durumları sağlayacak code create ediniz

 1-Girilen cumle java icermiyor
 2-Girilen cumle 1 tane java iceriyor
 3-Girilen cumlede birden fazla java var
 */

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine().toLowerCase();


        if (sentence.indexOf("java") == -1) {
            System.out.println("Girilen cumle \"java\" icermiyor"); }
        else if (sentence.indexOf("java") == sentence.lastIndexOf("java"))
        { System.out.println("Girilen cumle 1 tane \"java\" iceriyor");}

        else {
            System.out.println("Girilen cumle birden fazla \"java\" iceriyor");}









        }
}
