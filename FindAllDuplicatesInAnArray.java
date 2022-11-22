import java.util.*;

public class FindAllDuplicatesInAnArray {
    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(findDuplicates(arr));
    }

    static public List<Integer> findDuplicates(int[] nums) {

        /*
         * APPROCH 1
         * TIME COMPLEXITY --> O(n)
         * SPACE COMPLEXITY --> O(n)
         */

        // HashSet<Integer> hs = new HashSet<>();
        // ArrayList<Integer> al = new ArrayList<>();
        // for (int i = 0; i < nums.length; i++) {
        // if (hs.contains(nums[i]))
        // al.add(nums[i]);
        // else
        // hs.add(nums[i]);
        // }
        // return al;
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                al.add(Math.abs(nums[i]));
            }
            else{
                nums[index]=-nums[index];
            }
            System.out.println(Arrays.toString(nums));
        }
        return al;
    }
}
