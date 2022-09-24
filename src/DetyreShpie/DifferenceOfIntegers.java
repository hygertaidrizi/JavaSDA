package DetyreShpie;
import java.util.Arrays;
public class DifferenceOfIntegers {
    public static void main(String[] args) {
        System.out.print("Array: ");
        int array[] = {20, 12, 3, 56, 7};
        System.out.println("Array:" + Arrays.toString(array));
        int vlera_max = array[0];
        int vlera_min = array[0];
        int i;
        for (i = 0; i < array.length; i++)
        {
        if (array[i] > vlera_max)
            vlera_max = array[i];
        else if (array[i] < vlera_min)
                vlera_min = array[i];

            }
            System.out.println("Diferenca mes vleres me te madhe dhe vleres me te vogel te array eshte:  " + (vlera_max - vlera_min));
        }
    }

