package DSA;

public class prefixString {

    public static void main(String[] args) {
        String str[] = { "worldhello", "world" };
        int n = str.length;
        String ans = longestCommonPrefix(str, n);
        if (ans.equals(""))

            System.out.println("-1");

        else

            System.out.println(ans);

    }

    static String longestCommonPrefix(String arr[], int n) {

        // code here

        String pre = arr[0];
        if (arr.length == 0)
            return "-1";
        for (int i = 1; i < arr.length; i++) {
            while (arr[i].indexOf(pre) != 0)
                pre = pre.substring(0, pre.length() - 1);
        }
        return pre;

    }

}
