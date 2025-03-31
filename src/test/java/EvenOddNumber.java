import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");

        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.printf(" Число %d является чентным. /n ", number);
        } else {
            System.out.printf(" Число %d является нечентным. /n ", number);
        }
        scanner.close();
    }
}
