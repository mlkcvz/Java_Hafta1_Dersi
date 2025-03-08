package patika_1_basic;

import java.util.Scanner;

public class MatrisTranspozuOdevi
{
    public static void main(String[] args)
    {
      /*  Scanner scanner = new Scanner(System.in);

        int[][] ikiBoyutlu = {{1,2,3},{4,5,6}};
        int ilkDeger = 0;

        for(int i= 0; i<ikiBoyutlu.length; i++){
            for(int j=0 ; j< ikiBoyutlu[i].length; j++){
                ilkDeger=ikiBoyutlu[i][j];
                ikiBoyutlu[i][j]=ikiBoyutlu[j][i];
                ilkDeger=ikiBoyutlu[i][j];
                System.out.println(ilkDeger);

            }

        }*/
        Scanner scanner = new Scanner(System.in);

        // Matrisin boyutları
        System.out.print("Matrisin satır sayısını girin: ");
        int rows = scanner.nextInt();
        System.out.print("Matrisin sütun sayısını girin: ");
        int cols = scanner.nextInt();

        // Matrisin oluşturulması
        int[][] matrix = new int[rows][cols];

        // Kullanıcıdan matris elemanlarını almak
        System.out.println("Matrisin elemanlarını girin: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Transpoz matrisini oluşturma
        int[][] transpose = new int[cols][rows];

        // Matrisin transpozunu hesaplamak
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Orijinal matrisi ekrana yazdırma
        System.out.println("\nOrijinal Matris:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Transpoz matrisi ekrana yazdırma
        System.out.println("\nTranspoze Matris:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }



    }
}
