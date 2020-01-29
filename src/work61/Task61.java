package work61;

import java.util.Scanner;

public class Task61 {
    public static double areaTriangle(double a, double b, double c){
        double p = (a + b + c)/2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сторону а => ");
        int a = scanner.nextInt();
        System.out.print("Введите сторону b => ");
        int b = scanner.nextInt();
        System.out.print("Введите сторону c => ");
        int c = scanner.nextInt();
        scanner.close();
        System.out.println(areaTriangle(a, b, c));
    }
}
