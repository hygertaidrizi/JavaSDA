package ClassExample;

public class ImplementKontinent {
    public static void main (String [] args){
        Kontinent kontinent = new Kontinent("Europe", 234756938, 76, 65, "Earth");
        System.out.println (kontinent.getEmri());
        System.out.println (kontinent.getSiperfaqja());
        System.out.println (kontinent.getNumriShteteve());
        System.out.println (kontinent.planeti());


    }
}
