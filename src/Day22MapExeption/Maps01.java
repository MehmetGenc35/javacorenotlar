package Day22MapExeption;

import java.util.HashMap;

public class Maps01 {
    public static void main(String[] args) {
        //HashMap arkasında çalışan mekanizma
        HashMap<String,String> capitals= new HashMap<>();
        capitals.put("USA","Washington");
        //Hash kod üretti USA için
        capitals.get("USA");
        //USA için ürettiği HAsh kodu kullanarak "bucket" buluyor
        capitals.put("Italy","Roma");
        //Ialy için bir HAshKod üretecek sonra onu 16 ya bölecek kalan kaç ise o indexteki bucket a 65-Italy-Roma sırasıyla koyacak
        capitals.put("Turkiye","Ankara");
        //Türkiye için bir HAshKod üretecek sonra onu 16 ya bölecek kalan kaç ise o indexteki bucket a 82-Turkiye-Ankara sırasıyla koyacak
        //USA ve Turkiye aynı indexe tekabul ederse ikisini de aynı bucket a koyuyor
        //Sonra LinkedList yapısını kullanarak aranan keyin valusenu buluyor
        capitals.get("Turkiye");
        //Node lara tek tek bakarak Turkiyeyi bulacak
        capitals.put("Turkiye","Istanbul");
        //Turkiye key inin valuesunu Istanbul olarak değiştiriyor.





    }

}
