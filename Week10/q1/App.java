// App.java
public class App {
  public static void main(String[] args) {
      // Play Football
      Game footballGame = new Football();
      footballGame.play();

      System.out.println(); // Blank line for readability

      // Play Basketball
      Game basketballGame = new Basketball();
      basketballGame.play();
  }
}
