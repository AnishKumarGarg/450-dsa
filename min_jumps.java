public class min_jumps {
    static int minJumps(int[] arr, int l, int h) {
        if (h == l)
            return 0;

        // When nothing is reachable
        // from the given source
        if (arr[l] == 0)
            return -1;

        // Traverse through all the points
        // reachable from arr[l]. Recursively
        // get the minimum number of jumps
        // needed to reach arr[h] from these
        // reachable points.
        int min = Integer.MAX_VALUE;
        for (int i = l +1; i <= h && i <= l + arr[l]; i++ ) { // l+1 to avoid any self loop
            int jumps = minJumps(arr, i, h);
            if (jumps != Integer.MAX_VALUE && jumps + 1 < min)
                min = jumps + 1;
        }
        return min;                                                                                                      
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 7, 2, 8, 4, 6, 7, 9, 8, 2, 4 };
        int n = arr.length;
        System.out.print(
                "Minimum number of jumps to reach end is "
                        + minJumps(arr, 0, n - 1));

    }
}