package factirial;

//вычисление факториала числа

import java.util.Scanner;

public class FactorialChisla {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");

        if (scan.hasNextInt()) // возвращает истину если с потока ввода можно считать целое число
        {
            int n;
            n = scan.nextInt();
            int result = 1;
            for (int i = 2; i <= n; i++)
                result *= i;

            if (n >= 0)
                System.out.println(result);
            if (n < 0)
                System.out.println("Вы ввели отрицательное число!");
        } else {
            System.out.println("Вы ввели не число!");
        }
    }
}