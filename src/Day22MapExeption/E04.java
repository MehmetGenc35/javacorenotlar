package Day22MapExeption;

public class E04 {
    public static void main(String[] args) {
        String[] arr= {"j","a","v","a"};
        getElementFromArray(arr,1);// 1. indexteki a'yı bize verdi

        getElementFromArray(arr,5);//ArrayIndexOutOfBoundsException: hatası verdi
                                        // Index 5 out of bounds for length ==>Array dışına çıktın diyor



    }
    public static void getElementFromArray(String[] s, int idx){
        try {
            String el=s[idx];
            System.out.println(el);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }
    }

}
