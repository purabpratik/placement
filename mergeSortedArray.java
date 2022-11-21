
import java.util.Arrays;

public class mergeSortedArray {

    public static void main(String[] args) {
        int nums1[] = { 1, 2, 3 };
        int nums2[] = { 2, 5, 6 };
        int n = 3, m = 3;
        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] arr1, int n1, int[] arr2, int n2) {

        // code here

        int arr3[] = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {

            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }

        while (i < n1)
            arr3[k++] = arr1[i++];

        while (j < n2)
            arr3[k++] = arr2[j++];

        System.out.println(Arrays.toString(arr3));
    }
}
