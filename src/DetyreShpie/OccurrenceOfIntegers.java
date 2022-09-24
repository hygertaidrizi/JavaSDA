package DetyreShpie;

import java.util.Arrays;

public class OccurrenceOfIntegers {
    public static void main (String [] args){
        int array [] = {1, 2, 3, 4, 3, 2, 1};
        int rezultati;
        System.out.println ("Array " + Arrays.toString(array));
        rezultati = getSingleNumber (array);
        System.out.println ("\n" + rezultati + " shfaqet vetem nje here");

    }

    private static int getSingleNumber(int[] array) {
        if (array == null || array.length ==0){
            return -1;
        }
        int rezultati = 0;
        for (int i =0; i< array.length; i++){
            rezultati ^= array [i];
        }
        return rezultati;
    }
}
