package ClassExample;

public class Implementation {
    public static void main (String [] args){
        Laptop lenovo = new Laptop(8, "Lenovo", 1008);
        System.out.println (lenovo.getRam());
        System.out.println (lenovo.getMarka());
        System.out.println (lenovo.getProcesori());

        Telefon galaxy = new Telefon(8,"Galaxy", 300);
        System.out.println (galaxy.getKamera());
        System.out.println (galaxy.getMarka());
        System.out.println (galaxy.getProcesori());

        Qytet shkodra = new Qytet("Shqiperi", "Shkodra", 23546);
        System.out.println (shkodra.getShteti());
        System.out.println (shkodra.getEmri());
        System.out.println (shkodra.getSiperfaqja());


    }
}
