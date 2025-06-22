import java.util.ArrayList;
import java.util.List;

public class FootballScoreReporter {
    private List<ScoreObserver> observers = new ArrayList<>();
    private String latestScore;

    public void registerObserver(ScoreObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (ScoreObserver observer : observers) {
            observer.updateScore(latestScore);
        }
    }

    public void setScore(String score) {
        this.latestScore = score;
        notifyObservers();
    }
}