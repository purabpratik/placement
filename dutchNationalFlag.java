
import java.util.Arrays;

public class dutchNationalFlag {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 0, 2, 1, 1, 0 };
        sortColors(nums);
    }

    public static void sortColors(int[] nums) {
        int countZero = 0, countOne = 0, countTwo = 0;
        for (int a : nums) {
            if (a == 0)
                countZero++;
            else if (a == 1)
                countOne++;
            else
                countTwo++;
        }
        int k = 0;
        for (int i = 0; i < countZero; i++) {
            nums[k] = 0;
            k++;
        }
        for (int i = countZero; i < countOne + countZero; i++) {
            nums[k] = 1;
            k++;
        }
        for (int i = countOne + countZero; i < countTwo + countOne + countZero; i++) {
            nums[k] = 2;
            k++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
