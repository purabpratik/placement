package DSA;

import java.util.ArrayList;

public class closestString {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();
        s.add("the");
        s.add("quick");
        s.add("brown");
        s.add("fox");
        s.add("quick");

        String word1 = "the";
        String word2 = "fox";

        System.out.println(shortestDistance(s, word1, word2));
    }

    static int shortestDistance(ArrayList<String> s, String word1, String word2) {
        
        // code here

        int index1 = s.lastIndexOf(word1);
        int index2 = s.lastIndexOf(word2);

        if (index1 > index2)
            return index1 - index2;
        else
            return index2 - index1;
    }
}
