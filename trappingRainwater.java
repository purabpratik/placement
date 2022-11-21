
public class trappingRainwater {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2 };
        System.out.println(trap(arr));
    }

    static int trap(int arr[]) {

        // code here

        int trap = 0, target = 0;
        int r[] = new int[arr.length];
        int l[] = new int[arr.length];
        l[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            l[i] = Math.max(l[i - 1], arr[i]);
        }

        r[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--)
            r[i] = Math.max(r[i + 1], arr[i]);

        for (int i = 0; i < arr.length; i++) {
            trap = Math.min(r[i], l[i]) - arr[i];
            target += trap;
        }
        return target;
    }
}
