public class Sprinkler implements Device {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void doTask() {
        System.out.println("Sprinkler is doing its task!");
        mediator.notify("sprinkler_task_done", this);
    }
}
