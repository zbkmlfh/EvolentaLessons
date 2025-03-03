package Task2x21;

import java.util.Scanner;

public class Task4x1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку");
        String mainString = scanner.nextLine();

        System.out.println("Введите подстроку");
        String substring = scanner.nextLine();

        int count = countOcc(mainString, substring);

        System.out.println("Подстрока " + substring + " встречается " + count + " раза");


    }
    private static int countOcc(String str, String subStr){
        int count = 0;
        int index = 0;

        while ((index = str.indexOf(subStr, index)) != -1){
            count++;
            index += subStr.length();
        }
        return count;
    }
}
