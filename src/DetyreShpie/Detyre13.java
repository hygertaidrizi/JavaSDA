package DetyreShpie;

public class Detyre13 {
    public static void main(String[]args){
        String []array= {"abc","bce","abc","abd","ahg","ugh","abr","ugh"};
        for (int i =0; i< array.length;i++){
            for (int j = i+1; j< array.length; j++){
                if ((array[i]== array[j]) && (i !=j)){
                    System.out.println ("Elementi i perseritur:" + array[j]);

                }
            }
        }


    }
}
