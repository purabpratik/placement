package DSA;

import java.util.Arrays;

public class moveZero {
    public static void main(String[] args) {

        int nums[] = { 6, 0, 0, 1, 4 };
        move(nums);
    }

    // reltive order change hora

    // static void move(int nums[]) {
    // int left = 0, right = nums.length - 1;
    // while (left < right) {
    // if (nums[left] == 0 && nums[right] == 0) {
    // right--;
    // }
    // if (nums[left] != 0 && nums[right] == 0) {
    // left++;
    // right--;
    // }
    // if (nums[left] == 0 && nums[right] != 0) {
    // int temp = nums[left];
    // nums[left] = nums[right];
    // nums[right] = temp;

    // left++;
    // right--;
    // }
    // if (nums[left] != 0 && nums[right] != 0)
    // left++;

    // }
    // System.out.println(Arrays.toString(nums));
    // }

    // without changing relative order

    static void move(int nums[]) {

        // code here

        int snowballSize = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                snowballSize++;
            else if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = 0;
                nums[i - snowballSize] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
