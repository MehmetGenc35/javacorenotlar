package day22map_exception;

public class E07 {
    /*
    1) throw keywordu bir methodun bodysi icinde istedigimiz yerde istedigimiz kosullar icin istedigimiz kadar Exception
      atmamizi saglar
    2) throw keywordu yazildiktan sonra bir exception class objecti olusturulur
    3) Exception class constructor'inin parantezi icinde  istediginiz Exception mesajini verebilirsiniz
     */


    public static void main(String[] args) {
        printAge(63);


        try {
            printAge(-5);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("main method try sonrasi kod calismaya devam etti");


    }
    public static void printAge(int age){
        if(age<0){
            throw new IllegalArgumentException("Age cannot be negative");
        }else {
            System.out.println(age);
        }
    }


}
