package Itog3;

//Напишите программу конвертер валют.
// Программа должна переводить рубли в доллары по текущему курсу.
// Пользователь вводит текущий курс и количество рублей. Итоговое значение должно быть округлено до двух знаков после запятой.
// (Пример для теста работы программы: Курс доллара = 67,55, Количество рублей: 1000, Итого: 14,80 долларов)
import java.util.Scanner;

public class Itog3 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите курс доллара: ");
        double a = in.nextDouble();
        System.out.print("Введите количество рублей: ");
        double b = in.nextDouble();
        double c = b / a;
        System.out.printf("Конвертация рублей в доллары: %.2f \n", c);
    }
}