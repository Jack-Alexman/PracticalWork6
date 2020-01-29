package work65;

import java.util.Scanner;

public class Task65 {
    public static void printPyramid(int height){
        int i = 1;
        while (i <= height){
            int j = 2 * height - 1;
            while (j > 0 ){
                if ((j > (2 * height) / 2 - i) &&
                        (j < (2 * height) / 2 + i)){
                    System.out.print("*");
                } else
                System.out.print(" ");
                j--;
            }
            System.out.println();
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите высоту пирамиды => ");
        int height = sc.nextInt();
        sc.close();
        printPyramid(height);
    }
}