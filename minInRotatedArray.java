
public class minInRotatedArray {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 5, 7 };
        System.out.println(findMin(arr));
    }

    static int findMin(int arr[]) {

        // complete the function here

        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[high] > arr[mid])
                high = mid;
            else if (arr[high] < arr[mid])
                low = mid + 1;
        }

        return arr[low];
    }
}
