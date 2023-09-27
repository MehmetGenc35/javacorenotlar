package day16staticoop;

public class Animal {
    /*
    1) Inheritance
    2) Polymorphism
    3) Encapsulation
    4) Abstraction
     */

    //1) Inheritance
    /*
    Ozellikleri bir classtan diger classlara alan bir kavramdir, Mesela ; siz bir class olusturacaksiniz
    ama daha once olusturulmus bir class sizin istediginiz ozelliklerin bir cogunu kapsiyor. o zaman yeni
    olusturdugunuz classi ozelliklerini kullanmak istediginiz class a child yapariz


    1) Inhentiance sayesinde
        a) Code tekrarlarindan kurutuluruz
        b) Code tamiri(maintenance) kolay olur
        c) Child Class'lari daha atomic yapmis oluruz

   2) Bir class'i baska bir classin child class i yapmak icin
   extends keywordunu kullaniriz.
   3) Child class objectleri Parent class tan method ve variable lari kullanabilirler
   4) Parent class objectleri child class dan method ve variable lari kullanamazlar
   5) java da bir classin sadece bir tane parenti olabilir, coklu parent a Multiple Inheritance derler
        tekli parent a Single inheritance derler, java Multiple inhertince i desteklemez, single inheritance kullanir.
   6) Apartman seklindeki inheritance yapisina " Multilevel inheritance " denir
   ve java  " Multilevel inheritance " i destekler
   7) Object class her classin parent idir. java da object class hari her classin parenti vardir
   8) java da parent tan child a olan ilisikilere HAS-A Relationship denir
      java da chlid tan parent a olan ilisikilere IS-A Relationship denir
   9) java da her classin bir tane default constructor i vardir ama bu default constructor classin icinde gorunmez
        cunku default constructor "Object Class"icindedir.
     */

    public void eat(){
        System.out.println("Animals eat..");
    }
    public void drink(){
        System.out.println("Animals drink..");
    }






















}
