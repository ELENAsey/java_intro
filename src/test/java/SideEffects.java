public class SideEffects {
    public static void main(String[] args){

        int i;
        i = 0;

        if (false & (++i < 100))
            System.out.println("This string won`t be printed");
        System.out.println("If operator is executed; value of i is now " + i );

        if (false && (++i < 100))
            System.out.println("This string won`t be printed");
        System.out.println("If operator is executed; value of i is now " + i );
    }
}
