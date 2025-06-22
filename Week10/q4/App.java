public class App {
    public static void main(String[] args) {
        Sprinkler sprinkler = new Sprinkler();
        CoffeePot coffeePot = new CoffeePot();

        ConcreteMediator mediator = new ConcreteMediator();
        mediator.registerDevice("sprinkler", sprinkler);
        mediator.registerDevice("coffeePot", coffeePot);

        Alarm alarm = new Alarm(mediator);

        alarm.doAlarm();
    }
}
