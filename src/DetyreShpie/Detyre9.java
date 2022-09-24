package DetyreShpie;

public class Detyre9 {
    public static void main(String []args){
        int [] array = {3,5,7,9,119,2000, 2022};
        int find = 2022;
        boolean check = false;

        for (int element: array){
            if (element == find){
                check = true;
                break;
            }
        }
        if (check = true){
            System.out.println (find + "u gjet");
        }
        else{
            System.out.println (find + "nuk u gjet");
        }
    }
}

