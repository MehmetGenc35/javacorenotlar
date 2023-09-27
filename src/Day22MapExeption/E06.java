package Day22MapExeption;

public class E06 {
    public static void main(String[] args) {
        String s="Java";
        getNumberOfChars(s);

        String t="";
        getNumberOfChars(t);

        String u=null ;      // NullPointerException hatası verir
        getNumberOfChars(u);





    }
    //String değeri null olduğu zaman String metotlarını kullanamazsınız java "NullPointerException" atar
    public static void getNumberOfChars(String s){
        try {
            int numOfChars= s.length();
            System.out.println(numOfChars);
        } catch (NullPointerException e) {
            System.err.println("Null değeri için String metotlar kullanılamaz");
        }
    }
}
