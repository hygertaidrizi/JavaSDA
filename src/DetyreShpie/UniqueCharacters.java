package DetyreShpie;
import java.util.Arrays;
public class UniqueCharacters{
    static boolean isUnique(String name){
       char [] letters = name.toCharArray();
       Arrays.sort(letters);
       for (int i=0; i<name.length(); i++){
           if (letters[i- 1] == letters[i]) {
               return false;
           }
        }
       return true;

    }
    public static void main (String [] args){
        String name = "abce";
        System.out.println ("String " + name);
        System.out.println ("String has all unique characters " + isUnique (name));
    }
}
//nuk ekzekutohet

