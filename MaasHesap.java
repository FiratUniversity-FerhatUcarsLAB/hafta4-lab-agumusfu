
/*
 * Ad Soyad: Abdullah Gümüş
 * Ogrenci No: 250542016
 * Tarih: 04.11.2025
 * Aciklama:Görev 3 - Maaş Hesaplama Sistemi*
 * Bu program, çalışanın bilgilerini alır ve brüt maaş ile mesai saatine göre
 * gelir, kesinti ve net maaş hesaplamalarını yapar.
 * Hesaplanan verileri ayrıntılı ve biçimlendirilmiş olarak ekrana yazdırır.
 */


import java.util.Scanner;

public class MaasHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double SGK_ORANI = 0.14;
        final double GELIR_VERGISI_ORANI = 0.15;
        final double DAMGA_VERGISI_ORANI = 0.00759;

        System.out.println("====================================");
        System.out.println("MAAS BORDROSU");
        System.out.println("====================================");
    //Çalışanın isim-soyisim, çalışma saati ve maaş verilerini String-Double ve int ile girmesi
        System.out.print("Çalışan Adı:");
        String ad = input.next();
        System.out.print("Çalışan Soyadı:");
        String soyad = input.next();
        System.out.print("Aylık brüt maaş (TL): ");
        double brutMaas = input.nextDouble();

        System.out.print("Haftalık Çalışma saati: ");
        int haftalikSaat = input.nextInt();

        System.out.print("Mesai saati: ");
        int mesaiSaat = input.nextInt();
    //Double ile istenen hesaplamalara göre tanımlama ve hesaplamalar
        double mesaiUcreti = (brutMaas / 160) * mesaiSaat * 1.5;
        double toplamGelir = brutMaas + mesaiUcreti;

        double sgk = toplamGelir * SGK_ORANI;
        double gelirVergisi = toplamGelir * GELIR_VERGISI_ORANI;
        double damgaVergisi = toplamGelir * DAMGA_VERGISI_ORANI;
        double toplamKesinti = sgk + gelirVergisi + damgaVergisi;
        double netMaas = toplamGelir - toplamKesinti;

        double kesintiOrani = (toplamKesinti / toplamGelir) * 100;
        double saatlikNet = netMaas / 176.0;
        double gunlukNet = netMaas / 22.0;
        //Ekrana verilerin çıktısını biçimli bir şekilde yazdırma
        System.out.println("\nGELİRLER:");
        System.out.printf("Brüt Maaş : %.2f TL%n", brutMaas);
        System.out.printf("Mesai Ücreti (%d saat) : %.2f TL%n", mesaiSaat, mesaiUcreti);
        System.out.println("------------------------");
        System.out.printf("TOPLAM GELİR : %.2f TL%n", toplamGelir);

        System.out.println("\nKESINTILER:");
        System.out.printf("SGK Kesintisi (%.1f%%) : %.2f TL%n", SGK_ORANI * 100, sgk);
        System.out.printf("Gelir Vergisi (%.1f%%) : %.2f TL%n", GELIR_VERGISI_ORANI * 100, gelirVergisi);
        System.out.printf("Damga Vergisi (%.1f%%) : %.2f TL%n", DAMGA_VERGISI_ORANI * 100, damgaVergisi);
        System.out.println("------------------------");
        System.out.printf("TOPLAM KESINTI : %.2f TL%n", toplamKesinti);

        System.out.printf("%nNET MAAŞ : %.2f TL%n", netMaas);
        System.out.println("====================================");
        System.out.printf("Kesinti Orani: %.1f%%%n", kesintiOrani);
        System.out.printf("Saatlik Net Kazanç %.2f TL%n", saatlikNet);
        System.out.printf("Günlük Net Kazanç %.2f TL%n", gunlukNet);
    // Scanner kapatma
        input.close();
    }
}
