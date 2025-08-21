// SportsInterfaceDemo.java
// 23. Sports Interface
// Problem: Interface Sports with play(). Implement in Cricket and Football.
// Steps:
// 1.	Define interface.
// 2.	Implement in classes.
// 3.	Print play method.

interface Sports {
    void play();
}

class Cricket implements Sports {
    @Override
    public void play() {
        System.out.println("Playing Cricket... Batting, Bowling, and Fielding!");
    }
}

class Football implements Sports {
    @Override
    public void play() {
        System.out.println("Playing Football... Kicking the ball and scoring goals!");
    }
}

public class SportsInterfaceDemo {
    public static void main(String[] args) {
        Sports cricket = new Cricket();
        Sports football = new Football();

        // Print play method
        cricket.play();
        football.play();
    }
}
