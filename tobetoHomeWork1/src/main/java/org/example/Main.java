package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        //Değişken isimlendirmeleri camelCase yapılır.

        String ortaMetin = "İlginizi çekebilir"; //Metin yazmak için String komutu kullanılır
        String altMetin = "Vade süresi";

        //int yani integer tamsayı veri türüdür.
        int vade = 12;

        //double ondalıklı veri türüdür. Ayrıca decimal, float farklı byte değerlerinde ondalıklı sayıların komutudur.
        double dolarDun = 18.14;
        double dolarBugun = 18.20;

        // boolean komutu doğru mu diye soru sormak için kullanılır. (true OR false)
        boolean dolarDustuMu = false;

        //if-else ve else-if şart bloğudur. Eğer anlamında sistemi test eder
        String okYonu = "";
        if (dolarBugun < dolarDun) {
            okYonu = "down.swg";
            System.out.println(okYonu);
        } else if (dolarBugun == dolarDun) {
            okYonu = "equals.swg";
            System.out.println(okYonu);
        } else {
            okYonu = "up.swg";
            System.out.println(okYonu);
        }

        //Array:liste demektir
        String[] krediler = {"Hızlı Kredi", "Maaşını Halkbank'tan Alanlar", "Mutlu Emekli"};

        for (int i = 0; i < krediler.length; i++) {
            System.out.println((i + 1) + ".Kredi: " + krediler[i]);
        }
    }
}