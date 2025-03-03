import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Task2x22 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        System.out.println("Введите дату в формате dd.MM.yyyy");
        String inputDate = scanner.nextLine();
        Date firstDate = sdf.parse(inputDate);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(firstDate);
        calendar.add(Calendar.DAY_OF_MONTH, 45);
        Date datePlus45Date = calendar.getTime();
        System.out.println(sdf.format(datePlus45Date));

        calendar.setTime(firstDate);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        Date startYear = calendar.getTime();
        System.out.println(sdf.format(startYear));

        Date dateWorkDays = firstDate;
        int addDays = 0;
        while (addDays < 10) {
            calendar.setTime(dateWorkDays);
            calendar.add(Calendar.DAY_OF_MONTH, 1);
            dateWorkDays = calendar.getTime();

            if (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY && calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
                addDays++;
            }
        }
        System.out.println(sdf.format(dateWorkDays));

        System.out.println("Введите вторую дату в формате dd.MM.yyyy:");
        String inputSecondDate = scanner.nextLine();
        Date secondDate = sdf.parse(inputSecondDate);

        int workingDaysAll = 0;
        calendar.setTime(secondDate);
        while (calendar.getTime().before(firstDate) || calendar.getTime().equals(firstDate)) {
            if (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY && calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
                workingDaysAll++;

            }
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }
        System.out.println(workingDaysAll);
    }
}
