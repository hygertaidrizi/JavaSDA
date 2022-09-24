package polymorphism;

public class Bird extends SkyAnimal{
    @Override
    public void breathe() {
        System.out.println ("Zogu merr fryme me hunde");

    }

    @Override
    public void fly() {
        System.out.println ("Zogu fluturon ne lartesi te medha");

    }
    public void sing (){
        System.out.println ("Chirp Chirp");
    }
}
