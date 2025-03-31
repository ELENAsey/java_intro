import java.util.Scanner;

public class Language {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Выберите язык: ");
        System.out.println( "1. Русский");
        System.out.println(" 2. English");
        System.out.println(" 3. Română");
        System.out.println(" 4. Italiano");

        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                System.out.printf(" Привет!/n ");
                break;
            case 2:
                System.out.printf(" Hello!/n");
                break;
            case 3:
                System.out.printf(" Buna ziua! /n");
            case 4:
                System.out.printf(" Ciao! /n");
                break;
            default:
                System.out.printf(" Неврный выбор. Попробуйте снова. /n");
                break;
        }
        scanner.close();
    }
}
