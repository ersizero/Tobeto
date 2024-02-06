package Ornekler;

public class Ornek6_strings {
    public static void main(String[] args) {
        String s1 = "Ozan";
        String s2 = "Ozan";
        if (s1 == s2){
        System.out.println("s1 ve s2 eşittir");
        }
        /* Farklı isimlerle tanımlasak bile değerleri aynı olur. Doğru bir kullanım değildir.
        Aynı değerleri farklı şekilde tanımlamak istiyorsak new ile tanımlamamız gerekir.
        örnek: bir öğretmenin 2 tane Ozan isminde öğrencisi var, hangi Ozan'ın notu kaç? */

        String s3 = new String("Ozan");
        String s4 = new String("Ozan");
        if (s3 == s4) {
            System.out.println("s3 ve s4 eşittir");
        }
        /* s3 ve s4 değerleri aynı gözükse de farklı tanımlanmış olması
        bu 2 ayrı Ozan'ı unique yapar */
        //***indexler 0'dan başlar***//
        s3.length(); // s3'ün karakter sayısını alır.
        s3.charAt(3); // Parantez içine yazılan index no'lu char değerini alır.
        s3.charAt(s3.length()-1); // Gibi kullanılabilir. Sondaki harfi alır.
        s3.substring(3); // 3. karakterden başlayarak stringin kalanını alır.
        s3.substring(1, 3); // 1'den başlar 3'ü dahil etmez
        s3.toUpperCase(); // Tüm harfleri büyük yapar.
        s3.toLowerCase(); // Tüm harfleri küçük yapar.
        s3.equals(s4); // 2 string değeri arasındaki eşitliği kontrol eder.
        s3.equalsIgnoreCase(s4); // büyük-küçük harf duyarlılığını ortadan kaldırarak kontrol eder.
    }
}
