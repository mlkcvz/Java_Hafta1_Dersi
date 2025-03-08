package patika_1_basic;

import java.util.Scanner;

public class MukemmelSayiOdevi
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayı giriniz : ");
        int girilenSayi = scanner.nextInt();

        int toplam = 0;
        for(int i=1 ; i<girilenSayi;i++)
        {
            // DİKKAT İ yi 1 den başlatmamız gerekiyormuş,
            // Döngü 1'den başlar çünkü 1 her sayının bölenidir.
            if(girilenSayi%i ==0)
            {
                toplam +=i;


            }
        }
        if (toplam == girilenSayi){
            System.out.println(" sayı mükemmel sayıdır ");
        }
        else {
            System.out.println("mükemmel sayı değildir");
        }
    }
}
