package Task2x21;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task4x4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату в формате 'дд.мм.гггг': ");

        String dateInput = scanner.nextLine();

        SimpleDateFormat inputFormat = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");

        try{

            Date date = inputFormat.parse(dateInput);
            String dateOutput = outputFormat.format(date);

            System.out.println(dateOutput);
        }catch (ParseException e){
            System.out.println("Неверный формат даты. Пожалуйста, используйте 'дд.мм.гггг'.");
        }
    }
}
