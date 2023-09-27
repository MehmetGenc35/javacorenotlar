package Day22MapExeption;

public class E02 {
    public static void main(String[] args) {
        String s="123a"; // İnt e cevirirken NumberFormatException: hatası verir
        convertStringToInt(s);

     //İçinde rakamlar dışında bir karakter olan stringi sayıya çevirmek isterseniz JAVA "NumberFormatException" atar.
    }
    public static void convertStringToInt(String s){
        try{
            int intS= Integer.valueOf(s);
            System.out.println(intS+1);
        }catch (NumberFormatException e){
            System.out.println("Bu string sayıya çevrilmesi için rakam dışı bir sembol yada harf olmamalıdır...");
            System.out.println(e.getMessage()); //For input string: "123a"
        }

    }

}
