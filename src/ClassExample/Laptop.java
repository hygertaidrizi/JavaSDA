package ClassExample;

public class Laptop {
    //shto nje variable statik dhe nji metod statike
    public static String color = "Grey";
    public static void color (){
        System.out.println (Laptop.color);
    }
    private int ram;
    private String marka;
    private int procesori;


    public Laptop (int ram){
        this.ram = ram;
    }
    public Laptop (int ram, String marka) {
        this.ram = ram;
        this.marka = marka;
    }
    public Laptop (int ram, String marka, int procesori){
        this.ram = ram;
        this.marka = marka;
        this.procesori = procesori;
    }
    public void setRam (int ram){
        this.ram = ram;
    }
    public void setMarka (String marka){
        this.marka = marka;
    }
    public void setProcesori (int procesori){
        this.procesori = procesori;

    }
    public int getRam (){
        return ram;
    }
    public String getMarka(){
        return marka;
    }
    public int getProcesori(){
        return procesori;
    }

    private static class COLOR {
    }
}
