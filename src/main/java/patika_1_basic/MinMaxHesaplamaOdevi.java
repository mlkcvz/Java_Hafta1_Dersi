package patika_1_basic;

import java.util.Scanner;

public class MinMaxHesaplamaOdevi
{
    public static void main(String[] args) {
        //Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
        // 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen sayı giriniz");
        int girilenSayi = scanner.nextInt();
        int toplam=0;
        int sayac=0;

        for (int i = 0; i < girilenSayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) { //burada i kullanılmalıymış , dikkat !!!!!

               toplam+=i; // i kullanılmalıymış , DİKKAT !
               sayac++;

            }

        }
        // Ortalamayı hesapla
        if (sayac > 0) {
            double ortalama = (double) toplam / sayac;
            System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + ortalama);
        } else {
            System.out.println("3 ve 4'e tam bölünen hiçbir sayı bulunamadı.");
        }
    }
}

