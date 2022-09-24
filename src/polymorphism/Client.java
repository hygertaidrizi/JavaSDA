package polymorphism;

public class Client {
    public static void main(String[] args) {
        SeaAnimal fish = new Fish();
        fish.swim();
        fish.breathe();
    }
}
