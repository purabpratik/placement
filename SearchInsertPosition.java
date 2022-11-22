public class SearchInsertPosition {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 6 };
        System.out.println(searchInsert(arr, 7));
    }

    static public int searchInsert(int[] nums, int target) {

        int low = 0, high = nums.length - 1;
        int mid = high + (low - high) / 2;
        while (low <= high) {
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
            mid = high + (low - high) / 2;

        }
        return low;
    }
}
