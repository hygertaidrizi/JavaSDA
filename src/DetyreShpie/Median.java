package DetyreShpie;
import java.util.Arrays;
public class Median {
    public static void main (String [] args){
        int array [] = {12 , 34, 56, 76, 2, 56, 6};
        System.out.println ("Array" + Arrays.toString(array));
        System.out.println ("The median of the given array is "+ getMedian(array));
    }

    private static int getMedian(int[] array) {
        if (array.length % 2 == 0){
            int median = array.length/2;
            return (array[median] + array [median-1]) /2;
        }
        return array[array.length/2];
    }
}
