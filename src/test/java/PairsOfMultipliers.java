import java.util.Scanner;

public class PairsOfMultipliers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Введите число: ");
        int number = scanner.nextInt();

        boolean hasMultipliers = false;

        System.out.printf(" %d является производным :/n", number);
        for (int i = 2; i <= number / 2; i++){
            if (number % i == 0){
                int otherFactor = number / i;
                System.out.printf("%d и %d/n", i, otherFactor);
                hasMultipliers = true;
            }
        }
        if (!hasMultipliers){
            System.out.printf("Число %d не имеет множителей, поэтому оно является простым числом. Простое число (или простое число) — это натуральное число больше 1, которое не является произведением двух меньших натуральных чисел.\n", number);
        }
        scanner.close();
    }
}
