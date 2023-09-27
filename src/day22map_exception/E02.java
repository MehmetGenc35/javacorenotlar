package day22map_exception;

public class E02 {

    public static void main(String[] args) {

        String s ="1234a";
        convertStringToInt(s);

    }
    //Icinde rakamlar disinda bir character olan stringi sayiyia cevirmek isterseniz java NumberFormatException atar
    public static void convertStringToInt(String s){

        try{
            int intS= Integer.valueOf(s);
            System.out.println(intS + 1 );

        }catch (NumberFormatException e){

            System.out.println("Bir stringin sayiya donusturulebilmesi icin rakam disi character icermemesi gerekir");
            System.out.println(e.getMessage());
        }

    }




}
