public class ForEachDemo {
    public static void main(String[] args){
//        for (type iter_variable: collection){
//            operator sequence
//        }
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        int sum = 0;

        for (int i = 0; i < nums.length; i++) sum += nums[i];

        for (int x: nums) {
            sum += x;
            if (x == 5) break;
        }
        System.out.println("sum = " + sum);
    }
}
