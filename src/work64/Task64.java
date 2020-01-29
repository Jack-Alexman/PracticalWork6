package work64;

import java.util.Scanner;


public class Task64 {
    public static String convertDecimalToBinary(int number){
        StringBuilder binary = new StringBuilder();
        while (number > 0){
            binary.append(number % 2);
            number /=2;
        }
        return binary.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число => ");
        int number = scanner.nextInt();
        scanner.close();
        System.out.println(convertDecimalToBinary(number));
    }
}
