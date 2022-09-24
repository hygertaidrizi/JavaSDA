package FactoryMethodPattern;

public class Client {
    public static void main(String[] args) {
        GameTypeEnum gameType = GameTypeEnum.LAND;
        GameTypeEnum gameType2 = GameTypeEnum.PC;
        GameTypeEnum gameType3 = GameTypeEnum.BOARD;
        GameFactory factory = new GameFactory();

        Game game = factory.createGame(gameType);
        Game game1 = factory.createGame(gameType2);
        Game game2 = factory.createGame(GameTypeEnum.SEAGame);

        game2.printGameInfo();
    }
}
