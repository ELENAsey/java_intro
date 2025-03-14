public class IncrDecrDemo {
    public static void main(String[] args){
        int x = 0;

        x = x + 1;
        System.out.println(x);
        x += 1;
        System.out.println(x);
        x++;
        System.out.println(x);
        ++x;
        System.out.println(x);

        int y = 0;

        y = y - 1;
        System.out.println(y);
        y -= 1;
        System.out.println(y);
        y--;
        System.out.println(y);
        --y;
        System.out.println(y);

        int b = 0;

        System.out.println("prefix:" + --b);
        System.out.println("a:" + b);
        System.out.println("postfix:" + b--);
        System.out.println("a:" + b);
    }
}
