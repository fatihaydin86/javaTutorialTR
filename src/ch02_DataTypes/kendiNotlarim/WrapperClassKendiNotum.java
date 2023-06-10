package ch02_DataTypes.kendiNotlarim;

public class WrapperClassKendiNotum {

    public static void main(String[] args) {
        int sayi=7;
        System.out.println(sayi);
        System.out.println("sayi = " + sayi);

        Integer sayi2=7;
        System.out.println(Integer.toBinaryString(12));




        //Task -> iki farklı byte tanımlayıp toplam ve farkını print ediniz
        byte sayi3 = 100;
        byte sayi4 = 29;
        byte toplam = (byte) (sayi3 + sayi4);
        System.out.println("toplam = " + toplam);


        int sayi5 =10;
        double sayi6 = 10.5;
        System.out.println("(sayi5 + sayi6) = " + (sayi5 + sayi6));

        // Task ad ve soyadınızı ve yasınızı print ediniz.

        String adsoyad = "Fatih Aydin";
        int age = 37;

        String name = "Zeynep Hanim";
        int age2 = 33;

        System.out.println(name.toUpperCase()); //ZEYNEP HANIM

        Integer age3 = 35; //Integer wrapper class'indan age3 variable'i olusturuldu

        String number = "12345"; //bunu Integer'a ceviriniz


        String tc = "123456789";
        String id = "12345";

        System.out.println(tc+id); // Concat olur 12345678912345

        Integer.valueOf(tc);
        Integer.valueOf(id);

        int yeniTc = Integer.valueOf(tc);
        int yeniId = Integer.valueOf(id);

        System.out.println(yeniId+yeniTc); //123469134


        int idYeni = Integer.parseInt(id); //return type metodunun islem sonunda size donderdigi degerdir

        int tcYeni = Integer.parseInt(tc);

        System.out.println(idYeni+tcYeni);

        //valueOf(); Integer donderir return type olarak
        //parseInt(); int donderir return type olarak

        String okulNo = "12345AB";


        //Interview question: Hatalari nasil ayiklarsiniz?



        //TASK: byte short int max ve min degerlerini print eden code yaziniz. wrapper classlari kullanarak

        byte maxDegerByte = Byte. MAX_VALUE;
        byte minDegerByte = Byte. MIN_VALUE;

        System.out.println("maxDegerByte="+maxDegerByte);
        System.out.println("minDegerByte= "+minDegerByte);

        //Autoboxing

        boolean bPrimitive = true;
        Boolean bWrapper = bPrimitive;

        //boxing
        Integer numberWrapper = 55;

        //unboxing in java
        int numberPrimitive = numberWrapper;


        //java5 oncesinde hata verirdi, java 5 ile guncellendi










    }
}
