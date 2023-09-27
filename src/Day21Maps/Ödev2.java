package Day21Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Ödev2 {
    public static void main(String[] args) {
        String s="Ervoşumu ve annesini çok seviyorum!";

        s= s.replaceAll("\\p{Punct}", ""); // noktalamaları attık
        System.out.println(s);
        s=s.replaceAll(" ", "");
        System.out.println(s); // boşlukları attık

        List<Character> harf= new ArrayList<>();// Stringin elemanlarını tek tek ArrayList e ekledik
        for (int i = 0; i <s.length() ; i++) {
            harf.add(s.charAt(i));

        }
        System.out.println(harf);

        HashMap<Character, Integer> harfSayısı= new HashMap<>(); //HashMap oluşturduk

        for (Character w :harf ) { //ArrayList in elemanlarını tek tek ele alıyoruz
            Integer numOfChar= harfSayısı.get(w); //Hashmapten w elemanını getir
            if(numOfChar==null){ //Getirdikten sonra var mı yok mu diye bakıyor
                harfSayısı.put(w,1);// yoksa valuesu ile beraber koyuyor method
            }else{ //eleman varsa value güncelliyor
                harfSayısı.replace(w,numOfChar+1); //valuesunu güncelliyor
            }

        }
        System.out.println(harfSayısı);
    }
}
