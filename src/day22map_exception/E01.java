package day22map_exception;

public class E01 {
            /*
        Exception beklenmedik problem demektir. Java cozemedigi bir sorunla karsilastiginda exception classi devreye girer.
        Exception classi biz karsilasilan sorunun cinsini ve bu sorunun nereden kaynaklandigini ve sebebini veir
        Java exception firlattiginda kodun calismasini durdurur. ve bizden bir karar vermemizi bekler
        ==> Eger gereksinimlere gore kodumuzun calismaya devam etmesini istiyorsak try catch ile exception olusturmasi muhtemel kodlarimizi
        try catch blogu icine yazmaliyiz
        ==> Excepion i halledebilmek icin iki temel yol vardir
            a) Exception a uygun cozumler uretebilirsiniz. Buna Excepion Handling denir
                bunun icin try catch kullanilir, try block icinde yapilmasi istenen islemi javadan yapmasi istenir
                java islemi problemsiz bir sekilde yaparsa cathc block java tarafindan okunmaz
                try block da islem yapilirken Exception olusursa catch block devreye girir ve catch block icinde ki kodlar calisir
                try block da islem yapilirken Exception olusursa try block icindeki hata sonrasi kodlar calistirilmaz
            b) Execption olustugunda bunu ilan eder ve geri cekilirsiniz, bunada throw exception denir

        ==> catch parantezi icindeki karsilasmamiz muhtemel olan exception class isimini ve bir obje ismini (e),
        catch block una ise exception ile karsilasilidiginda yapilmasini istedigimiz kodlari yazariz

        => Yazdiginiz kod calismadiginda problemi bulmak icin log lara bakariz

         */


    public static void main(String[] args) {
        divide(12,0);

        divide2(5,1);


    }
    //ArtihmeticException yazdiginiz code da matematiksel islem kullaniyorsaniz alabileceğiniz bir exception cesididir.
    public static void divide2(int a, int b){
        try{
            System.out.println(a/b);
            System.out.println("try ici gorev tamamlandi");


        }catch (ArithmeticException e){
            System.out.println("Do not divide by zero");
        }
        System.out.println("try-catch sonrasi kod akisina devam ediyor");
    }






    //Kesinlikle tavsiye edilmez
    public static void divide(int a, int b){
        if(b==0){
            System.out.println("Do not divide by zero");
        }else{
            System.out.println(a/b);
        }
    }






}
