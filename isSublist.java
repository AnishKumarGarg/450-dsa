// Find whether an array is a subset of another array

import java.util.ArrayList;

public class isSublist {
    static boolean isSubset(ArrayList<Integer> superlist, ArrayList<Integer> sublist){
        return superlist.containsAll(sublist);
    }
    public static void main(String[] args) {
        ArrayList<Integer> superlist=new ArrayList<>();
        superlist.add(11);
        superlist.add(7);
        superlist.add(1);
        superlist.add(13);
        superlist.add(21);
        superlist.add(3);
        superlist.add(7);
        superlist.add(3);

        ArrayList<Integer> sublist=new ArrayList<>();
        sublist.add(11);
        sublist.add(3);
        sublist.add(7);
        sublist.add(1);
        sublist.add(7);

        if (isSubset(superlist, sublist)) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
}
