package patika_1_basic;

import java.util.Scanner;

public class CircleCalculatorExample
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("dairenin yarıçapını gir :" );
        double radius = scanner.nextDouble();
        double PI = 3.14;
        double area = PI*radius*radius;

    }
}
