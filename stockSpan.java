
import java.util.Arrays;

public class stockSpan {
    public static void main(String[] args) {

        int arr[] = { 10, 4, 5, 90, 120, 80 };
        System.out.println(Arrays.toString(span(arr)));
    }

    static int[] span(int arr[]) {

        // code here

        int res[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            int count = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] > arr[j])
                    count++;
                else
                    break;
            }
            res[i] = count;

            // System.out.println(Arrays.toString(res));

        }

        res[0] = 1;
        return res;
    }
}
