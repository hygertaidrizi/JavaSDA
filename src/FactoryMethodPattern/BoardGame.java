package FactoryMethodPattern;

public class BoardGame implements Game{
    private String name;
    private int numberOfPlayers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    @Override
    public void printGameInfo() {
        System.out.println ("Loja" + this.name);
        System.out.println ("Lojtaret" + this.numberOfPlayers);

    }

    @Override
    public void play() {
        System.out.println ("Loja" + this.name + " me " +
                this.numberOfPlayers + " filloi.... ");


    }

    public BoardGame(String name, int numberOfPlayers) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
    }
}
