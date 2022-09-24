package DetyreShpie;

public class SubString {
    public static void main (String [] args){
        String string_emri= "Hygerta";
        int emri_length = 3;
        if (emri_length > string_emri.length()){
            emri_length = string_emri.length();
        }
        String subletters = string_emri.substring(string_emri.length()-3);
        System.out.println (subletters + string_emri + subletters);
    }
}
