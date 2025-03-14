public class INotNul {
    public static void main(String[] args){
        int n, d, q;
        n = 8;
        q = 4;
        d = 0;


//        if(d != 0 & (n % d) == 0){
//        System.out.println(d + " является делителем " + n);
//        }

        if(d != 0 && (n / d) == 0){
            System.out.println( d + " является делителем " + n);
        }
    }
}
