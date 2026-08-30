import java.util.*;
 
public class dp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        int tries = scan.nextInt();
 
        for (int i = 0; i < tries; i++) {
 
            int[] nums = new int[3];
 
            nums[0] = scan.nextInt();
            nums[1] = scan.nextInt();
            nums[2] = scan.nextInt();
 
            while (true) {
 
                Arrays.sort(nums);
 
                if (nums[2] <= nums[0] + nums[1]) {
                    System.out.println(nums[2] - nums[0]);
                    break;
                }
 
                nums[2] = nums[0] + nums[1];
            }
        }
    }
}