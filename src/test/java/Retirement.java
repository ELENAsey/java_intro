import java.util.Locale;
import java.util.Scanner;

public class Retirement {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Введите ваш пол (мужчина/женщина): ");
        String gender = scanner.nextLine().toLowerCase();

        System.out.print("Введите ваш возраст: ");
         int age = scanner.nextInt();

         if (!gender.equals("мужчина") && !gender.equals("женщина")){
             System.out.println("Некорректный ввод пола. Пожалуйста, введите 'мужчина' или 'женщина'.");
             return;
         }
         int retirementAge = 0;
         if (gender.equals("мужчина")){
             retirementAge = 70;
         } else  if (gender.equals("женщина")){
             retirementAge= 65;
         }
         int yearsToRetirement = retirementAge - age;
         if (yearsToRetirement > 0){
             System.out.println("До выхода на пенсию осталось " + yearsToRetirement + "лет.");
         } else  if (yearsToRetirement < 0){
             System.out.println("Вы вышли на пенсию " + Math.abs(yearsToRetirement) + " лет назад");
         } else {
             System.out.println("Вы уже достигли пенсионного возраста! ");
         }
         scanner.close();
    }
}
