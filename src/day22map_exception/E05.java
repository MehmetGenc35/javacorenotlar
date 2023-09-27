package day22map_exception;

public class E05 {
    public static void main(String[] args) {
        int a = 12;
        int b = 1;
        String s = "My Java";
        getCharFromString(s,a,b);

    }
    public static void getCharFromString(String s, int a, int b) {
        try {

            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println(ch);

        } catch (ArithmeticException e) {
            System.out.println("Do not divide by zero ");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Olmayan index kullandiniz");
        }
    }
    /*
    try kisminda birden fazla exception olusturma ihtimali olan kod varsa, coklu catch kullanabilirsiniz
    coklu catch kullandiginizda Excepiotn classlar arasinda  parent-child iliskisi yoksa catch lerin sirasi onemli degildir
    Ama koddaki siralamaya uymak tavsiye edilir
    coklu catch kullandiginizda Exception claslar arasinda parent child iliskisi varsa catchlerin sirasi önemli hale gelir
    ve chlid olan class ustte olmalidir
     */


}
