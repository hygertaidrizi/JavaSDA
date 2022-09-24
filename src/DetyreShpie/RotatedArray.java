package DetyreShpie;
import java.util.Arrays;

public class RotatedArray {
    public static void main (String [] args){
        int [] normal_array = {4,5,6};
        System.out.println ("Normal Array:" + Arrays.toString(normal_array));
        int [] rotated_array = {normal_array [1], normal_array [2], normal_array [0]};
        System.out.println ("Rotated Array:" + Arrays.toString(rotated_array));

    }
}
