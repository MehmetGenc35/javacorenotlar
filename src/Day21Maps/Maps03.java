package day21maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class Maps03 {
    public static void main(String[] args) {
        //Example 1: Verilen cumledeki kelimelerin gorunum sayisini veren kodu yaziniz.
        //"I like you, like like!"  => I=1, like=3, you=1

        String s = "I like you, like like!";

        //String imizde bulunan tum noktalama isaretlerinden kurtulmamiz lazim
        s = s.replaceAll("\\p{Punct}", "");
        System.out.println(s);//I like you like like

        //Kelimelerle calisacağımız icin split(" ") kullanmaliyiz
        String words [] = s.split(" ");
        System.out.println(Arrays.toString(words));//[I, like, you, like, like]

        //words arrayindeki kelimeler birer birer Map te varmi yokmu diye kontrol edilecek
        //words arrayindeki kelimeler Map de yok ise Map e value su 1 olarak yerlestirilecek
        //words arrayindeki kelimeler Map de var ise Map e value su 1 artirilirak  yerlestirilecek

        HashMap<String, Integer> occ = new HashMap<>();

        for ( String w : words ) {
           Integer numOffOccurance= occ.get(w);

           if(numOffOccurance==null){
               occ.put(w,1);
           }else {
               occ.replace(w,numOffOccurance+1);
           }
        }
        System.out.println(occ);//{like=3, I=1, you=1}


 //Verilen bir String'de hangi harfin kac defa kullanildigini veren method olusturunuz.
//"Hello Henry!" ==> H=2, e=2, l=2, o=1, n=1, r=1, y=1


        /*
        HashMap ile HashTable arasindaki fark nedir?
        1) HashMap thread-safe ve synchronized degildir, HashTable thread-safe ve synchronized dir
        2) HashMap bir tane null key e ve istediginiz kadar null value a musaade eder
           HashTable keylerde ve value larda null kullanilmasina musaade etmez
        3) HashMap hizlidir, HashTable HashMap e gore yavastir

        Note: HashMap ler ve HashTable lar entry leri rastgele siralar
         */
        Hashtable<String, Integer> ogrenciNotlari = new Hashtable<>();
        ogrenciNotlari.put("Selma",70);
        ogrenciNotlari.put("Tuba",75);
        ogrenciNotlari.put("Ibrahim",85);
        ogrenciNotlari.put("Safa",87);
      //  ogrenciNotlari.put(null,50); Hashtable larda key kısmında null konulamaz
      //  ogrenciNotlari.put("Ahmet",null); Hashtable larda value kısmında null konulamaz
        /*
        HashTable ne zaman kullanmaliyiz?
        1) multithread ve synchronization kullanmamiz gerekirse
        2) key lerde ve value larda null kullanmak yasak ise kullanabiliriz
         */

        HashMap<String, Integer> stdAges = new HashMap<>();
        stdAges.put("Ali",18);
        stdAges.put("Can",19);
        stdAges.put("Tom",33);
        stdAges.put("Veli",63);
        stdAges.put("Ahmet",41);
        stdAges.put(null,41);
        stdAges.put(null,39);
        stdAges.put("a",null);
        stdAges.put("b",null);
        stdAges.put("c",null);
        System.out.println(stdAges);

        /*
        1) Treemap ler entry leri naturalorder a gore siraya koyar, Bu yuzden coook yavastir
        2) Treemap ler  thread-safe ve synchronized degildir,
        3) Treemaplerin key lerinde null kullanilamaz, ama value kisimlarinda istediginiz kadar kullanabilirsiniz
        4) Treemapler key e bakarak siralama yapar
         */

        TreeMap<String,Integer> countryPopulation = new TreeMap<>();
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("Albania", 3000000);
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Turkiye", 83000000);
        countryPopulation.put("Netherland", 18000000);
      //  countryPopulation.put(null, 18000000);
        countryPopulation.put("Italy", null);
        countryPopulation.put("France", null);


        System.out.println(countryPopulation);













    }
}
