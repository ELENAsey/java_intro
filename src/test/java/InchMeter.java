public class InchMeter {
    public static void main(String[] args) {
        double meter;
        int count;
        int inch;
        int length;

        count = 0;
        length = 12 * 12;

        for (inch = 1; inch <= length; inch++) {
            meter = inch / 39.37;
            System.out.println(inch + " дюйму соотвествует " + meter + "метра. ");

            count++;

            if (count == 12) {
                System.out.println();
                count = 0;

            }
        }
    }
}
