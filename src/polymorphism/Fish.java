package polymorphism;

public class Fish extends SeaAnimal{
    @Override
    public void breathe() {
        System.out.println ("Peshku merr fryme me veleza.");
    }

    @Override
    public void swim() {
        System.out.println ("Peshku noton...");

    }
    public void jump (){
        System.out.println ("Peshku kercen");

    }
}
