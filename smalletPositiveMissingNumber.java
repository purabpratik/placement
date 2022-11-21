
import java.util.HashSet;

public class smalletPositiveMissingNumber {

    public static void main(String[] args) {
        int arr[] = { -10, 1, 3, -20, 0 };
        System.out.println(fun(arr));
    }

    static int fun(int arr[]) {

        // code here

        HashSet<Integer> hs = new HashSet<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            max = Math.max(arr[i], max);
        }
        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }

        for (int i = 1; i < max + 2; i++) {

            if (hs.contains(i))
                continue;
            else
                return i;
        }
        return -1;
    }
}
