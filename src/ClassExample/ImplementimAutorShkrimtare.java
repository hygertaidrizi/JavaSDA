package ClassExample;

public class ImplementimAutorShkrimtare {
    public static void main (String [] args){
        Autor autor1 = new Autor("Ana", "Frank", 20);
        Autor autor2 = new Autor("Phil", "Commando", 34);
        Autor [] autors = new Autor[]{autor1,autor2};
        Shkrimtare shkrimtare = new Shkrimtare(autors);
        System.out.println (shkrimtare.gjejAutorin());
        System.out.println (shkrimtare.gjejAutorin1());
        System.out.println (shkrimtare.gjejAutorin2());



    }
}
