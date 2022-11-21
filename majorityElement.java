
public class majorityElement {
    public static void main(String[] args) {

        int nums[] = { 3, 1, 3, 3, 2, 1 };

        System.out.println(majority(nums));
    }

    public static int majority(int nums[]) {
        int count = 1, maj = nums[0];
        boolean flag = true;
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                maj = nums[i];
                count++;
            } else if (maj != nums[i])
                count--;
            else {
                flag = false;
                count++;
            }
        }
        if (flag)
            return -1;
        else
            return maj;
    }
}
