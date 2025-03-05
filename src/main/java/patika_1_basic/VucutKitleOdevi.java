package patika_1_basic;

import java.util.Scanner;

public class VucutKitleOdevi
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        double boy  = scanner.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz: ");
        double kilo = scanner.nextDouble();
        double hesap = kilo/ (boy* boy);
        System.out.println("Vücut kitle endeksiniz : "+ hesap );

    }
}
