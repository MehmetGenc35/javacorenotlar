package Day22MapExeption;

public class E03 {
    public static void main(String[] args) {
        String s= "Java";
        getCharFromString(s,2); //v index hatası vermedi

        getCharFromString(s,4); //StringIndexOutOfBoundsException(String sınırların dışına çıktın): index olmadığı için bu hatayı verdi
                                    //String index out of range: (aralığın dışında bir index girdin)


    }
    public static void getCharFromString(String s, int idx){

        try {
            char ch=s.charAt(idx);
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("Olmayan index girdiniz==>"+ e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
            System.out.println("Kod durmadı devam etti");
        }

    }
}
