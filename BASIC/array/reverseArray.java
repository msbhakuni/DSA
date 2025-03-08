
import java.util.*;
class reverseArray {
    public static void main(String[] args) {
        Integer arr[] = {2,4,6,8};
        Collections.reverse(Arrays.asList(arr));
        for(int x : arr)
            System.out.print(x+" ");
    }
}