public class FactoryMethodGOFDemo {
    public static void main(String[] args) {
        AutomobileDisplay myDisplay = AutomobileDisplayFactory.createAutomobileDisplay("Ford");
        myDisplay.displayAutomobile();
        AutomobileDisplay myDisplay2 = AutomobileDisplayFactory.createAutomobileDisplay("Toyota");
        myDisplay2.displayAutomobile();
    }
}
