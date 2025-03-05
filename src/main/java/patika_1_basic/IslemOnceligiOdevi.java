package patika_1_basic;

import java.util.Scanner;

public class IslemOnceligiOdevi
{
    public static void main(String[] args) {
        //Kullanıcıdan 3 tane sayı (a, b, c) alıp bu sayıları işlem sırasına göre işleyen bir program yazın.
        // İşlem sırası şöyle olsun: a+b*c-b. İşlem tamamladıktan sonra sonucu ekrana yazdırın.
        Scanner scanner = new Scanner(System.in);
        System.out.println("a sayısını giriniz : "  );
        int a = scanner.nextInt();
        System.out.println("b sayısını giriniz : "  );
        int b = scanner.nextInt();
        System.out.println("c sayısını giriniz : " );
        int c = scanner.nextInt();

        int sonuc = a+b*c-b;
        System.out.println("işlem sonucu : " + sonuc);

    }
}
