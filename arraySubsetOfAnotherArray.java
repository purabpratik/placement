package DSA;

import java.util.HashSet;

public class arraySubsetOfAnotherArray {
    public static void main(String[] args) {

        int a1[] = { 1, 2, 3, 4,  6 };
        int a2[] = { 1, 2, 4 };

        System.out.println(isSubset(a1, a2));

    }

    static String isSubset(int arr1[], int arr2[]) {
        HashSet<Integer> hs = new HashSet<>();
        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            hs.add(arr2[i]);
        }

        for (int i = 0; i < arr1.length; i++) {
            if (hs.contains(arr1[i]))
                count++;
        }

        if (count == arr2.length)
            return "Yes";
        else
            return "No";
    }
}