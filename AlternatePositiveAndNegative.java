import java.util.ArrayList;

public class AlternatePositiveAndNegative {
    static void rearrange(ArrayList<Integer> arr) {
        ArrayList<Integer> positive = new ArrayList<Integer>();
        ArrayList<Integer> negative = new ArrayList<Integer>();

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                negative.add(arr.get(i));
            } else {
                positive.add(arr.get(i));
            }
        }

        ArrayList<Integer> result = new ArrayList<Integer>();

        int positiveIndex = 0;
        int negativeIndex = 0;
        // int totalElements = arr.size();

        for (int i = 0; i < arr.size(); i++) {
            // Alternate between adding positive and negative numbers
            if (i % 2 == 0 && positiveIndex < positive.size()) {
                result.add(positive.get(positiveIndex));
                positiveIndex++;
            } else if (negativeIndex < negative.size()) {
                result.add(negative.get(negativeIndex));
                negativeIndex++;
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(9);
        arr.add(4);
        arr.add(-2);
        arr.add(-1);
        arr.add(5);
        arr.add(0);
        arr.add(-5);
        arr.add(-3);
        arr.add(2);
        // 9 4 -2 -1 5 0 -5 -3 2
        rearrange(arr);
    }
}
