package DSA;

public class missingNumber {
    public static void main(String[] args) {

        int nums[] = { 3, 0, 1 };
        System.out.println(miss(nums));
    }

    static int miss(int nums[]) {
        
        // code here
        
        int xor = 0, i;
        for (i = 0; i < nums.length; i++) {
            xor = xor ^ i ^ nums[i];
        }

        return xor ^ i;
    }

}
