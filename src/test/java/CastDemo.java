public class CastDemo {
    public static void main(String[] args){
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;
        i = (int) (x / y);
        System.out.println("x / y = " + i);

        i = 100;
        b = (byte) i;
        System.out.println("value of b is " + b);

        i = 129;
        b = (byte) i;
        System.out.println("value of b is " + b);

        b = 75;
        ch = (char) b;
        System.out.println("value of ch is " + ch);
    }
}
