package work62;

import java.util.Scanner;

public class Task62 {
    public static String latestDigit(int number){
        String s = "";
        for (int i = 0; i < 2; i++){
            s += number % 10;
            number /= 10;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число => ");
        int number = scanner.nextInt();
        scanner.close();
        System.out.println(latestDigit(number));
    }
}
