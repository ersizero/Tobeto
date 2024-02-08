package Ornekler;
//1'den 1000'e kadar asal sayılar
public class Ornek8_prime_number {

    public static boolean asalMi(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;

    }


    public static void main(String[] args) {
    for (int i = 2; i<1000; i++)
        if(asalMi(i)){
    System.out.println(i);
}
    }
}