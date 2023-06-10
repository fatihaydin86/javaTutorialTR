package ch03_ScannerClass_TypeCasting.kendiNotlarim;

public class TypeCastingKendiNotum {

    public static void main(String[] args) {

        boolean basariliMi = true;
        //CTE String basari = basariliMi; dogal uyum olmadigi icin hata verir

        String basari = String.valueOf(basariliMi); //boolean olan bir degeri String'e cevirdi
        System.out.println("basari: " + basari); //basari = true

double d = 17; //double container'ina int olan 17 degeri atandi. Auto widening yapildi

        System.out.println("d = " + d); //17.0

        int sayi1=33;
        int sayi2=4;

        System.out.println("sayi1/sayi2 = " + (sayi1 / sayi2));
        //sonuç tamsayı olmasa da int olduğu için virgül sonrasını vermez

        byte  by = 127;
        int  number = by;
        //kucuk kutuyu buyuk kutuya ekledik
        //dolayisiyla otomatik olarak cast eder


        int num= 123;
        double d1=14;
        double d2= d1/num;
        System.out.println("d2 = " + d2);

        double db1= 14.66;
        int i = (int) db1; //buyuk olan kutu kucuk olan kutuya eklenmeye calisildi
        //explicit narrowing
        System.out.println("db1 = " + db1);

        int num3=150;
        byte by1 = (byte) num3;
        System.out.println("by1 = " + by1);




    }
}
