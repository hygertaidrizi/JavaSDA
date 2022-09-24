package DetyreShpie;
import java.util.Scanner;

public class CountStringWords {
    public static void main (String [] args){
        System.out.println ("Please insert a sentence: ");
        Scanner input = new Scanner (System.in);
        String text = input.nextLine();
        System.out.println ("The number of words in your sentence is: " + countWords (text));

    }

    private static int countWords(String text) {
        int count = 0;
        if (!(" ".equals(text.substring(0, 1))) || !(" ".equals(text.substring(text.length() - 1)))){
            for (int i = 0; i < text.length(); i++)
            {
                if (text.charAt(i) == ' ')
                {
                    count++;
                }
            }
            count = count + 1;
        }
        return count;
        }

    }
