package DSA;

import java.util.Arrays;

public class targetArrayInOrder {
    public static void main(String[] args) {
        int nums[] = { 0, 1, 2, 3, 4 };
        int index[] = { 0, 1, 2, 2, 1 };

        System.out.println(Arrays.toString(createTargetArray(nums, index)));

    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        
        // code here
        
        int target[] = new int[nums.length];
        for (int i = 0; i < index.length; i++) {

            target[index[i]] = nums[i];
        }
        return target;
    }
}
