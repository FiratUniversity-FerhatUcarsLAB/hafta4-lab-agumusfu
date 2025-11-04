/*
 * Ad Soyad: Abdullah Gümüş
 * Ogrenci No: 250542016
 * Tarih: 04.11.2025
 * Aciklama: Gorev 1 - Öğrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 *
 */

import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        System.out.print("Adinizi girin: ");
        String ad = input.next();

        System.out.print("Soyadinizi girin: ");
        String soyad = input.next();

        System.out.print("Ogrenci numaraniz: ");
        int ogrNo = input.nextInt();

        System.out.print("Yasiniz: ");
        int yas = input.nextInt();

        System.out.print("GPA (0.00-4.00): ");
        double gpa = input.nextDouble();

        System.out.println("\n=== OGRENCI BILGI SISTEMI ===");
        System.out.printf("Ad Soyad: %s %s%n", ad, soyad);
        System.out.printf("Ogrenci No: %d%n", ogrNo);
        System.out.printf("Yas: %d%n", yas);
        System.out.printf("GPA: %.2f%n", gpa);

        if (gpa >= 2.5)
            System.out.println("Durum: Basarili Ogrenci");
        else
            System.out.println("Durum: Gelistirilebilir Ogrenci");

        //scanner kapatma
        input.close();
    }
}