public class Register {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch;
        int changes = 0;
        int up = 0;
        System.out.println("Введите период: ");
        do {
            ch = (char) System.in.read();
            if (ch >= 'a' & ch <= 'z') {
                ch -= 32;
                changes++;
                System.out.println("Привет мир!");
            } else if (ch >= 'A' & ch <= 'Z') {
                ch += 32;
                up++;
                System.out.println("Привет мир!");
            }
        }
        while (ch !='.');
        System.out.println("Изменения в регистре: " + changes);
    }
}
