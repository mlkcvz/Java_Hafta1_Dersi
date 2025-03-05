package patika_1_basic;

import java.util.Scanner;

public class ManavOdevi
{
    public static void main(String[] args) {

        double armut = (double) 2.14;
        double elma = (double) 3.67;
        double domates = (double) 1.11;
        double muz = (double) 0.95;
        double patlıcan = (double) 5.00;
        Scanner scanner = new Scanner(System.in);
        System.out.println("armut kaç kilo ? : ");
        int armutKilo = scanner.nextInt();
        System.out.println("elma kaç kilo ? : ");
        int elmaKilo = scanner.nextInt();
        System.out.println("domates kaç kilo ? : ");
        int domatesKilo = scanner.nextInt();
        System.out.println("muz kaç kilo ? : ");
        int muzKilo = scanner.nextInt();
        System.out.println("patlıcan kaç  kilo ? : ");
        int patlicanKilo =scanner.nextInt();
        double toplamTutar = (armut*armutKilo)+(elma*elmaKilo)+(domates*domatesKilo)+(muz*muzKilo)+(patlıcan*patlicanKilo);
        System.out.println("Toplam tutar : " + toplamTutar + " TL");





    }
}
