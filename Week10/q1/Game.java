public abstract class Game {
  // Template method defining the sequence of steps
  public final void play() {
      initializeGame();
      playingGame();
      showResult();
  }

  protected abstract void initializeGame();
  protected abstract void playingGame();
  protected abstract void showResult();
}