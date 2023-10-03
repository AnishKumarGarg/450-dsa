import java.util.ArrayList;

public class ThreeWayPartition {
    static ArrayList<Integer> threeWayPartition(ArrayList<Integer> arr, int a, int b){
        ArrayList<Integer> copyArr=new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i)<=a) {
                copyArr.add(arr.get(i));
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i)>a && arr.get(i)<b) {
                copyArr.add(arr.get(i));
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i)>=b) {
                copyArr.add(arr.get(i));
            }
        }
        return copyArr;
        
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(3);
        arr.add(4);
        int a=1;
        int b=2;
        System.out.println(threeWayPartition(arr, a, b));
    }
}
