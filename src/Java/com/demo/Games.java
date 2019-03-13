package com.demo;

/**
 * Created by  Tang
 * Create Time 2018/6/24 下午 8:12
 */
public class Games {
    public static void getGame(GameFactory gameFactory){
        Game game = gameFactory.getGame();
        while (game.move())
            ;
    }

    public static void main(String[] args) {
        getGame(Checkers.gameFactory);
        Checkers.DOTA dota = new Checkers.DOTA();
    }
}

class Checkers implements Game{

    private Checkers(){}
    private int moves = 0;
    private int move = 4;

    @Override
    public boolean move() {
        System.out.println("Checker move "+moves);
        return ++moves != move;
    }

    static GameFactory gameFactory = new GameFactory() {
        @Override
        public Checkers getGame() {
           return new Checkers();
        }
    };

    static class DOTA implements Game{
        public  boolean move(){return false;}
        DOTA(){System.out.print("i love dota");}
    }
}
interface Game{boolean move();}
interface GameFactory{Checkers getGame();}