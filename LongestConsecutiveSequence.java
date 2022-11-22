import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int arr[] = { 9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6 };
        System.out.println(longestConsecutive(arr));
    }

    static public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++)
            set.add(nums[i]);

        int max = 0;

        // we are taking the first encountered element of the hashSet and checking for
        // the lower and higher value
        // by difference of 1 ("+1 and -1"), and counting the length and storing in the
        // max variable (removing the elements as well).
        for (int i = 0; i < nums.length; i++) {
            int length = 1;

            int var = nums[i]; // checking smaller(left-side) elements
            while (set.contains(--var)) {
                set.remove(var);
                length++;
            }

            var = nums[i]; // checking larger(right-ride) elements
            while (set.contains(++var)) {
                set.remove(var);
                length++;
            }
            max = Math.max(max, length);
        }
        return max;
    }
}
