package DSA;

import java.util.Arrays;

public class numSmallerThanCurrent {
    public static void main(String[] args) {
        int arr[] = { 8, 1, 2, 2, 3 };
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {

        // code here

        int ans[] = new int[nums.length];
        int count;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i == j)
                    continue;
                if (nums[i] > nums[j])
                    count++;
            }
            System.out.println("COUNT " + count);
            Arrays.fill(ans, i, i + 1, count);
            System.out.println(Arrays.toString(ans));
        }
        return ans;
    }
}
