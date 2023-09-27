package Day20Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Set01 {
    public static void main(String[] args) {
        /*
        1)Setler tekrarsız eleman (unique) depolamak için kullanılır.
        2)3 tane Set class ı vardır.
            a)HashSet Class
                HashSet= Benzersiz Id oluşturma tekniğidir. Bu tekniğe "hashing tecnique" denir
                Hashset elemanları rastgele sıralar.
                HashSet elemanları sıralamadığı için çok hizlı çalışır.
                HashSetler null ı eleman kabul eder.
            b)LinkedHashSet Class
                LinkedHAshSetler elemanları bizimverdiğimiz sıraya göre dizdiklerinden(insertion order) HashSetlere göre yavaştır.
            c)TreeSet Class
                TreeSet elemanları natural order a göre dizerler ve bu nedenle çok yavaştırlar.
         3)TreeSet çok yavaş olduğundan mümkün olduğunca kullanmamaya çalışırız.
        */
        HashSet<String> hs= new HashSet<>(); // tekrarsız tutabileceğim bir yapı oldu
        hs.add("Sinan");
        hs.add("Kerem");
        hs.add("Tuğba");
        hs.add("Onur");

        System.out.println(hs);//[Kerem, Tuğba, Sinan, Onur]
        hs.add("Tuğba");       // tekrarlı elemanları eklerken hata vermez ama yazdırırken eklemez
        System.out.println(hs);//[Kerem, Tuğba, Sinan, Onur]
        hs.add(null);
        System.out.println(hs);

        LinkedHashSet<Integer> lhs= new LinkedHashSet<>();
        lhs.add(5);
        lhs.add(24);
        lhs.add(313);
        lhs.add(111);
        lhs.add(0);
        lhs.add(null);

        System.out.println(lhs);

        LinkedHashSet<Integer> ls= new LinkedHashSet<>();
        ls.add(313);
        ls.add(19);
        ls.add(17);
        ls.add(11);

        System.out.println(ls);

        lhs.retainAll(ls);
        System.out.println(lhs);
        System.out.println(ls);

        TreeSet<Character> ts= new TreeSet<>();
        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
        //ts.add(null); ==> null ı eleman olarak kabul etmezler

        System.out.println(ts);

        System.out.println(ts.subSet('G', 'U'));


    }
}
