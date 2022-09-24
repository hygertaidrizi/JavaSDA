package DetyreShpie;
import java.util.Scanner;
//krijo nje program qe gjen indexin e nje elementi ne array

public class Detyre10 {
    public static int findElementIndex(int[]array,int t) {

        if (array == null) return -1;
        int length = array.length;
        int i = 0;
        while (i<length){
            if (array[i] == t) return i;
            else i = i+1;

        }
        return -1;
    }
    public static void main (String [] args) {
        int []array = {13,66,78,598,456,328};
        System.out.println ("Indexi i 598 eshte:" + findElementIndex(array,598));
        System.out.println ("Indexi i 13 eshte:" + findElementIndex(array,13));
    }



}
