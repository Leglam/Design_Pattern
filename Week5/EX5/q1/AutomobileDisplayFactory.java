public class AutomobileDisplayFactory {
  public static AutomobileDisplay createAutomobileDisplay(String AutomobileType) {
    switch (AutomobileType) {
      case "Ford":
        return new FordDisplay();
      case "Toyota":
        return new ToyotaDisplay();
      default:
        return null;
    }
  }
}
