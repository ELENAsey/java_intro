public class ProgramN {
    public static void main(String[] args)
            throws java.io.IOException {
        char choice, exit;
        int space;
        exit = '.';
        space = 0;
        for (; ; ) {
        System.out.println("Нажмите любую клавишу.  Нажмите  '.' для выхода: ");
            choice = (char) System.in.read();
            if (choice == ' '){
                space += 1;
            }
            else if (choice == '.'){
                System.out.print("Программа остановлена. " + "Пробел нажат " + space + "раз. ");
                break;
                }

        }
    }
}