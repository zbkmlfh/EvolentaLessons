import java.util.Scanner;

public class Task2x19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 числа: ");
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();

        StringBuilder stringBuilder = new StringBuilder();

        if (a % 5 == 0) {
            stringBuilder.append("a = " + a + " ,");
        }
        if (b % 5 == 0) {
            stringBuilder.append("b = " + b + " ,");
        }
        if (c % 5 == 0) {
            stringBuilder.append("c = " + c + " ");
        }
        String result = stringBuilder.isEmpty() ? "Нет значений кратных 5" : stringBuilder.toString();
        System.out.println(result);

        System.out.println(Math.round(a / b));
        System.out.println(a / b);
        System.out.println(Math.ceil(a / b));
        System.out.println(Math.floor(a / b));
        System.out.println(Math.round(a / b));

        if (c != 0){
            System.out.println(b % c);
        }

        System.out.println(Math.min(a, b));
        System.out.println(Math.max(b, c));

    }
}