package patika_1_basic;

import java.util.Scanner;

public class CastingOdevi
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen tam sayı giriniz : ");
        int tamSayi = scanner.nextInt();
        System.out.println("Ondalıklı sayı giriniz : ");
        double ondalikliSayi = scanner.nextDouble();
        double yeniDonüsmüsTamSayi = tamSayi;
        System.out.println(" Tam sayının ondalıklı sayıya dönüşmesi : " + yeniDonüsmüsTamSayi);
        int yeniDönüsmüsOndalıklıSayı = (int) ondalikliSayi;
        System.out.println(" Ondalıklı sayının tam sayıya dönüşmesi " + yeniDönüsmüsOndalıklıSayı);

    }
}
