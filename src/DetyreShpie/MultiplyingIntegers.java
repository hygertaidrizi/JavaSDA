package DetyreShpie;
import java.util.Arrays;
public class MultiplyingIntegers {
    public static void main (String [] args){
        int [] array1 = {1, 3, 12};
        System.out.println ("Array 1:" + Arrays.toString(array1));
        int [] array2 = {4, 34, 67};
        System.out.println ("Array 2:" + Arrays.toString(array2));
        for (int i = 0; i< array1.length; i++){
            int vlera1 = array1 [i];
            int vlera2 =array2 [i];
            System.out.println ("Rezultati:" + Integer.toString(vlera1 * vlera2));
        }


    }
}
