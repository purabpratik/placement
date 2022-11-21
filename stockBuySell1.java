
public class stockBuySell1 {

    public static void main(String[] args) {
        int arr[] = { 3, 5, 1, 7, 4, 9, 3 };
        System.out.println(buySell(arr));
    }

    static int buySell(int arr[]) {

        // code here

        int buy = Integer.MAX_VALUE, sell = 0;

        for (int i = 0; i < arr.length; i++) {

            buy = Math.min(buy, arr[i]);
            System.out.println(i + " +++++++++++ ");
            System.out.println(buy);
            sell = Math.max(sell, arr[i] - buy);
            System.out.println(sell);
        }
        return sell;
    }

}
