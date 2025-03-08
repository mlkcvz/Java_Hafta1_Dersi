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
            //Dış Döngü (for i): Başlangıçta i = basamakSayisi olacak ve her adımda bir azalacak.
            // Bu dış döngü, her bir satırın kaç yıldız içereceğini belirler.
            //İç Döngü (for j): i kadar yıldız yazdırır. Yani, dış döngüdeki her iterasyonda,
            // iç döngüde yıldızların sayısı değişir.
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            // Bir satır tamamlandığında alt satıra geçiyoruz
            System.out.println();
        }

    }
}
