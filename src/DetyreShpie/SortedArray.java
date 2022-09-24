package DetyreShpie;

import java.util.Arrays;

public class SortedArray {
    public static void main (String [] args){
        int [] array1 = {1,2,45,666,78};
        int [] array2 = {4,2,56,23,12,467};
        int [] merged_array = new int [array1.length + array2.length];
        int index = array1.length;

        for (int i=0; i<array1.length; i++){
            merged_array[i] = array1[i];
        }
        for (int j=0; j< array2.length; j++){
            merged_array[index] = array2 [j];
            index++;
        }
        Arrays.sort(merged_array);
        for (int c=0; c< merged_array.length; c++){
            System.out.println (merged_array[c]);
        }


    }
}
