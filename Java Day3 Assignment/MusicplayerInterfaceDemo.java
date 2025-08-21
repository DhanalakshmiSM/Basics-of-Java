// // MusicPlayerInterfaceDemo.java
// 29. MusicPlayer Interface
// Problem: Interface MusicPlayer with play(), pause(). Implement in MP3Player and CDPlayer.
// Steps:
// 1.	Define interface.
// 2.	Implement in classes.
// 3.	Print play/pause actions.


interface MusicPlayer {
    void play();
    void pause();
}

class MP3Player implements MusicPlayer {
    @Override
    public void play() {
        System.out.println("Playing music on MP3 Player...");
    }

    @Override
    public void pause() {
        System.out.println("Pausing music on MP3 Player.");
    }
}

class CDPlayer implements MusicPlayer {
    @Override
    public void play() {
        System.out.println("Playing music on CD Player...");
    }

    @Override
    public void pause() {
        System.out.println("Pausing music on CD Player.");
    }
}

public class MusicplayerInterfaceDemo {
    public static void main(String[] args) {
        MusicPlayer mp3 = new MP3Player();
        MusicPlayer cd = new CDPlayer();

        // Test MP3 Player
        mp3.play();
        mp3.pause();

        System.out.println("---------------");

        // Test CD Player
        cd.play();
        cd.pause();
    }
}
