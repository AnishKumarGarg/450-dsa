import java.util.ArrayList;
import java.util.Collections;
public class test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int fromIndex = 2; // Index of the element to move
        int toIndex = 4;   // Index where you want to move the element

        if (fromIndex >= 0 && fromIndex < list.size() && toIndex >= 0 && toIndex < list.size()) {
            Collections.swap(list, fromIndex, toIndex); // Move the element
            System.out.println(list); // Print the updated ArrayList
        } else {
            System.out.println("Invalid indices provided.");
        }
    }
}
