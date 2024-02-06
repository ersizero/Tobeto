/* 1- Switch case ile müşteriden alınan sipariş numarasına göre hangi ürünün
sipariş edildiğini belirleyen algoritma yazınız.Input için Scanner kullanınız */

package Ornekler;

import java.util.Scanner;

public class Ornek1_switch_case {
    public static void main(String[] args) {
        System.out.println("*** Welcome to Ozan Usta's Bakery ***");
        System.out.println("Please select the product you want to buy:");
        System.out.println("1-Cake");
        System.out.println("2-Bagel");
        System.out.println("3-Donut");

        Scanner scanner = new Scanner(System.in);
        int productType = scanner.nextInt();
        switch (productType){
            case 1:
                System.out.println("You bought a Cake");
                break;

            case 2:
                System.out.println("You bought a Bagel");
                break;

            case 3:
                System.out.println("You bought a Donut");
                break;
        }
    }

}