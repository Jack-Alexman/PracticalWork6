package work63;

import java.util.Scanner;

public class Task63 {
    public static char getFirstCharacterOfWord(String str, int numberWord){
        int x = 0;
        for (int i = 1; i < numberWord; i++){
            x = str.indexOf(" ", x) + 1;
        }
        return str.charAt(x);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку => ");
        String str = scanner.nextLine();
        System.out.print("Введите номер слова в строке => ");
        int number = scanner.nextInt();
        scanner.close();
        System.out.println(getFirstCharacterOfWord(str, number));
    }
}
