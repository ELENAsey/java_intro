import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Введите количество чисел: ");
        int n = scanner.nextInt();

        double sum = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MIN_VALUE;

        System.out.println("Введите " + n + " чисел: ");
        for (int i = 0; i < n; i++){
            double number = scanner.nextDouble();
            sum += number;

            if (number > max){
                max = number;
            }

            if (number < min){
                min = number;
            }
        }
        double average = sum / n;

        System.out.printf(" Сумма  веденных чисел: %.2f/n ", sum);
        System.out.printf(" Среднее значение : %.2f/n ", average);

        if (max == min){
            System.out.printf("Все числа одинаковы./n ");
        } else {
            System.out.printf(" Максимальное значение: %.2f/n", max);
            System.out.printf(" Минимальное значение: %.2f/n ", min);
        }
        scanner.close();
    }
}
