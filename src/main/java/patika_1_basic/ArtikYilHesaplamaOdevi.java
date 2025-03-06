package patika_1_basic;

import java.util.Scanner;

public class ArtikYilHesaplamaOdevi
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yıl bilgisini giriniz: ");
        int yil = scanner.nextInt();
        if ((yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0) ) {

                System.out.println("artık yıldır");


        }
        else{
            System.out.println(" artık yıl değildir ");
        }

    }
}
