package Day22MapExeption;

public class E05 {
    public static void main(String[] args) {
        int a=12;
        int b=0;
        String s="AliCan";
        getCharFromString(s,12,1);


    }
    //Try dan sonra çoklu catch kullanabiliriz sınırlandırma yoktur.
    //Çoklu catch kullandığınızda Exception claslar arasında parent-child ilişkisi yoksa catch lerin sıralamasının bir önemi yoktur.
    //Ama koddaki sıralamaya uymak daha readable dır.
    //Çoklu catch kullandığınızda Exception claslar arasında parant-child ilişkisi varsa catch lerin sıralamasının önemlidir. Child üstte olmak zorundadır.
    public static void getCharFromString(String s, int a,int b){
        try {
            int idx = a/b;
            char ch= s.charAt(idx);
            System.out.println(ch);
        }catch (ArithmeticException e) {
            System.out.println("Do not divide by Zero");
        }catch (IndexOutOfBoundsException e){
            System.out.println("olmayan index kullandınız");
        }
    }
}
