public class GameManager {
  private GameStrategy gameStrategy;

  public GameManager(GameStrategy gameStrategy) {
      this.gameStrategy = gameStrategy;
  }

  public void playGame() {
      gameStrategy.initializeGame();
      gameStrategy.playingGame();
      gameStrategy.showResult();
  }
}
