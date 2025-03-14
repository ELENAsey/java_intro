public class SCops {
    public static void main(String[] args){
        int n, d, g;

        n = 10;
        d = 2;
        if (d != 0 && (++n % d) == 0)
            System.out.println(d + "is divider of " + n);
            System.out.println("n is " + n);

            n = 10;
            d = 0;
        if (d != 0 && (++n % d) == 0)
        System.out.println(d + "is divider of " + n);
        System.out.println("n is " + n);

//        if (d != 0 & (n % d) == 0)
//        System.out.println(d + "is divider of " + n);
    }
}
