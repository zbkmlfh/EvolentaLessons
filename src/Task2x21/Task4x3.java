package Task2x21;

import java.util.Scanner;

public class Task4x3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату в формате 'дд.мм.гггг': ");
        String dateInput = scanner.nextLine();

        String[] parts = dateInput.split("\\.");
        String day = parts[0];
        String mouth = parts[1];
        String year = parts[2];
        String allDate = year + "-" + mouth + "-" + day;

        System.out.println(allDate);
    }
}
