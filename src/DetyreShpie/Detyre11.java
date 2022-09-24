package DetyreShpie;
//krijo nje program qe kopjon array

public class Detyre11 {
    public static void main (String []args){
        int [] array = {10,20,30,40,44,55,66};
        int [] copy = array;
        for (int i = 0; i<array.length; i++){
            copy[i]= array [i];
        }
        for (int i : array){
            System.out.println (i + ", ");

        }
        for (int i : copy){
            System.out.println (i + ", ");
        }
    }
}
