package day06switchternarystring;

public class Ternary01 {
    public static void main(String[] args) {

        //Ornek : Bir sayinin mutlak degerini hesaplayan kodu yaziniz.
        //           -4 ==> -1*-4        4 ==> 4        0 ==> 0

        int c = 4;

        int result = c < 0 ? -1 * c : c;
        System.out.println(result);

        //Ornek: Iki sayinin isareti ayni ise bu sayilari carpan,
        //isaretleri farkli ise "Farkli isaretli sayilari carpamiyorum"
        // mesaji veren kodu yaziniz.

        int a = 3;
        int b = 13;
        // condition                   ?      ilk cikti   :   ikinci cikti    ;


        Object result2 = (a > 0 && b > 0) || (a < 0 && b < 0) ? a * b : "Farkli isaretli sayilari carpamiyorum";
        //"Object" javada butun Non-primitive" Data type larinin (Class) ortak parent idir.
        //"Object" classin parenti yoktur
        System.out.println(result2);


    }
}
