package Task2x21;

import java.util.Scanner;

public class Task4x2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String input = scanner.nextLine();

        String censured = input.replaceAll("кака", "вырезано цензурой").replaceAll("бяка", "вырезано цензурой");

        System.out.println(censured);
    }
}
