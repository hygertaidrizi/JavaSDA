package FactoryMethodPattern;

public class LandGame implements Game{
    private String title;
    private int numberOfPlayers;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    @Override
    public void printGameInfo() {
        System.out.println ("Loja ne natyre" + this.title);
        System.out.println ("Numri i lojtareve" + this.numberOfPlayers);

    }

    @Override
    public void play() {
        System.out.println ("Loja" + this.title + "me" + this.numberOfPlayers);

    }

    public LandGame(String title, int numberOfPlayers) {
        this.title = title;
        this.numberOfPlayers = numberOfPlayers;
    }
}
