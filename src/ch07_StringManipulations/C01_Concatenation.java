package ch07_StringManipulations;

public class C01_Concatenation {

    public static void main(String[] args) {
        String name = "Batu";
        String title = "SDET QA";
        int age = 30;
        System.out.println(name + title);
        System.out.println("name.concat(title) = " + name.concat(title));

        //String'i int'e nasil ceviririz?

        String number = "123456";
        System.out.println(number);
        System.out.println("number = " + number+1); //number=1234561

        //output 123457 olmali

        System.out.println("Integer.parseInt(number + 1) = " + Integer.parseInt(number + 1));




    }
}
