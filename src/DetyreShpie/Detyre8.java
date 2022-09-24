package DetyreShpie;

public class Detyre8 {
    public static void main(String[] args) {
        int numrat[] = {5, 6, 8, 9, 90};
        int shuma =0;
        double mesatarja =0;

        for (int i=0; i< numrat.length; i++){
            shuma= shuma + numrat[i];

        }
        mesatarja= shuma/ numrat.length;
        System.out.println ("Mesatarja e array eshte:");

    }
}
