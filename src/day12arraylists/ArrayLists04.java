package day12arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLists04 {
    public static void main(String[] args) {

        //Bir list olusturmak icin kısa yol
        List <Integer> list = Arrays.asList(4,5,13,313,353);
        System.out.println(list);//[4, 5, 13, 313, 353]

       // list.remove(0);
       // list.add(63);
       // list.clear();

        /*
        Note : Arrays.asList() methodunu kullanarak bir list olusturursaniz
        listin eleman sayisini degistiren methodlari kullanamazsiniz
        //ornegin remove(), add(), clear() kullanilmaz
        ama set() kullanabilirsiniz

         */
        list.set(1,63);
        System.out.println(list.size());//
        System.out.println(list);



    }
}
