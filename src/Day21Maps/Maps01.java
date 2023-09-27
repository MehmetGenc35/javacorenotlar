package day21maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps01 {

    public static void main(String[] args) {

        /*
        1) Maplered sozluklerdeki gibi kelime ve manasi seklinde bir kullanim vardir
        2) Key kismi tekrarsiz, value kismi tekrarli olabilir
        3) Maplerdeke her bir elemana entry denir, tamamina EntrySet denir
        4) Entryler tekrarsiz oldugu ici EntrySet denilir
        5) Mapler collection degildir
        6) HashMap ler entry leri rastgele siralar bu yuzden en hizli mapdir.
         */


        //Map nasil olusturulur?
        HashMap<String, Integer> countryPopulation = new HashMap<>();
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("Albania", 3000000);
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Turkiye", 83000000);
        countryPopulation.put("Netherland", 18000000);
        System.out.println(countryPopulation);//{Turkiye=83000000, Netherland=18000000, USA=400000000, Germany=83000000, Albania=3000000}


        //get() methdou key ile calisir ve bize value kismini verir
        Integer usaPopulation = countryPopulation.get("USA");
        System.out.println(usaPopulation);

        //Butun key leri nasil alabiliriz?
        Set<String> keys = countryPopulation.keySet();
        System.out.println(keys);

        //Butun value lari nasil alabiliriz?
        Collection<Integer> values = countryPopulation.values();
        System.out.println(values);//[83000000, 18000000, 400000000, 83000000, 3000000]

        //Example 1: countryPopulation map'indeki ulkelerin nufuslarinin ortalamsi nedir?

        int sum = 0;
        for (Integer w : values) {
            sum = sum + w;
        }
        System.out.println(sum / values.size());

        //Looplar mapler ile kullanilamaz, bunun icin entrySet methodunu kullaniriz
        //entrySet() methodu mapteki entry leri kalip halinde  bize Set in icine koyarak verir.
        Set< Map.Entry<String,Integer>  >  entries= countryPopulation.entrySet();
        System.out.println(entries);//[Turkiye=83000000, Netherland=18000000, USA=400000000, Germany=83000000, Albania=3000000]

        //Example 2: countryPopulation Map'indeki ulkelerin isimlerinin character sayisi ile nufuslarinin
        //toplamini bulunuz.

        int toplam=0;

        for ( Map.Entry<String,Integer>  w: entries  ) {
            toplam = toplam +  w.getKey().length() + w.getValue();
        }
        System.out.println(toplam);

    }

}
