package DSA;

import java.util.Arrays;

public class decompesRunLength {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(decompressRLElist(nums)));
    }

    public static int[] decompressRLElist(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i += 2) {
            //System.out.println("i=" + i);
            for (int j = 0; j < nums[i]; j++) {
                //System.out.println("j running");
                nums[k++] = nums[i + 1] + 10;
                System.out.println(Arrays.toString(nums));
            }
        }
        return nums;
    }
}
