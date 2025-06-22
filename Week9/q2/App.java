import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        FootballScoreReporter reporter = new FootballScoreReporter();

        // ลงทะเบียนรับผลไว้ 2 คน
        ScoreObserver observer1 = new LiveResult("Observer 1");
        ScoreObserver observer2 = new LiveResult("Observer 2");

        reporter.registerObserver(observer1);
        reporter.registerObserver(observer2);

        System.out.println("Enter Score (e.g., Thai 1-0 UAE), or press Enter to quit:");

        while (true) {
            System.out.print("Enter Score: ");
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                System.out.println("Exiting...");
                break;
            }

            reporter.setScore(input);
        }

        scanner.close();
    }
}
