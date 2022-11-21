package DSA;

import java.util.Arrays;

public class containsDuplicate {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 1 };
        System.out.println(duplicate(nums));
    }

    // static boolean duplicate(int nums[]) {

    // for (int i = 0; i < nums.length; i++) {
    // for (int j2 = 0; j2 < nums.length; j2++)

    // {

    // if (i == j2)
    // continue;
    // else {
    // if (nums[i] == nums[j2])
    // return true;
    // }
    // }
    // }
    // return false;
    // }

    // TLE aa gaya

    // APPROCH 2

    static boolean duplicate(int nums[]) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == nums[i + 1])
                return true;

        }

        return false;
    }

    // APPROCH 3 -- HASHSET USSE KARO

}
