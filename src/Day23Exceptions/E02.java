package day23exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E02 {
    public static void main(String[] args) {

        /*
        1) FileNotFoundException ve IOException Compile Time Exception lardir. yani codu yazarken hata aliriz
        2) FileNotFoundException path in dogrulugu ve dosyanin varligi ile ilgilidir
            IOException tum input ve output islemleri ile ilgilidir
        3) IOException Classs, FileNotFoundException classin parent idir
            istenirse FileNotFoundException yerin IOException da kullanilabilir
        4) IOExcepton Class ve FileNotFoundException beraber kullanilacak ise FileNotFoundException üstte olmalidir
         */


        try {
            FileInputStream fis = new FileInputStream("src\\main\\java\\day23exceptions\\file.txt");
            int k =0;
            while ( (k=fis.read())!=-1 ){
                System.out.print((char)  k);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
