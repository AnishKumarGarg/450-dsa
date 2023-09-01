// Move all the negative elements to one side of the array

import java.util.ArrayList;

public class negative_to_one_side {
    static void move(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                // Move the element to the end of the ArrayList
                arr.add(arr.get(i));
                arr.remove(i);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(-2);
        list.add(3);
        list.add(-4);
        list.add(5);

        move(list);
        System.out.println(list); // Print the updated ArrayList
    }
}
