// 3- Do-While ve While döngüsü nedir? Bununla ilgili örnek yapınız.

package Ornekler;

import java.util.Scanner;

public class Ornek3_do_while {
    public static void main(String[] args) {
        System.out.println("Enter the number you want to calculate the sum of digits.");
        Scanner scanner = new Scanner(System.in);
        int sayi = scanner.nextInt();
        int toplam = 0;

        do { //while daki koşul sağlandığı sürece do daki işlem yapılmaya devam eder.

            toplam += sayi % 10; // toplam = toplam + (sayi % 10)
            sayi /= 10; // sayi = sayi / 10
        }
        while (sayi > 0);
        System.out.println("Girdiğiniz sayının basamakları toplamı: " + toplam);
        }
    }

