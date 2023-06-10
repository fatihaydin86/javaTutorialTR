package ch08_Loops;

public class C01_forLoop {

    public static void main(String[] args) {


        // task: 33 defa java iyidir yazin

        for (int i = 0; i < 3; i++) {
            System.out.println(i+" = java iyidir");

            for (int j =0; j<4; j++) {
                System.out.println("ali veli");
            }

        }

        //int data type
        //i variable name ve sartin sinirlarini belirler
        //i++ ise her seferinde i'yi bir artir demek




//task 2: 2 basamakli tek sayilari yan yana print eden code create ediniz

        for (int i = 11; i <=99 ; i+=2) {
            System.out.print("i="+i+" ");

        }

        System.out.println("\n\t*********");


        int j ;
        for (j=10; j<100; j++) {
            if (j%2==1) {
                System.out.print("j="+j+" ");
            }
        }



//calismayan loop
        for (int i = 1; i >10 ; i++) {//condition 'i>10 is always 'false'
            System.out.println("calismayan loop");

        }


        //ram yakan sonsuz loop

      /*  for (int i = 0; i >=0 ; i++) {
            System.out.println("sonsuz loop");

        } */






    }
}
