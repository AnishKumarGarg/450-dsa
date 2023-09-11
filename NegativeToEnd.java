// Move all the negative elements to one side of the array

import java.util.ArrayList;

public class NegativeToEnd{
    static void move(ArrayList<Integer> arr) {
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            if (arr.get(i) < 0) {
                arr.add(arr.get(i));
                arr.remove(i); 
              
                n--; // Reduce the size of the loop as we added an element at the end because upper bound(n) doesnt adjust itself when the elements are removed
                i--; // Adjust the index to revisit the same position
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(-1);
        list.add(-2);
        list.add(3);
        list.add(4);
        list.add(-6);
        list.add(7);
        list.add(8);
                                             
        move(list);
        System.out.println(list); // Print the updated ArrayList
    }
}