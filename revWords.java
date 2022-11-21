
public class revWords {
    public static void main(String[] args) {

        String str = "i.like.this.program.very.much";
        System.out.println(fun(str));
    }

    static String fun(String str) {

        // code here

        int st = 0, i;

        char chars[] = str.toCharArray();

        for (i = 0; i < chars.length; i++) {
            if (chars[i] == '.') {
                reverse(chars, st, i - 1);
                st = i + 1;
            }
        }
        reverse(chars, st, str.length() - 1);
        reverse(chars, 0, str.length() - 1);

        return new String(chars);

    }

    static void reverse(char chars[], int start, int end) {

        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

            start++;
            end--;
        }
    }
}
