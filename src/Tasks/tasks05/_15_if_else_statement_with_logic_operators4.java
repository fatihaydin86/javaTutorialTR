package ch05_ifStatement_TernaryOperator.tasks05;

public class _15_if_else_statement_with_logic_operators4 {

    public static void main(String[] args) {

        /*   String number oluşturulmuştur.
             Eğer String € karakterini kapsıyorsa "This is euro" yazdırın.
             Eğer String $ karakterini kapsıyorsa "This is dollar" yazdırın.
             Aksi halde (else) "no money" yazdırın.   */


        String str = "100 $";

        if (str.contains("$")) {
            System.out.println("this is dollar");
        } else if (str.contains("€")) {
            System.out.println("this is euro");
        } else System.out.println("no money");


    }
}
