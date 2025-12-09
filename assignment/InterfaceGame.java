package assignment;
interface Playable {
 void play();
}
class Game {
 void startGame() {
     System.out.println("Game Started!");}
 }
class Cricket extends Game implements Playable {
 public void play() {
     System.out.println("Playing Cricket!");}
}
class Football extends Game implements Playable {
 public void play() {
     System.out.println("Playing Football!");
 }
}
public class InterfaceGame {
 public static void main(String[] args) {
     Cricket c = new Cricket();
     c.startGame();
     c.play();
     Football f = new Football();
     f.startGame();
     f.play();
 }
}
