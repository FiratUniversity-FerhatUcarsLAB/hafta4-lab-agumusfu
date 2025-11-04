
/*
 * Ad Soyad: Abdullah Gümüş
 * Öğrenci No: 250542016
 * Tarih: 04.11.2025
 * Açıklama: Görev 2 - Geometrik Hesaplayıcı
 * Bu program, kullanıcıdan dairenin yarıçapını alır ve
 * daire ile küreye ait alan, çevre, çap, hacim ve yüzey alanı
 * hesaplamalarını yaparak sonuçları düzenli bir şekilde ekrana yazdırır.
 */

import java.util.Scanner;

public class GeometrikHesap {
    public static void main(String[] args) {
        //Pi sayısını tanımla
        final double PI = 3.14159;
        //Veri girişi için scanner tanımla
        Scanner input = new Scanner(System.in);

        System.out.println("=== GEOMETRIK HESAPLAYICI ===");
        System.out.print("Dairenin yaricapini girin (cm): ");
        double r = input.nextDouble();
        //matematiksel formüllere uygun şekilde hesaplamalar tanımlama
        double daireAlani = PI * r * r;
        double daireCevresi = 2 * PI * r;
        double daireCapi = 2 * r;
        double kureHacmi = (4.0 / 3.0) * PI * Math.pow(r, 3);
        double kureYuzeyAlani = 4 * PI * r * r;
        //uygun biçimlerde sonuçları ekrana yazdırma
        System.out.println("\nSONUCLAR:");
        System.out.println("----------");
        System.out.printf("Daire Alani : %.2f cm^2%n", daireAlani);
        System.out.printf("Daire Cevresi : %.2f cm%n", daireCevresi);
        System.out.printf("Daire Capi : %.2f cm%n", daireCapi);
        System.out.printf("Kure Hacmi : %.2f cm^3%n", kureHacmi);
        System.out.printf("Kure Yuzey Alani : %.2f cm^2%n", kureYuzeyAlani);
        //scanner kapatma
        input.close();
    }
}
