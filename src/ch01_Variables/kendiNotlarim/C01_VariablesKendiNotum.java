package ch01_Variables.kendiNotlarim;

public class C01_VariablesKendiNotum {

    public static void main(String[] args) {

        String isim = "Fatih";
        //once data type yazilir. String, int, double, boolean etc
        //sonra variable name yazilir. Name, age etc.  //identifier ile variable name ayni seyi ifade eder
        //atama operatoru ile = deger atamasi yapilir
        //data tipine gore deger atamasi yapilir
        //son vurus olarak noktali virgul ; ile bitirilir

        int yas = 37; // yas isimli variable i int data typeinda tutularak 33 degeri atandi

        boolean ogrencimi = true; //boolean data tipi kendine has deger bekler, ya true ya false

        System.out.println(isim+" "+yas+" "+ogrencimi);
        System.out.println(yas);
        System.out.println("yas = " + yas);

        System.out.println(isim);
        System.out.println("isim = " + isim);
        System.out.println("yas = " + yas);
        System.out.println("ogrencimi = " + ogrencimi);

        //notes variable ismi yazilip noktaya basildiginda acilan pencereden soutv secilir

        //Variable nasil olusturulur?

        // 1) Access modifier 2)Data type 3)Variable ismi 4) = 5) Deger 6)

        //

        String name = "Rukiye Hanim";
        int age = 33;
        double salary = 25000;

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("salary = " + salary);


    }
}
