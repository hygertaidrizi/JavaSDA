package DetyreShpie;
//krijo nje program qe gjen vlerat e perseritura ne nje array
public class Detyre12 {
    public static void main(String[]args){
        int []array= {3,5,7,8,5,9,11,13,55,11};
        for (int i =0; i< array.length;i++){
            for (int j = i+1; j< array.length; j++){
                if ((array[i] == array[j]) && (i !=j)){
                    System.out.println ("Elementi i perseritur:" + array[j]);

                }
            }
        }


    }

}
