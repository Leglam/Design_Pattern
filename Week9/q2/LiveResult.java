public class LiveResult implements ScoreObserver {
  private String name;

  public LiveResult(String name) {
      this.name = name;
  }

  @Override
  public void updateScore(String score) {
      System.out.println("live result: " + score + " <- " + name);
  }
}