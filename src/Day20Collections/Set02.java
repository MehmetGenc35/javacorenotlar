package Day20Collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Set02 {
    public static void main(String[] args) {

        long t1= System.nanoTime();
        //1.Yol
        TreeSet<String> emails= new TreeSet<>();
        emails.add("k@gmail.com");
        emails.add("a@gmail.com");
        emails.add("z@gmail.com");
        emails.add("l@gmail.com");
        emails.add("u@gmail.com");
        emails.add("p@gmail.com");
        emails.add("g@gmail.com");
        emails.add("b@gmail.com");
        emails.add("t@gmail.com");
        emails.add("x@gmail.com");
        System.out.println(emails);

        long t2= System.nanoTime();
        //2.Yol
        HashSet<String> emailsHash= new HashSet<>();
        emailsHash.add("k@gmail.com");
        emailsHash.add("a@gmail.com");
        emailsHash.add("z@gmail.com");
        emailsHash.add("l@gmail.com");
        emailsHash.add("u@gmail.com");
        emailsHash.add("p@gmail.com");
        emailsHash.add("g@gmail.com");
        emailsHash.add("b@gmail.com");
        emailsHash.add("t@gmail.com");
        emailsHash.add("x@gmail.com");
        System.out.println(emailsHash);

        TreeSet<String> emailsHsTs= new TreeSet<>(emailsHash);
        System.out.println(emailsHsTs);

        long t3= System.nanoTime();

        System.out.println(t2-t1);//treeset
        System.out.println(t3-t2);//hashset


    }
}
