package Day22MapExeption;

public class E01 {
    public static void main(String[] args) {
        //Exeption beklenmedik hata demek
        //JAva exeption classı oluşturmuştur.
        //Exeption fırlatırsa java kodun çalışmasını durdurur
        //Yazılan kod çalışmadığında Log a bakarız.
        //İf else çözüm değildir "try-catch" yaparak çözülmelidir.
        //Kodun çalışmaya devam etmesini istiyorsak exeption oluşması muhtemel kodları "try-catch" bloğu içinde yazmalıyız.
        /*Exeptionu handle edebilmek için 2 yol vardır.
            a) Exeptionları gereksinimlere göre (FRD) uygun çözümler üretebilirsiniz. Buna Exception Handling denir.
            bunu try catch kullanarak yapabiliriz.
            Hata yoksa try çalışır catch çalışmaz
            HAta varsa try çalışmaz catch çalışır
            b) Exception oluştuğunda bunu ilan eder geri çekilirsiniz Buna da Exception Throw denir.
            c) Try block içerisinde exception olursa exeptiondan sonraki kodlar çalışmaz.

         */


        divide(12, 3);
        //divide(12, 0);  //by Zero dan kaynaklı bir exeption fırlattı

        divide2(5,0);//Exeption fırlatmadı bizim söylediğimiz çözümü uyguladı





    }
    //ArithmeticException==> Yazdığınız kodda matematiksel işlem varsa kodun kaynaklanabileceği hata çeşidi
    public static void divide2(int a,int b){
        try{ //Sen kodu çalıştırmayı bir dene
            System.out.println(a/b);
            System.out.println("Try içi görev tamamlandı.");
        }catch (ArithmeticException e){ //Olaki bir hata görürsen buradan hallederiz.
            System.out.println("Do not divide by Zero");
            System.out.println("Catch içi görev tamamlandı.");
        }
        System.out.println("Try dışı görev tamamlandı.");

    }





    //İf else çözğm olarak KESİNLİKLE tavsiye edilmez
    public static void divide(int a,int b){
        if(b==0){
            System.out.println("O a bölme yapılmaz");
        }else{
            System.out.println(a/b);
        }

    }
}
