
import java.util.Arrays;

public class plusOne {

    public static void main(String[] args) {
        int digits[] = { 99 };

        System.out.println(Arrays.toString(plusOnefunc(digits)));
    }

    public static int[] plusOnefunc(int[] digits) {

        // code here

        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] += carry;
            if (digits[i] <= 9) // early return
                return digits;
            digits[i] = 0;
        }
        int[] ret = new int[digits.length + 1];
        ret[0] = 1;
        return ret;
    }
}
