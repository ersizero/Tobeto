/* 2- kullanıcıdan kaç ürün almak istediğini soran,her ürünün fiyatını alarak toplam
alışveriş tutarını hesaplayan bir algoritma yazınız.(Input için Scanner ve döngü için
for döngüsü kullanınız) */

package Ornekler;

import java.util.Scanner;

public class Ornek2_bakery {
    public static void main(String[] args) {
        System.out.println("*** Welcome to Ozan Usta's Bakery ***");
        System.out.println("Please select the product you want to buy:");
        System.out.println("1-Cake");
        System.out.println("2-Bagel");
        System.out.println("3-Donut");

        int cakePrice = 3;
        int bagelPrice = 2;
        int donutPrice = 4;

        Scanner scanner = new Scanner(System.in);
        int productType = scanner.nextInt();

        System.out.println("Please enter quantity");
        int quantity = scanner.nextInt();


        switch (productType){
            case 1:
                //system.out.printf ile de yapılabilir
                System.out.print("You bought " + quantity + " Cake for ");
                calculatePrice(quantity, cakePrice);
                break;

            case 2:
                System.out.print("You bought " + quantity + " Bagel for ");
                calculatePrice(quantity, bagelPrice);
                break;

            case 3:
                System.out.print("You bought " + quantity + " Donut for ");
                calculatePrice(quantity, donutPrice);
                break;
        }



    }
    public static void calculatePrice(int quantity, int price){
        int totalprice = 0;

        for (int i = 1; i<=quantity; i++)
        {
            totalprice = quantity*price;
        }
        System.out.println(totalprice + " USD");
        System.out.println("Thank you for your purchase, please visit us again.");
    }



    }

