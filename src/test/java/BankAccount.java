public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(" Пополнение на сумму: "
                    + amount + " Новый баланс: " + balance);
        } else {
            System.out.println(" Сумма снятия должна быть положительной.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println(" Снятие суммы. " + amount +
                        " Новый баланс: " + balance);
            } else {
                System.out.println(" Недостаточно средств на счете.");
            }
        } else {
            System.out.println(" Сумма снятия должна быть положительной. ");
        }
    }

    public void displayBalance() {
        System.out.println(" Текущия баланс счета " +
                accountNumber + ": " + balance);
    }

    public static void main(String args[]) {
        BankAccount account1 = new BankAccount("12345", 1000);
        BankAccount account2 = new BankAccount("67890", 500);

        account1.deposit(500);
        account1.withdraw(200);
        account1.withdraw(1500);

        account2.deposit(1000);
        account2.withdraw(300);
        account2.displayBalance();
    }
}



