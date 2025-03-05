package patika_1_basic;

import java.util.Scanner;

public class UcakBiletiFiyatıOdevi
{
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Mesafeyi km türünden giriniz : ");
        int mesafe = scanner.nextInt();
        System.out.println("Yaşınızı giriniz : ");
        int yas = scanner.nextInt();
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        int tip = scanner.nextInt(); // 1 veya 2


        if(mesafe <= 0 || yas <= 0 || (tip != 1 && tip != 2))
        {
            System.out.println("Hatalı veri girdiniz !");
            return;

        }

        //double mesafeBasiUcret = (double)0.10;
        double normalTutar=mesafe*0.10; // Normal Tutar = Mesafe * 0.10
        double yasIndirimi = 0;
        if(yas<12)
        {
            yasIndirimi -= normalTutar* 0.50;

        }
        else if(yas>=12 && yas<=24)
        {
            yasIndirimi -= normalTutar * 0.10;

        }
        else if(yas>65)
        {
            yasIndirimi-= normalTutar*0.30;

        }

        if(tip==2)
        { //1:. tek yön , 2: gidiş dönüş
            yasIndirimi-=normalTutar*0.20;

        }



        System.out.println("Toplam Tutar " + normalTutar);
    }*/




                // Scanner nesnesi oluşturuluyor
                Scanner scanner = new Scanner(System.in);

                // Kullanıcıdan mesafe bilgisini alma
                System.out.print("Mesafeyi km türünden giriniz: ");
                int mesafe = scanner.nextInt();

                // Kullanıcıdan yaş bilgisini alma
                System.out.print("Yaşınızı giriniz: ");
                int yas = scanner.nextInt();

                // Kullanıcıdan yolculuk tipi bilgisini alma
                System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
                int yolculukTipi = scanner.nextInt();

                // Geçerlilik Kontrolü: Mesafe, yaş ve yolculuk tipi kontrol ediliyor
                if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
                    System.out.println("Hatalı Veri Girdiniz !");
                    return; // Programdan çık
                }

                // Normal bilet fiyatı hesaplama
                double normalTutar = mesafe * 0.10;

                // Yaş indirimi hesaplama
                double yasIndirimi = 0;
                if (yas < 12) {
                    yasIndirimi = normalTutar * 0.50;  // %50 indirim
                } else if (yas >= 12 && yas <= 24) {
                    yasIndirimi = normalTutar * 0.10;  // %10 indirim
                } else if (yas > 65) {
                    yasIndirimi = normalTutar * 0.30;  // %30 indirim
                }

                // İndirimli tutar hesaplama
                double indirimliTutar = normalTutar - yasIndirimi;

                // Gidiş-Dönüş indirimi hesaplama
                double gidişDonusIndirimi = 0;
                if (yolculukTipi == 2) {
                    gidişDonusIndirimi = indirimliTutar * 0.20;  // %20 indirim
                }

                // Toplam tutar hesaplama
                double toplamTutar = (indirimliTutar - gidişDonusIndirimi);
                if (yolculukTipi == 2) {
                    toplamTutar *= 2;  // Gidiş-Dönüş olduğu için toplam tutarı 2 ile çarparız
                }

                // Sonuçları ekrana yazdırma
                System.out.println("Toplam Tutar = " + toplamTutar + " TL");
            }
        }

