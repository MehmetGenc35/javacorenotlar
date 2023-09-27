package day16staticoop;

import java.time.LocalDate;

public class StaticBlock {

    //Bir variable olusturdugunuzda deger atamazsaniz o variable i initialize etmediniz demektir.
    static double pi;

    //Bazen main method calistirilmadan once variable larin hazir hale getirilmesi gerekebilir
    //bu yuzden static block lar kullanilir
    //static variable lar static blocklar icinde initialize edilirse o classin icinde herseyden once
    //hazir hale getirilmis olur
    public static int price;


    public static void main(String[] args) {

        System.out.println(pi);
        System.out.println("main method");
    }


    //birden fazla static block  var ise yukaridan asagiya calisir
    static {
        System.out.println("static block 2");

        LocalDate currentDate = LocalDate.now();
        if(currentDate.getMonthValue()==2){
            price=1000;
        }else {
            price=2000;
        }
    }

    static {
        pi = 3.14;
        System.out.println("static block 1");
    }

}
