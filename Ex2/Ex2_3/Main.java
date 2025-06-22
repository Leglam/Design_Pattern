package Ex2_3;

public class Main {
  public static void main(String[] args) {
    SortingProcessor.sortingProcessor(new SelectionSort());
    SortingProcessor.sortingProcessor(new MergeSort());
    SortingProcessor.sortingProcessor(new InsertionSort());
  }
}
