package Day23Exceptions;

public class SoruBankasıException01Soru6 {
    public static void main(String[] args) {
        String s2 = null;
        try{
            System.out.println(s2.length());
            System.out.print("Good");
        }catch(NullPointerException e) {
            System.out.print("Better");
        }
    }

}
