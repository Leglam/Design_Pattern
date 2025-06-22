public class App {
  public static void main(String[] args) {
    int count = 0;
      for (int i = 0; i < 5; i++) {
        for (int j = 0; j < i+1; j++) {
          count++;
          System.out.print(count);
        }
        System.out.println();
      }
  }
}