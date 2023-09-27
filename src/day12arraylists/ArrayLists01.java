package day12arraylists;

import java.util.ArrayList;

public class ArrayLists01 {
    public static void main(String[] args) {

        ArrayList<Integer> ages = new ArrayList<>();

        //ArrayListlere eleman nasil eklenir?
        ages.add(9);
        ages.add(12);
        ages.add(10);
        ages.add(1, 656);
        ages.add(3, 777);
        ages.add(888);

        //ArrayListlere coklu eleman nasil eklenir?
        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(1);
        newAges.add(2);
        newAges.add(3);
        System.out.println(newAges);

        ages.addAll(newAges);
        ages.addAll(0, newAges);

        System.out.println(ages);//[1, 2, 3, 9, 656, 12, 777, 10, 888, 1, 2, 3]

        int numOfelement = ages.size();
        System.out.println(numOfelement);//12

        int el = ages.get(1);
        System.out.println(el);//2

        ages.set(1, 313);
        System.out.println(ages);


        //Örnek 1: Bir Integer ArrayList oluşturun ve tek olanları 11 olarak değiştirin

        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(24);
        list.add(12);
        list.add(9);
        list.add(3);
        System.out.println(list);//[23, 24, 12, 9, 3]

                                //[23, 24, 12, 9, 3]
        for (Integer w : list) {

            if(w%2!=0){
                list.set(list.indexOf(w),11);

            }
        }
        System.out.println(list);

    }
}
