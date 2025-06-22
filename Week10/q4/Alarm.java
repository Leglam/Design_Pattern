public class Alarm {
    private Mediator mediator;

    public Alarm(Mediator mediator) {
        this.mediator = mediator;
    }

    public void doAlarm() {
        System.out.println("Alarm is sending events to all devices...");
        mediator.notify("sprinkler_task", null);
        mediator.notify("coffeePot_task", null);
    }

    public void endAlarm(String from) {
        System.out.println("Alarm event ended from: " + from);
    }
}
