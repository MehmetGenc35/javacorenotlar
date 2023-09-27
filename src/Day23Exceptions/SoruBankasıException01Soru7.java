package Day23Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SoruBankasıException01Soru7 {
    public static void main(String[] args) {
        try {
            FileInputStream f = new FileInputStream("src/daypackage/TextF!le");
        } catch(FileNotFoundException e) {
            System.out.println("Good");
        } catch(IOException e) {
            System.out.println("Bad");
        } finally {
            System.out.println("Not bad");
        }
    }
}
