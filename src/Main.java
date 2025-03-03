import java.util.Date;

public class Main {
    public static void main(String args[]) {
        // Начала отсчета
        long start = System.currentTimeMillis();

        // Код программы. Получение 10 случайных чисел от 0 до 9 и вывод на экран
        for(int i = 1;i <= 10;i++) {
            System.out.println("Случайное число №" + i + ": " + (int)(Math.random() * 10));
        }

        // Получение и запись в переменную timeWorkCode времени работы программы
        long timeWorkCode = System.currentTimeMillis() - start;
        // Вывод времени выполнения работы кода на экран
        System.out.println("Скорость выполнения программы: " + timeWorkCode + " миллисекунд");
    }
}