import java.util.Scanner;

public class Discount {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double totalAmount = 0;
        boolean continueShopping = true;
        while (continueShopping){
            System.out.print("Введите цену товара (или 0 для завершения): ");
            double price = scanner.nextDouble();
            if (price == 0){
                continueShopping = false;
            } else if (price > 0){
                totalAmount += price;
            } else {
                System.out.println("Цена не может быть отрицательной. Попробуйте снова. ");
            }
        }
        double discount = 0;
        if (totalAmount > 10000){
            discount = 0.20;
        } else if (totalAmount > 1000){
            discount = 0.10;
        }
        if (discount > 0){
            double savedAmount = totalAmount * discount;
            double finalAmount = totalAmount - savedAmount;
            System.out.println("Congratulations! You’ve saved" + savedAmount + "$");
            System.out.println("Final amount to pay" + finalAmount + "$");
        } else {
            if (totalAmount <= 1000){
                System.out.println("Spend" + (1000 - totalAmount) + "$ more to get the discount. ");
            } else {
                System.out.println("Spend " + (10000 - totalAmount) + "$ more to get the discount. ");
            }
            System.out.print("Do you want to continue? (yes/no): " );
            String response = scanner.next();
            if (response.equalsIgnoreCase("no")){
                continueShopping = false;
            }
        }
        scanner.close();
    }
}
