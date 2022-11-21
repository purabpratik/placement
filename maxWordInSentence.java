package DSA;

public class maxWordInSentence {

    public static void main(String[] args) {
        String str[] = { "alice and bob love leetcode", "i think so too", "this is great thanks very much" };
        System.out.println(mostWordsFound(str));
    }

    public static int mostWordsFound(String[] sentences) {

        // code here

        int max = 0;
        for (int i = 0; i < sentences.length; i++) {
            int len = (sentences[i].split(" ")).length;
            System.out.println(len);
            if (max < len) {
                max = len;
                System.out.println(max);
            }

        }
        return max;
    }
}
