package Day24EnumİteraterLambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators {
    public static void main(String[] args) {
        /*
1) Iterator lar loop ların yaptığı aynı işi yapar
2) Iterator larda sonsuz loop oluşma ihtimali yoktur
3) Iterator lar ile looplar arasında performans farkı yoktur
4) Iterator lar bir collection eleman silme ve bir coollection daki elemanı değiştirme konusunda daha başarılıdır
5)İki tip Iterator vardır;
    a) Iterator:
        Sadece eleman silmede kullanılır, eleman eklemek veya elemanı değiştirmek mümkün değildir.

    b) ListIterator:
        Eleman silebilir, ekleyebilir ve değiştirebilir

      Note==>
        Interator sadece soldan sağa ( ilk eleman son elemana) çalışır
        ListIterator iki yönlü çalışabilir
 */

        List<String> myList= new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Fatma");
        myList.add("Mustafa");

        System.out.println(myList);

        Iterator<String> myItr =  myList.iterator();//[ Tom,     Jim,    Clara,   Fatma,  Mustafa]
        //hasNext() pointer a senden sonra eleman varmi diye sorar, eleman varsa true yosa false return eder
        while (myItr.hasNext()){
            //next() pointer i bir sonraki elemanin onune tasir ve ustunden atladigi elemani return eder
            myItr.next();
            //remove() methodu next() methodunun return ettigi elemani siler
            myItr.remove();

        }
        System.out.println(myList);

        //ListIterator
        List<String> yourList = new ArrayList<>();
        yourList.add("Ali");
        yourList.add("Can");
        yourList.add("Aliye");
        System.out.println(yourList);//[Ali, Can, Aliye]

        ListIterator<String> yourListItr = yourList.listIterator();//[  Ali,     Can,    Aliye]

        while (yourListItr.hasNext()){

            String el=  yourListItr.next();
            yourListItr.set(el+"*");
        }
        System.out.println(yourList);


        List<String> list3 = new ArrayList<>();
        list3.add("Ali");
        list3.add("Can");
        list3.add("Aliye");
        System.out.println(list3);//[Ali, Can, Aliye]

        ListIterator<String> listItr2=list3.listIterator();
        //Bu loop pointerı en sağa almak için yazıldı
        while (listItr2.hasNext()){
            listItr2.next();
        }
        while (listItr2.hasPrevious()){
            String el= listItr2.previous();
            System.out.println(el+" <--");
        }



    }
}
