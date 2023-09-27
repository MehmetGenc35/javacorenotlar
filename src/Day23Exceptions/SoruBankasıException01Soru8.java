package Day23Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SoruBankasıException01Soru8 {
    public static void main(String[] args) {
        try {
            FileInputStream f = new FileInputStream("src/daypackage/TextF!le");
            int i = 0;
            while ((i = f.read())!= -1) {
                System.out.print((char) i);
            }
            f.close();
        } catch(FileNotFoundException e) {
            System.out.println("Most probably path !s wrong or someone deleted my f!le");
        } catch(IOException e) {
            System.out.println("Text could not be read or the f!le could not be closed");
        } finally {
            System.out.println("Do not forget to close the f!le!");
        }
    }
}
