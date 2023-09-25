// Median of 2 sorted arrays of different size

import java.util.ArrayList;
import java.util.Collections;

public class median_different {
    static void findMedian(ArrayList<Integer> arr1,ArrayList<Integer> arr2){
        arr1.addAll(arr2);
        ArrayList<Integer> mergedArrayList=new ArrayList<>(arr1);
        Collections.sort(mergedArrayList);
        double median=(double)mergedArrayList.get(mergedArrayList.size()/2);
        System.out.println(median);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr1=new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(2);

        ArrayList<Integer> arr2=new ArrayList<>();
        arr2.add(2);
        arr2.add(4);
        arr2.add(4);

        findMedian(arr1, arr2);
    }
}
