// 15. Abstract Game
// Problem: Abstract class Game with start(), play(), end(). Implement in Cricket and Football.
// Steps:
// 1.	Create abstract Game.
// 2.	Implement in subclasses with print statements.
// 3.	Call methods in order.

abstract class Game {
    abstract void start();
    abstract void play();
    abstract void end();
}

class Cricket extends Game {
    void start() {
        System.out.println("Cricket Game Started");
    }

    void play() {
        System.out.println("Playing Cricket");
    }

    void end() {
        System.out.println("Cricket Game Ended");
    }
}

class Football extends Game {
    void start() {
        System.out.println("Football Game Started");
    }

    void play() {
        System.out.println("Playing Football");
    }

    void end() {
        System.out.println("Football Game Ended");
    }
}

public class GameEx {
    public static void main(String[] args) {
        Game game1 = new Cricket();
        Game game2 = new Football();

        game1.start();
        game1.play();
        game1.end();

        game2.start();
        game2.play();
        game2.end();
    }
}
