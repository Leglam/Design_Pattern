public class App {
  public static void main(String[] args) {
      System.out.println("Using Strategy Pattern:");

      GameManager footballGame = new GameManager(new FootballStrategy());
      footballGame.playGame();

      System.out.println();

      GameManager basketballGame = new GameManager(new BasketballStrategy());
      basketballGame.playGame();
  }
}
