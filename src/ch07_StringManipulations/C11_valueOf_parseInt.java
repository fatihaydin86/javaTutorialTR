package ch07_StringManipulations;

public class C11_valueOf_parseInt {

    public static void main(String[] args) {



        // task -> string type verilen iki adet bagıs miktarını toplayan code create ediniz..


        String bagis1="20000";
        String bagis2="15000";

        int yeniBagis1= Integer.valueOf(bagis1);
        int yeniBagis2= Integer.valueOf(bagis2);

        int toplam = yeniBagis1+yeniBagis2;
        System.out.println("toplam = " + toplam);


        String donation1 = "  150000   ".trim();
        String donation2 = "  200000   ".trim();

        System.out.println(donation1 + donation2);

        int d1 = Integer.valueOf(donation1);
        System.out.println("d1 = " + d1);

        int d2 = Integer.valueOf(donation2);
        System.out.println("d2 = " + d2);

        int d3 = d1+d2;

        System.out.println("d3 = " + d3);

        System.out.println("d1+d2 = " + d1 + d2);

        System.out.println("(d1+d2) = " + (d1 + d2));



        //parseInt ile cozum

        int d11 = Integer.parseInt(donation1);
        System.out.println("d11 = " + d11);

        int d22 = Integer.parseInt(donation2);
        System.out.println("d22 = " + d22);

        // valueOf nonprimitive INTEGER (wrapper class) return eder. parseInt primitive return eder


        System.out.println("d11+d22 = " + d11 + d22);

        System.out.println("(d11+d22) = " + (d11 + d22));


        int i1 = 27;
        int i2 = 46;
        int i3 = i1+i2;

        System.out.println("(i1+i2) = " + (i1 + i2));
        System.out.println("i3 = " + i3);
        System.out.println("i1+i2 = " + i1 + i2);




            //Challenge 4'ten
            /* String str1 = "13.54"
              double str1indoubleHali = Double.parseDouble(str1); */





    }
}
