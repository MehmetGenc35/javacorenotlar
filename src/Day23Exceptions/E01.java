package day23exceptions;

import java.io.FileInputStream;//input output
import java.io.FileNotFoundException;
import java.io.IOException;

public class E01 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("src\\main\\java\\day23exceptions\\file.txt");
        int k =0;
        while ( (k=fis.read())!=-1 ){
            System.out.print((char)  k);

        }
    }
            /*
        1)Run Button'a bastiktan sonra console da alinan Exception lara Runtime Exception denir
          ArithmeticException, NullPointerException vs...
          RunTime Exception lara Unchecked Exception da denir.

        2) Code yazarken kirmizi alt cizgi seklinde alinan Exceptionlar da vardir. Bunlarada Compile Time Exception
        denir,  Compile Time Exception lara Checked Exception da denir.

        interview sorusu
        throw ile throws arasindaki farklar nelerdir?
        1) throw method bodysi icinde, throws ise method parantezinden sonra kullanilir
        2) throw method bodysi icinde istenilen yerde istenildigi kadar kullanilabilir
           throws ise method signature dan hemen sonra ve sadece bir kere kullanilabilir
        3) throw dan sonra new keywordu ve constructor kullanarak object olusturulur
           throws dan sonra ise sadece Exception class ismi yazilir
        4) throw belli sartlar icin Exception firlatmada kullanilir
            throws ise bir methodun belli bir Exception u firlatabileceğini belirtmek icin kullanilir

          */
}
