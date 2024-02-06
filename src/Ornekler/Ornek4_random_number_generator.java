/* 4-Kullanıcının 1 ile 10 arasında rastgele bir sayıyı tahmin etmesini isteyen ve
doğru tahmin edene kadar devam eden bir program yazınız.(While döngüsü ile yapınız ve
rastgele sayı üretmek için Random sınıfını kullanınız) */

package Ornekler;

import java.util.Random;
import java.util.Scanner;

public class Ornek4_random_number_generator {
    public static void main(String[] args) {
        System.out.println("*** Find the random number ***");
        System.out.println("Please write a number between 1-10");

        Random random1 = new Random();
        int random = random1.nextInt(1,11);
        Scanner number = new Scanner(System.in);

        while (true) {
        int input = number.nextInt();

        if (input > 0 && input < 11) {
            if (random == input) {
            System.out.println("Congratulations, you found the number!!");
            break;
            }
            else {
            System.out.println("Wrong number, please try again");
            }
        }
        else {
            System.out.println("Enter a valid number (1-10)");
            System.out.println("Please try again");
            }
        }
    }
}
