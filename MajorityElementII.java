// Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

import java.util.ArrayList;
import java.util.Collections;

public class MajorityElementII {
    static void majorityElement(ArrayList<Integer> arr, int n) {
        ArrayList<Integer> resultArrayList = new ArrayList<>();
        int threshold = n / 3;
        for (int i = 0; i < n; i++) {
            int currentElement = arr.get(i);
            
            // Check if we have already added this element
            boolean alreadyAdded = false;
            for (int j = 0; j < resultArrayList.size(); j++) {
                if (resultArrayList.get(j) == currentElement) {
                    alreadyAdded = true;
                    break;
                }
            }
            
            if (!alreadyAdded && Collections.frequency(arr, currentElement) > threshold) {
                resultArrayList.add(currentElement);
            }
        }
        System.out.println(resultArrayList);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(2);
        arr.add(3);
        int n = arr.size();
        majorityElement(arr, n);
    }
}
