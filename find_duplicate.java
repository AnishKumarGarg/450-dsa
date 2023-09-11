import java.util.ArrayList;

public class find_duplicate {
    static int duplicate(ArrayList<Integer> arr){
        int duplicate=0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                if(arr.get(i)==arr.get(j)){
                    duplicate=arr.get(j);
                }
            }
        }
        return duplicate;

    }
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(1);
        arr.add(3);
        arr.add(2);
        arr.add(4);
        arr.add(2);
        arr.add(2);
        System.out.println(duplicate(arr));
    }
}
