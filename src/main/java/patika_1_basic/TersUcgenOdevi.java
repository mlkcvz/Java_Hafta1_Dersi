package patika_1_basic;

import java.util.Scanner;

public class TersUcgenOdevi
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ters üçgen için Yıldız sayısı giriniz: ");
        int sayi = scanner.nextInt();
        // Yıldızları ters üçgen şeklinde yazdırmak için döngü
        for (int i = sayi; i > 0; i--) {
            // Her satırda 'i' kadar yıldız yazdırıyoruz
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            // Bir satır tamamlandığında alt satıra geçiyoruz
            System.out.println();
        }

    }
}
