package FactoryMethodPattern;

public class GameFactory {
    public Game createGame(GameTypeEnum gameType){
        Game game = null;
        switch (gameType){
            case BOARD -> game = new BoardGame("Murlan", 4);
            case PC -> game = new PCGame("Ginny", true, 4);
            case LAND -> game = new LandGame("Tenis", 2);


        }
        return game;

    }
}
