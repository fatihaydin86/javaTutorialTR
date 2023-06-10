package ch07_StringManipulations;

public class C02_Length {

    public static void main(String[] args) {

        String str = "clarusway ile java";
        System.out.println("str.length() = " + str.length()); //str.length() = 18
        // method parantezi bos ise, bu method parametresiz demektir

        int lengthOfStr = str.length();
        System.out.println("lengthOfStr = " + lengthOfStr);

      String str1 = "";
        System.out.println("str1.length() = " + str1.length()); // 0

        String str2 = " ";
        System.out.println("str2.length() = " + str2.length()); // 1

        String str3 = null;
        // System.out.println("str3.length() = " + str3.length());
        // Method invocation 'length' will produce 'NullPointerException'

        // System.out.println("str3.concat(str2) = " + str3.concat(str2));
        // Method invocation 'concat' will produce 'NullPointerException'

        String str4 = "null";
        System.out.println(str4.length()); // str.length() = 4

        String str5;
        // System.out.println("str4.concat(str5) = " + str4.concat(str5)); // Atama yapilmamis bir variable kullanilamaz

        // CTE System.out.println("str4.concat(str5) = str4.concat(str5));


    }
}
