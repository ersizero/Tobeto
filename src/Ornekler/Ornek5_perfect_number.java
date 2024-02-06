// 5- Bir sayının mükemmel sayı olup olmadığını kontrol eden algoritma yazınız.
// Bir sayının bölenlerinin toplamı kendisine eşitse o mükemmel sayıdır.

package Ornekler;

import java.util.Scanner;

public class Ornek5_perfect_number {
    public static void main(String[] args) {
        System.out.println("Enter a number to find out if it is Perfect Number or not");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int total = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total = total + i;
            }
        }
        if (total == number) {
            System.out.println(number + " is a Perfect Number");
        } else {
            System.out.println(number + " is not a Perfect Number");
        }

    }

}

