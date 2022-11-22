import java.util.*;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }

    static public int[] productExceptSelf(int[] nums) {
        int res[] = new int[nums.length];
        int prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            res[i] = prefix;
            prefix *= nums[i];
            // System.out.println("prefix "+prefix);
            // System.out.println(Arrays.toString(res));
        }
        int postfix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] *= postfix;
            postfix *= nums[i];
        }
        return res;
    }
}