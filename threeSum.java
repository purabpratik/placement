
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {

    public static void main(String[] args) {
        int nums[] = { -1, 0, 1, 2, -1, -4, 10 };
        System.out.println(three(nums));
    }

    static public List<List<Integer>> three(int[] nums) {

        // code here

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int sum = 0 - nums[i];
            int low = i + 1, high = nums.length - 1;

            if (i == 0 || nums[i] != nums[i - 1]) {

                while (low < high) {

                    if (nums[low] + nums[high] > sum) {
                        high--;
                    } else if (nums[low] + nums[high] < sum) {
                        low++;
                    } else {
                        res.add(Arrays.asList(nums[i], nums[low], nums[high]));

                        while (low < high && nums[low] == nums[low + 1])
                            low++;
                        while (low < high && nums[high] == nums[high - 1])
                            high--;

                        high--;
                        low++;
                    }
                }
            }

        }
        return res;
    }
}
